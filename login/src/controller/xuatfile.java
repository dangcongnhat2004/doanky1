package controller;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.sql.*;
import view.*;
import DAO.*;
import java.util.*;
import view.*;
public class xuatfile {
    public xuatfile(){
        System.out.println(nhapnamefile.namefile);
       try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Học sinh");
           
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH HỌC SINH");

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Họ và tên");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Giới tính ");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Ngày sinh");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Điểm ưu tiên");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Phòng thi ngữ văn");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Phòng thi toán");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Phòng thi tiếng anh");
         
new reload2();
System.out.println(viewAdmin.vData.size());
            for (int i = 0; i < viewAdmin.vData.size(); i++) {
                Vector er = (Vector)viewAdmin.vData.elementAt(i);
                row = spreadsheet.createRow((short) 4 + i);

              row.setHeight((short)-1);
                row.createCell(0).setCellValue(i+1);
                spreadsheet.autoSizeColumn(0);
                row.createCell(1).setCellValue((String)er.elementAt(0));
                spreadsheet.autoSizeColumn(1);
                row.createCell(2).setCellValue((String)er.elementAt(1));
                spreadsheet.autoSizeColumn(2);
                row.createCell(3).setCellValue((String)er.elementAt(2));
                spreadsheet.autoSizeColumn(3);
                row.createCell(4).setCellValue(er.elementAt(3).toString());
                spreadsheet.autoSizeColumn(4);
                row.createCell(5).setCellValue(er.elementAt(4).toString());
                spreadsheet.autoSizeColumn(5);
                row.createCell(6).setCellValue(er.elementAt(5).toString());
                spreadsheet.autoSizeColumn(6);
                row.createCell(7).setCellValue(er.elementAt(6).toString());
                spreadsheet.autoSizeColumn(7);
                row.createCell(8).setCellValue(er.elementAt(6).toString());
                spreadsheet.autoSizeColumn(8);
                System.out.println(er.elementAt(3).toString());
            }
            FileOutputStream out = new FileOutputStream(new File("D:/"+nhapnamefile.namefile+".xlsx"));
            workbook.write(out);
            out.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



