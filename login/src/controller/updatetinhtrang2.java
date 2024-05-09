package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class updatetinhtrang2 {
    public updatetinhtrang2(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql2 = "update donphuckhao set tinhtrang = 'da xem' WHERE tinhtrang = 'chua xem' and id ='"+viewAdmin.idhomthu+"' ;";
      stm.executeUpdate(sql2);
    stm.close();
    con.close();
    }
  
catch(Exception e){
System.out.println(e.getMessage());
    
}
}
}
