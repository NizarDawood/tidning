import javax.swing.*;
        import java.sql.*;

public class databaseconnection {
    public static <SQLQuery> void main(String[] args) {
        Connection conn = null;
        String user = "te20";
        JPasswordField pf = new JPasswordField();
        JOptionPane.showConfirmDialog(null, pf, "password?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        String password = new String(pf.getPassword());


        try {
            conn = DriverManager.getConnection("jdbc:mysql://db.umea-ntig.se:3306/te20? " +
                    "allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", user, password);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement stmt = conn.createStatement();
            String SQLQuery = "SELECT * FROM ndtidning ";
            ResultSet result = stmt.executeQuery(SQLQuery);

            ResultSetMetaData metadata = result.getMetaData();

            int numCols = metadata.getColumnCount();
            for (int i = 1; i <= numCols; i++) {
                System.out.println(metadata.getColumnClassName(i));
            }

            while (result.next()) {
                String output = "";
                output += result.getInt("id") + ", " +
                        result.getString("content") + ", " +
                        result.getString("title");
                //result.getTimestamp()

                System.out.println(output);
            }
            String inputSQLQuery = "INSERT INTO ";
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
