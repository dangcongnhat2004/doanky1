package controller;
import DAO.dao;
import view.ghichu;
import view.*;
import java.sql.*;
import java.awt.*;
import javax.swing.*;

public class xuatdonphuckhao extends JFrame {
  public xuatdonphuckhao () {
		
    try {
        if(phuckhao.chonnguvan.equals("")&&phuckhao.chontoan.equals("")&&phuckhao.chontienganh.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Bạn cần phải chọn môn để phúc khảo.","report error",
              JOptionPane.ERROR_MESSAGE);
        }
        else {
            dao db = new dao();
            Connection con = db.getConnect();
        String sql = "insert into donphuckhao values";
     String noidungtieude = "('"+phuckhao.nodungtieude.getText()+"',";
     String id = "'"+viewstudent.id+"',";
     String monphuckhao ="'"+ phuckhao.chonnguvan + " "+ phuckhao.chontoan +" "+ phuckhao.chontienganh +"',";
     String tinhtrang = "'chua xem');";
     String noidung = "'"+phuckhao.jta.getText()+"',";
     Statement sm = con.createStatement();
       sm.executeUpdate(sql+noidungtieude+id+monphuckhao+noidung+tinhtrang);
        
        con.close();
        }
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        JOptionPane.showMessageDialog(rootPane, "Bạn đã phúc khảo rồi.","report error",
              JOptionPane.ERROR_MESSAGE);
        //e.printStackTrace();
    }
    
}
}
