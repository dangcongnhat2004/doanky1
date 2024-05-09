package controller;
import DAO.dao;
import view.ghichu;
import view.*;
import java.sql.*;
public class ghivaodb {
  public ghivaodb () {
		
    try {
        dao db = new dao();
        Connection con = db.getConnect();

        String sql = "insert into studentvipham values";
     String id = "('"+ghichu.idhs+"',";
     String name = "'"+ghichu.namehs+"',";
     String namsinh ="'"+ ghichu.namsinhhs+"',";
     String monvipham ="'"+ ghichu.monvp +"',";
     String phongthivipham = "'"+ghichu.phongthivp+"',";
     String loivipham = "'"+ghichu.loivp+"',";
     String noidung = "'"+ghichu.noidungvp+"');";
     Statement sm = con.createStatement();
     String sql2 = "select count(*) from studentvipham where id = '"+ghichu.idhs+"'" +"and monvipham = '"+ghichu.monvp+"';" ;
     ResultSet rs =  sm.executeQuery(sql2);
     ResultSetMetaData rsm = rs.getMetaData();
    String check = "";
    int col_num = rsm.getColumnCount();
     while(rs.next()){
      for(int i = 1 ; i<= col_num ; i++)
      check = rs.getString(i);
       }
       if(check.equals("1")){
        new notify();
        con.close();
     }
     else 
      //  System.out.println(sql+id+name+namsinh+monvipham+phongthivipham+loivipham+noidung);

     sm.executeUpdate(sql+id+name+namsinh+monvipham+phongthivipham+loivipham+noidung);
        con.close();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
}
}
