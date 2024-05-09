package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class reload2 {
    public reload2(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
        viewAdmin.vTitle.clear();
        viewAdmin.vData.clear();
        if(selectchoose.sapxep==0){
        ResultSet rst = stm.executeQuery("select * from student;");
        ResultSetMetaData rstmeta = rst.getMetaData();
        int num = rstmeta.getColumnCount();
        for(int i =1;i<=num;i++){
            viewAdmin.vTitle.add(rstmeta.getColumnLabel(i));
        }
        while(rst.next()){
            Vector row = new Vector(num);
            for(int i =1;i<=num;i++)
            row.add(rst.getString(i));
            viewAdmin.vData.add(row);

        }
        rst.close();
        con.close();
    }
   else if(selectchoose.sapxep==1){
    String tens = "";
    String tenlops ="";
    String diemuutiens = "";
    String gt = "";
    {
    if(selectchoose.tenst.equals("giảm dần")){
        tens =" order by ten desc ";
    }
    if(selectchoose.tenst.equals("tất cả")){
        tens = " order by gioitinh asc ";
    }
    else if(selectchoose.tenst.equals("tăng dần")){
        tens =" order by ten asc ";
    }
}{
    if(selectchoose.lopst.equals("tất cả")){
        if(selectchoose.gt.equals("tất cả")){
            gt = "";
    }
    else if (selectchoose.gt.equals("nam")){
                gt = "where gioitinh = true"; 
    }
    else  if (selectchoose.gt.equals("nữ")){
        gt = "where gioitinh = false"; 
    }
    tenlops = "" + gt;
}

    else {   
        if(selectchoose.gt.equals("tất cả")){
        gt = "";
}
else if (selectchoose.gt.equals("nam")){
    gt = "and gioitinh = true"; 
}
else {
gt = "and gioitinh = false"; 
}
        tenlops ="where phongthi" +selectchoose.monst +" = '"+selectchoose.lopst +"'" + gt;
}
}
{
    if(selectchoose.diemuutienst.equals("tất cả")){
        diemuutiens = "";
        
    }
    else if(selectchoose.diemuutienst.equals("giảm dần")){
        diemuutiens =" , diemuutien desc ;";
    }
    else if(selectchoose.diemuutienst.equals("tăng dần")){
        diemuutiens =", diemuutien asc ;";

    }
}
    String sql = "select * from student " + tenlops +tens + diemuutiens;
    System.out.println(sql);
        ResultSet rst = stm.executeQuery(sql);
        ResultSetMetaData rstmeta = rst.getMetaData();
        int num = rstmeta.getColumnCount();
        for(int i =1;i<=num;i++){
            viewAdmin.vTitle.add(rstmeta.getColumnLabel(i));
        }
        while(rst.next()){
            Vector row = new Vector(num);
            for(int i =1;i<=num;i++)
            row.add(rst.getString(i));
            viewAdmin.vData.add(row);

        }
        rst.close();
        con.close();
    }
    } catch (Exception e) {
        // TODO Auto-generated catch block
       System.out.println(e.getMessage());
    }
    
}
}
