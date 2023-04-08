package JavaSQL;

import java.sql.*;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) throws SQLException {
        String  description,
                prodNum;
        double  price;
        final String DB_URL = "jdbc:derby:CoffeeDB";
        Scanner keyboard = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(DB_URL);
            System.out.println("Podaj opis kawy:");
            description = keyboard.nextLine();
            System.out.println("Podaj numer produktu:");
            prodNum = keyboard.nextLine();
            System.out.println("Podaj cenę:");
            price = keyboard.nextDouble();

            Statement stmt = conn.createStatement();
            String sqlStatement = "INSERT INTO Coffee " + "(ProdNum, Price, Description) " + "VALUES (" + prodNum
                                    + "," + price + "," + description + ")";

            int rows = stmt.executeUpdate(sqlStatement);
            System.out.println("Liczba wierszy dodanych do tabeli: " + rows + ".");

            conn.close();
        }
        catch (Exception ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }
}
