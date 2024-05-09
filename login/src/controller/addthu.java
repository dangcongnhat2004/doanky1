package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class addthu  extends JFrame{
    public static ArrayList<String> list = new ArrayList<String>();
    public static ArrayList<String> listid = new ArrayList<String>();
    public static ArrayList<String> listnd = new ArrayList<String>();
    public addthu(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select * from donphuckhao where tinhtrang = 'chua xem';"; 
      ResultSet rst =  stm.executeQuery(sql);
      while(rst.next()){
        list.add(rst.getString(2) + " " + rst.getString(1));
        listid.add(rst.getString(2));
        // listnd.add(rst.getString(4));
    }
    stm.close();
    con.close();
    }
  
catch(Exception e){
System.out.println(e.getMessage());
    
}
}
}
