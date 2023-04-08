package JavaSQL;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException {
        double  lowest = 0.0,
                highest = 0.0,
                average = 0.0;

        final String DB_URL = "jdbc:derby:CoffeeDB";

        try {
        Connection conn = DriverManager.getConnection(DB_URL);
        Statement stmt = conn.createStatement();

        String minStatemant = "SELECT MIN(Price) FROM Coffee";
        String maxStatemant = "SELECT MAX(Price) FROM Coffee";
        String avgStatemant = "SELECT AVG(Price) FROM Coffee";

        ResultSet minResult = stmt.executeQuery(minStatemant);
        if (minResult.next())
            lowest = minResult.getDouble(1);

        ResultSet maxResult = stmt.executeQuery(maxStatemant);
        if (maxResult.next())
            highest = minResult.getDouble(1);

        ResultSet avgResult = stmt.executeQuery(avgStatemant);
        if (avgResult.next())
            average = minResult.getDouble(1);

        System.out.printf("Najnizsza cena: %.2f złotego.\n Najwyższa cena: %.2f złotego.\nŚrednia cena: %.2f złotego."
                            , lowest, highest, average);
        conn.close();
        }
        catch (Exception ex) {
            System.out.println("Błąd: " + ex.getMessage());
        }
    }
}
