package controller;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
public class tinhphantram  {
    public tinhphantram(){
    try {
        dao db = new dao();
        Connection con = db.getConnect();
 Statement stm = con.createStatement();
      String sql = "select s.diemvan , s.diemtoan , s.diemtienganh  from diemthi s inner join student v on s.id = v.id;"; 
      ResultSet rst =  stm.executeQuery(sql);
      while(rst.next()){
        if(rst.getString(1).equals("null")||rst.getString(2).equals("null")||rst.getString(3).equals("null")){
            //not thing to do here
        }
        else { 
            bieudo.sodem =bieudo.sodem+1;
            double v = rst.getDouble(1)+rst.getDouble(2)+rst.getDouble(3);
            if(v>=30){
              
                bieudo.diem30 = bieudo.diem30+1;
            }
            else if(v>=25&&v<30){
                bieudo.hon25 = bieudo.hon25+1;
            }
            else if(v>=20&&v<25){
                bieudo.hon20 = bieudo.hon20+1;
        }
        else if (v>=15&&v<20){
            bieudo.duoi20=bieudo.duoi20+1;
    }
    else if (v<15){
        bieudo.duoi15=bieudo.duoi15+1;
}
}
      }
    rst.close();
    stm.close();
    con.close();
    }

catch(Exception e){
 System.out.println(e.getMessage());
}
}
}

