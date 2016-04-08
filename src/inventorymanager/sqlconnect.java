package inventorymanager;

import java.sql.*;

public class sqlconnect 
{

    Connection Connections() {
      String url = "jdbc:mysql://localhost:3306/";
      String dbName = "system";
      String driver = "com.mysql.jdbc.Driver";
      String userName = "root"; 
      String password = "12345";
      Connection conn = null; 
      try {
     // Class.forName(driver).newInstance();
      conn = DriverManager.getConnection(url+dbName,userName,password);
      
     //Statement st = conn.createStatement();
      //ResultSet res = st.executeQuery("SELECT * FROM  login");
 
     
      
      } catch (Exception e) {
      e.printStackTrace();
      }
      System.out.println("successful"); //To change body of generated methods, choose Tools | Templates.
        return conn ;
    }
     
      }

