package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class reload3 {
    public reload3(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
 thongtinhs.vTitle.clear();
 thongtinhs.vData.clear();
 if(thongtinhs.dieuhuong==5){
    thongtinhs.dieuhuong=0;
    ResultSet rst = stm.executeQuery("select q.id , q.ten , q.namsinh , k.diemvan , k.diemtoan , k.diemtienganh from student  q , diemthi k where q.id = k.id and q.id ='"+thongtinhs.nhapid+"';");
    ResultSetMetaData rstmeta = rst.getMetaData();
    int num = rstmeta.getColumnCount();
    for(int i =1;i<=num;i++){
        thongtinhs.vTitle.add(rstmeta.getColumnLabel(i));
    }
    while(rst.next()){
        Vector row = new Vector(num);
        for(int i =1;i<=num;i++)
        row.add(rst.getString(i));
        thongtinhs.vData.add(row);

    }
    rst.close();
    con.close();
}
else  if(xettuyen.dieuhuongxettuyen==5){
    xettuyen.dieuhuongxettuyen = 0;
    xettuyen.dieuhuongxettuyen2 = 2;
    String q = "select s.id , s.ten , s.namsinh , s.diemuutien , v.diemvan , v.diemtoan , v.diemtienganh , "+
    " s.diemuutien + v.diemvan + v.diemtoan + v.diemtienganh as tongdiem  "+
   "from student s inner join diemthi v on s.id = v.id ;";
    ResultSet rst = stm.executeQuery(q);
    ResultSetMetaData rstmeta = rst.getMetaData();
    int num = rstmeta.getColumnCount();
    for(int i =1;i<=num;i++){
        thongtinhs.vTitle.add(rstmeta.getColumnLabel(i));
    }
    while(rst.next()){
        Vector row = new Vector(num);
        double v = rst.getDouble(8);
        if(v>=xettuyen.q){
        for(int i =1;i<=num;i++)
        row.add(rst.getString(i));
        thongtinhs.vData.add(row);
        }

    }
    rst.close();
    con.close();
}
else{
        ResultSet rst = stm.executeQuery("select q.id , q.ten , q.namsinh , k.diemvan , k.diemtoan , k.diemtienganh from student  q , diemthi k where q.id = k.id ;");
                      ResultSetMetaData rstmeta = rst.getMetaData();
        int num = rstmeta.getColumnCount();
        for(int i =1;i<=num;i++){
            thongtinhs.vTitle.add(rstmeta.getColumnLabel(i));
        }
        while(rst.next()){
            Vector row = new Vector(num);
            for(int i =1;i<=num;i++)
            row.add(rst.getString(i));
            thongtinhs.vData.add(row);

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
