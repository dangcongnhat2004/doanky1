package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class deletehsviewtc {
    public deletehsviewtc(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
        if(thongtinhs.dieuhuong==1){
            Vector st = (Vector)thongtinhs.vData.elementAt(thongtinhs.selectedrow);
            String sql = "delete from diemthi where id =\""+st.elementAt(0)+"\""; 
            stm.executeUpdate(sql);
           thongtinhs.model.fireTableDataChanged();
        }
       Vector st = (Vector)viewAdmin.vData.elementAt(viewAdmin.selectedrow);
      String sql = "delete from student where id =\""+st.elementAt(0)+"\""; 
      stm.executeUpdate(sql);
     viewAdmin.model.fireTableDataChanged();
    } catch (Exception e) {
        // TODO Auto-generated catch block
       e.printStackTrace();
    }
    
}
}
