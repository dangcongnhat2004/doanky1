package controller;
import DAO.dao;
import view.editdiem;
import view.nhapdiem;
import view.thongtinhs;
import javax.swing.*;
import java.sql.*;
public class nhapdiemhs extends JFrame {
  private String check ;
  public nhapdiemhs () {
		
    try {
        dao db = new dao();
        Connection con = db.getConnect();
        String sql = "insert into diemthi values";
        if(thongtinhs.dieuhuong==1){
          String id = "('"+editdiem.ids+"',";
          String diemvan = ""+editdiem.diemnguvan+",";
          String diemtoan =""+ editdiem.diemtoan+",";
          String diemtienganh =""+ editdiem.diemtienganh + ");";
          Statement sm = con.createStatement();
            sm.executeUpdate(sql+id+diemvan+diemtoan+diemtienganh);
             con.close();
        }
        String sql2 = "select count(*) from student where id ='"+nhapdiem.idst+"';";
        Statement smt = con.createStatement();
        ResultSet rs =   smt.executeQuery(sql2);
        ResultSetMetaData rsm = rs.getMetaData();
        int col_num = rsm.getColumnCount();
        while(rs.next()){
        for(int i = 1 ; i<= col_num ; i++)
         check = rs.getString(i);
         }
        if(check.equals("1")){
          String id = "('"+nhapdiem.idst+"',";
          String diemvan = ""+nhapdiem.diemnguvanst+",";
          String diemtoan =""+ nhapdiem.diemtoanst+",";
          String diemtienganh =""+ nhapdiem.diemtienganhst + ");";
     
          Statement sm = con.createStatement();
            sm.executeUpdate(sql+id+diemvan+diemtoan+diemtienganh);
        }
        else { 
           JOptionPane.showMessageDialog(rootPane, "không tìm thấy học sinh","enter error",
       JOptionPane.ERROR_MESSAGE);
       new nhapdiem();
        }
        con.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}
}
