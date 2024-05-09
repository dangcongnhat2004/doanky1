package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class updatetinhtrang {
    public updatetinhtrang(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select * from donphuckhao where tinhtrang = 'chua xem' and id ='"+viewAdmin.idhomthu+"' ;"; 
      ResultSet rst =  stm.executeQuery(sql);
   while (rst.next()){
    viewthu.noidungtieude = rst.getString(1);
    viewthu.monphuckhao  = rst.getString(3);
    viewthu.ghichu = rst.getString(4);
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
