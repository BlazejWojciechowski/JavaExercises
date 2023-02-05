package JavaSQL;

import java.sql.*;
import java.util.Scanner;

public class SelectAndUpdate
{
    public static void main(String[] args) throws SQLException
    {
        String  prodNum;
        double  price;

        final String DB_URL = "jdbc:derby:CoffeeDB";

        Scanner keyboard = new Scanner(System.in);

        try
        {
            Connection conn = DriverManager.getConnection(DB_URL);
            Statement stmt = conn.createStatement();

            System.out.println("Podaj numer produktu");
            prodNum = keyboard.nextLine();

            if (findAndDisplayProduct(stmt, prodNum))
            {
                System.out.println("Podaj nową cenę: ");
                price = keyboard.nextDouble();
                updatePrice(stmt, prodNum, price);
            }
            else
                System.out.println("Produktu nie znaleziono");


            conn.close();
        }
        catch (Exception ex)
        {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }

    public static boolean findAndDisplayProduct(Statement stmt, String prodNum) throws SQLException
    {
        boolean productFound;

        String sqlStatement = "SELECT * FROM Coffee WHERE Prodnum = '" + prodNum + "'";
        ResultSet result = stmt.executeQuery(sqlStatement);

        if (result.next())
        {
            System.out.println("Opis: " + result.getString("Description"));
            System.out.println("Numer produktu: " + result.getString("ProdNum"));
            System.out.println("Cena: " + result.getDouble("Price"));

            productFound = true;
        }
        else
            productFound = false;

        return productFound;
    }

    public static void updatePrice(Statement stmt, String prodNum, double price) throws SQLException
    {
        String sqlStatement = "UPDATE Coffee SET Price = " + Double.toString(price) +
                                " WHERE ProdNum = '" + prodNum + "'";

        int rows = stmt.executeUpdate(sqlStatement);

        System.out.println("Liczba zaktualizowanych wierszy: " + rows + ".");
    }
}
