package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class timphongvipham {
    public timphongvipham(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
 String phongthi;
if(ghichu.monvp.equals("toán")){
    phongthi ="phongthitoan";
}
else if(ghichu.monvp.equals("ngữ văn")){

phongthi ="phongthinguvan";
}
else phongthi ="phongthitienganh";
      String sql = "select "+phongthi+" from student where id =\""+ghichu.idhs+"\""; 
      ResultSet rst =  stm.executeQuery(sql);
   while (rst.next()){
    ghichu.phongthivp = rst.getString(1);
    System.out.println(ghichu.phongthivp);
    new ghivaodb();
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
