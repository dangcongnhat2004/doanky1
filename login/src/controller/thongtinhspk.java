package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class thongtinhspk {
    public thongtinhspk(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select ten , namsinh , diemuutien , diemvan , diemtoan , diemtienganh from student s inner join diemthi k on s.id = k.id and k.id = '"+viewAdmin.idhomthu+"';"; 
      ResultSet rst =  stm.executeQuery(sql);
   while (rst.next()){
    viewthu.ten = rst.getString(1);
    viewthu.namsinh = rst.getString(2);
    viewthu.diemuutien = rst.getString(3);
    viewthu.diemvan = rst.getString(4);
    viewthu.diemtoan = rst.getString(5);
    viewthu.diemtienganh = rst.getString(6);
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
