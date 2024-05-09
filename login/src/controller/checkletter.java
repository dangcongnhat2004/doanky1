package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class checkletter {
    public checkletter(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select count(tinhtrang) from donphuckhao where tinhtrang = 'chua xem';"; 
      ResultSet rst =  stm.executeQuery(sql);
   while (rst.next()){
       viewAdmin.letter = rst.getInt(1);
    } 
    rst.close();
    stm.close();
    con.close();
    }
  
catch(Exception e){
System.out.println(e.getMessage());
    
}
}
}
