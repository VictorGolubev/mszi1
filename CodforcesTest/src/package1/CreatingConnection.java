package package1;

public class CreatingConnection {
 
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            System.out.println("’уево");
        	e.printStackTrace();
        }
    }
}