package controller;
import DAO.dao;
import model.*;
import view.*;
import java.sql.*;
import javax.swing.*;
public class addteachercontrol extends JFrame {
  private String check;
  public addteachercontrol () {
		
    try {
        dao db = new dao();
        Connection con = db.getConnect();

       String sql2 = "select count(*) from teacher where id ='"+Addteachers.idv+"';";
       Statement smt = con.createStatement();
       ResultSet rs =   smt.executeQuery(sql2);
       ResultSetMetaData rsm = rs.getMetaData();
       int col_num = rsm.getColumnCount();
       while(rs.next()){
       for(int i = 1 ; i<= col_num ; i++)
        check = rs.getString(i);
        }
       if(check.equals("1")){
        JOptionPane.showMessageDialog(rootPane, "đã tồn tại giáo viên mang id này !!","enter error",
        JOptionPane.ERROR_MESSAGE);
        new Addteachers("" , "" , "" , "", 
        "" , "" );
       }
       else { 
        String sql = "insert into teacher values";
        String id = "('"+Addteachers.idv+"',";
        String name = "'"+Addteachers.tenv+"',";
        String namsinh ="'"+ Addteachers.namsinhv+"',";
        String chucvu = "'"+Addteachers.chucvuv+"',";
        String taikhoan = "'"+Addteachers.taikhoanv+"',";
        String matkhau = "'"+Addteachers.matkhauv+"');";
        Statement sm = con.createStatement();
          sm.executeUpdate(sql+id+name+namsinh+chucvu+taikhoan+matkhau);
       }
        con.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}
}
