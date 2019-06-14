/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elsham.palace;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Java_connect {
    
    public static Connection connect() 
    {
        try {
                Class.forName("org.sqlite.JDBC");                 
                Connection c = DriverManager.getConnection("jdbc:sqlite:F:\\elsham palace\\atelier.sqlite");
          
          //  JOptionPane.showMessageDialog(null, "تم تشغيل البرنامج");
           return c;
        } catch (SQLException ex) {
              
         JOptionPane.showMessageDialog(null," no connection");   
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(Java_connect.class.getName()).log(Level.SEVERE, null, ex);
            }
       return null;
  
    }   
   
    
    
}
