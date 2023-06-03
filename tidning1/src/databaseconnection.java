import javax.swing.*;
import java.sql.*;

public class databaseconnection {
    public static void main(String[] args) {
        Connection conn = null;
        String user = "te20";
        JPasswordField pf = new JPasswordField();
        JOptionPane.showConfirmDialog(null, pf, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String password = new String(pf.getPassword());

        try {
            conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? " +
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement stmt = conn.createStatement();
            String SQLQuery = "SELECT * FROM ndtidning ";
            ResultSet result = stmt.executeQuery(SQLQuery);

            StringBuilder sportData = new StringBuilder();
            StringBuilder teknikData = new StringBuilder();
            StringBuilder dagensData = new StringBuilder();

            while (result.next()) {
                int id = result.getInt("id");
                String titel = result.getString("titel");
                String content = result.getString("content");
                String author = result.getString("author");
                String datum = result.getString("datum");

                String output = "----" + id + ", " + titel + ", " + content + ", " + author + ", " + datum;
                switch (id) {
                    case 1:
                        sportData.append(output).append("\n");
                        break;
                    case 2:
                        teknikData.append(output).append("\n");
                        break;
                    case 3:
                        dagensData.append(output).append("\n");
                        break;
                    default:
                        break;
                }
            }

            System.out.println("Sport Data:\n" + sportData.toString());
            System.out.println("Teknik Data:\n" + teknikData.toString());
            System.out.println("Dagens Data:\n" + dagensData.toString());

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
