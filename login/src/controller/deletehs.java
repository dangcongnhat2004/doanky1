package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class deletehs {
    public deletehs(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
 Statement stmm = con.createStatement();
 Statement sttt = con.createStatement();
 Statement smm = con.createStatement();
       Vector st = (Vector)viewAdmin.vData.elementAt(viewAdmin.selectedrow);
     // String sql = "delete from student where id =\""+st.elementAt(0)+"\""; 
     String sql = "delete from student where id ="+"'"+st.elementAt(0)+"'; "; 
     String sql2 = "delete from studentvipham where id ="+"'"+st.elementAt(0)+"'; "; 
     String sql3 = "delete from donphuckhao where id ="+"'"+st.elementAt(0)+"'; "; 
     String sql4 = "delete from diemthi where id ="+"'"+st.elementAt(0)+"'; "; 
     stm.executeUpdate(sql);
      stmm.executeUpdate(sql2);
      sttt.executeUpdate(sql3);
      smm.executeUpdate(sql4);
     viewAdmin.model.fireTableDataChanged();
    } catch (Exception e) {
        // TODO Auto-generated catch block
       e.printStackTrace();
    }
    
}
}
