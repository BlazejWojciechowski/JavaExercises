package JavaSQL;

import java.sql.*;
import java.util.Scanner;

public class SelectAndDelete
{
    public static void main(String[] args) throws SQLException
    {
        String  prodNum;
        String sure;

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
                System.out.println("Czy na pewno chcesz usunąć produkt? (t/n): ");
                sure = keyboard.nextLine();

                if (Character.toUpperCase(sure.charAt(0)) == 'T')
                    deleteCoffee(stmt, prodNum);
                else
                    System.out.println("Nie usunięto produktu.");
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

    public static void deleteCoffee(Statement stmt, String prodNum) throws SQLException
    {
        String sqlStatement = "DELETE FROM Coffee WHERE ProdNum = '" + prodNum + "'";

        int rows = stmt.executeUpdate(sqlStatement);

        System.out.println("Liczba zaktualizowanych wierszy: " + rows + ".");
    }
}
