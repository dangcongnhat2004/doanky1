package controller;
import java.sql.*;
import view.*;
import DAO.*;
import javax.swing.*;
public class tracuu extends JFrame{
    public int q =0;
    public tracuu(){
    try {
        viewstudent.dieuhuongrp=1;
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select * from student  q inner join diemthi k on q.id = k.id and k.id = '"+viewstudent.id+"';"; 
      ResultSet rst =  stm.executeQuery(sql);
      q=0;
      // nếu có tồn tại học sinh nhận mã sinh vừa nhập thì sẽ nhảy vào while và gán q = 1 , ngược lại q sẽ =0
   while (rst.next()){
 q =1;
viewstudent.name = rst.getString(2);
viewstudent.tuoi = rst.getString(4);
viewstudent.diemuutien = rst.getString(5);
viewstudent.diemvan = rst.getString(10);
viewstudent.diemtoan = rst.getString(11);
viewstudent.diemtienganh = rst.getString(12);
       
      
    } 
    if(q==0){
        // nếu q = 0 sẽ báo lỗi và gán điều hướng rp = 0 để giao diện student không hiển thị ra thông tin;
        viewstudent.dieuhuongrp = 0;
        viewstudent.rp.setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "Chưa có id này trong bảng điểm.","search error",
        JOptionPane.ERROR_MESSAGE);
        viewstudent.name = " ";
viewstudent.tuoi = " ";
viewstudent.diemuutien =" ";
viewstudent.diemvan = " ";
viewstudent.diemtoan =" ";
viewstudent.diemtienganh = " ";
        rst.close();
        stm.close();
        con.close();
    }
    else
    viewstudent.dieuhuong = 1;
    // gán điêu hướng bằng 1 để hiển thị điểm số
    new viewstudent();
    rst.close();
    stm.close();
    con.close();
    }
  
catch(Exception e){
System.out.println(e.getMessage());
    
}
}
}
