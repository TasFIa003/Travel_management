/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticket_management2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.io.File;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP Pavilion
 */
public class transfertomysql1 {
    Connection con=null;
    private String username;
    private String password;
    private String email;
    private String mobileno;
    
    
    
    public void fileread()
    {
        
        
      /*  try{
            File file=new File("F:/java/project1/admin.txt");
            Scanner scanner=new Scanner(file);
            
            while(scanner.hasNext())
            {
                 username=scanner.next();
                password=scanner.next();
                //System.out.println("ID: "+name+"Name: "+salary);
                 email=scanner.next();
                 mobileno=scanner.next();
                
               //System.out.println(username+"\t"+password+"\t"+email+"\t"+mobileno);
               savedata();
            }
            scanner.close();
        
        
        }catch(Exception e)
        {
            System.out.println(e);
        }
            */
        
    
    
    }
    private void savedata()
    {
       /* Connection con=connect();
        try {
            
           
            
            
         PreparedStatement pst=(PreparedStatement)con.prepareStatement("INSERT INTO trainbook values(?,?,?,?)");
            
            pst.setString(1, username);
             pst.setString(2, password);
              pst.setString(3, email);
               pst.setString(4, mobileno);
                pst.executeUpdate();
                 
               
               
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(transfertomysql1.class.getName()).log(Level.SEVERE, null, ex);
        } */
    
    }
    
    private Connection connect()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
             return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/booking","root","");
        
        } catch (ClassNotFoundException ex) { 
            Logger.getLogger(transfertomysql1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(transfertomysql1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
    
    
    }
    
}
class fdemo
        {
    
        public static void main(String[] args) {
            transfertomysql1 result=new transfertomysql1();
            try{
                result.fileread();
            
            }catch(Exception e)
            {
                System.out.println(e);
            }
            
        
    }

}


