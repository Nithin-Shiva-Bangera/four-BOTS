/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nithin S Bangera
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Javaconnect 
{ 
    Connection conn;
    
    public static Connection ConnecrDb()
    {
    try
    {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc.sqlite:C:\\Users\\Nithin S Bangera\\Documents\\NetBeansProjects\\Library Management System\\LibraryMS.sqlite");
        return conn;
    }catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}
}
