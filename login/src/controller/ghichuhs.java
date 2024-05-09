package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
import javax.swing.*;
public class ghichuhs extends JFrame{
    public ghichuhs(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select * from student where id =\""+ghichu.ghichuint+"\""; 
      ResultSet rst =  stm.executeQuery(sql);
      ghichu.ktra=0;
   while (rst.next()){
    ghichu.ktra = 1;
        ghichu.idhs=rst.getString(1) ;
        ghichu.namehs =rst.getString(2) ;
        ghichu.namsinhhs=rst.getString(4) ;
        ghichu.diemuutien=rst.getString(5) ;
        ghichu.nguvan=rst.getString(6) ;
        ghichu.toan =rst.getString(7) ;
        ghichu.tienganh =rst.getString(8) ;
    } 
    if(ghichu.ktra==0){
      JOptionPane.showMessageDialog(rootPane, "Không tìm thấy học sinh  !!","search error",
      JOptionPane.ERROR_MESSAGE);
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
