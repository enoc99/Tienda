
package hola;
import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3307/abarrotes","root","usbw");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
    
    
}
