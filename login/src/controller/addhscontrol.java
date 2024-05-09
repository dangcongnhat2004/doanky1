package controller;
import DAO.dao;
import view.*;
import java.sql.*;
import javax.swing.*;
public class addhscontrol extends JFrame{
  private String check;
  public addhscontrol () {
		
    try {
        dao db = new dao();
        Connection con = db.getConnect();


       String sql2 = "select count(*) from student where id ='"+addhs.ids+"';";
       Statement smt = con.createStatement();
       ResultSet rs =   smt.executeQuery(sql2);
       ResultSetMetaData rsm = rs.getMetaData();
       int col_num = rsm.getColumnCount();
       while(rs.next()){
       for(int i = 1 ; i<= col_num ; i++)
        check = rs.getString(i);
        }
       if(check.equals("1")){
        JOptionPane.showMessageDialog(rootPane, "đã tồn tại học sinh mang id này !!","enter error",
        JOptionPane.ERROR_MESSAGE);
        new addhs("thêm học sinh","", "", "", 0.0, "", "", "");
       }
       else { 
        String sql = "insert into student values";
        String id = "('"+addhs.ids+"',";
        String name = "'"+addhs.names+"',";
        String gt =""+ addhs.gtst+",";
        String namsinh ="'"+ addhs.ngaysinhs+"',";
        String diemuutien =""+ addhs.diemuutien +",";
        String phongthinguvan = "'"+addhs.phongthinguvan+"',";
        String phongthitoan = "'"+addhs.phongthitoan+"',";
        String phongthitienganh = "'"+addhs.phongthitienganh+"');";
        Statement sm = con.createStatement();
          sm.executeUpdate(sql+id+name+gt+namsinh+diemuutien+phongthinguvan+phongthitoan+phongthitienganh);
       }
        con.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}
}
