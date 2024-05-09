package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class deletetc {
    public deletetc(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
       Vector st = (Vector)removetc.vData.elementAt(removetc.selectedrow);
      String sql = "delete from teacher where id =\""+st.elementAt(0)+"\""; 
      stm.executeUpdate(sql);
     removetc.model.fireTableDataChanged();
    } catch (Exception e) {
        // TODO Auto-generated catch block
       e.printStackTrace();
    }
    
}
}
