package controller;
import DAO.dao;
import java.sql.*;
import view.*;
import javax.swing.*;
public class logincontroltc extends JFrame {
    public static String tk;
    public logincontroltc(){
        try {
            dao db = new dao();
            Connection con = db.getConnect();
         Statement sm = con.createStatement();
         ResultSet rs = sm.executeQuery("select count(*) from teacher  where taikhoan ='"+login.us+"' and matkhau = '"+login.pa+"';");
         ResultSetMetaData rsm = rs.getMetaData();
         int col_num = rsm.getColumnCount();
         while(rs.next()){
         for(int i = 1 ; i<= col_num ; i++)
         tk = rs.getString(i);
          }
         con.close();
         if(tk.equals("1")){
            new teacherview();
         }
         else {

            new login();
            JOptionPane.showMessageDialog(rootPane, "sai tài khoản hoặc mật khẩu","login error",
        JOptionPane.ERROR_MESSAGE);
         }
         
     } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        
    
    }
}
