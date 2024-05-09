package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class reload {
    public reload(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
        removetc.vTitle.clear();
        removetc.vData.clear();
        ResultSet rst = stm.executeQuery("select * from teacher;");
        ResultSetMetaData rstmeta = rst.getMetaData();
        int num = rstmeta.getColumnCount();
        for(int i =1;i<=num;i++){
            removetc.vTitle.add(rstmeta.getColumnLabel(i));
        }
        while(rst.next()){
            Vector row = new Vector(num);
            for(int i =1;i<=num;i++)
            row.add(rst.getString(i));
            removetc.vData.add(row);

        }
        rst.close();
        con.close();
    } catch (Exception e) {
        // TODO Auto-generated catch block
       System.out.println(e.getMessage());
    }
    
}
}
