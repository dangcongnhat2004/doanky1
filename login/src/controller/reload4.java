package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class reload4 {
    public reload4(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
        Statement stm = con.createStatement();
        thongtinhs2.vTitle.clear();
        thongtinhs2.vData.clear();
            ResultSet rst = stm.executeQuery("select * from studentvipham ;");
            ResultSetMetaData rstmeta = rst.getMetaData();
        int num = rstmeta.getColumnCount();
        for(int i =1;i<=num;i++){
            thongtinhs2.vTitle.add(rstmeta.getColumnLabel(i));
        }
        while(rst.next()){
            Vector row = new Vector(num);
            for(int i =1;i<=num;i++)
            row.add(rst.getString(i));
            thongtinhs2.vData.add(row);

        }
          teacherview.dieuhuonghs=0;
        rst.close();
        con.close();
       
    
    } catch (Exception e) {
        // TODO Auto-generated catch block
       System.out.println(e.getMessage());
    }
    
}
}
