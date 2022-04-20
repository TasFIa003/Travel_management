
package ticket_management2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class jdbcconnection {
     public static Connection con(){
         Connection con=null;
         try{
             Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
            // JOptionPane.showMessageDialog(null,"connected!!!!");
         
         }catch(Exception ex)
         {
             System.out.println("error"+ex);
         }
    
    
   return con;
}
    
}
