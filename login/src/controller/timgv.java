package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class timgv {
    public timgv(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select * from teacher where id =\""+viewAdmin.tkgv+"\""; 
      ResultSet rst =  stm.executeQuery(sql);
   while (rst.next()){
        ttgv.idgv=rst.getString(1) ;
        ttgv.namegv =rst.getString(2) ;
        ttgv.namsinhgv=rst.getString(3) ;
        ttgv.chucvu=rst.getString(4) ;
        ttgv.taikhoangv=rst.getString(5) ;
        ttgv.mkgv =rst.getString(6) ;
        if(ttgv.idgv.equals("null")){
          ttgv.ktra=0;
        }
        else 
          ttgv.ktra = 1;
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
