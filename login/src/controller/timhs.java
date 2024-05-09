package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class timhs {
    public timhs(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select * from student where id =\""+viewAdmin.tkhs+"\""; 
      ResultSet rst =  stm.executeQuery(sql);
      tths.ktra=0;
   while (rst.next()){
        tths.idhs=rst.getString(1) ;
        tths.namehs =rst.getString(2) ;
        tths.gtstr =rst.getString(3) ;
        tths.namsinhhs=rst.getString(4) ;
        tths.diemuutien=rst.getString(5) ;
        tths.nguvan=rst.getString(6) ;
        tths.toan =rst.getString(7) ;
        tths.tienganh =rst.getString(8) ;
        // if(tths.idhs.equals("null")){
        //   tths.ktra=0;
        // }
        // else 
        if(tths.gtstr.equals("0")){
            tths.gtstr = "Nu";
        }
        else {
            tths.gtstr = "Nam";
        }
          tths.ktra = 1;
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
