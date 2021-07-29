import java.sql.DriverManager;

public class Connection {

    public static void main(String[]args) throws CloneNotSupportedException {

        String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
        Connection conn = null;

        try{
            conn = (Connection) DriverManager.getConnection(urlConnection, "root", "password");
            System.out.println("SUCESSO");
        } catch (Exception e) {
            System.out.println("FALHAR!");
        } finally {
            conn.clone();
        }
    }
}
