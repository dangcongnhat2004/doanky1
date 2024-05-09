package view;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import controller.*;
import javax.swing.table.DefaultTableModel;
public class thongtinhs extends JFrame implements ActionListener , MouseListener  {
public static Vector vData = new Vector();
public static Vector vTitle = new Vector();
public static int dieuhuong =0;
public static int dieuhuongxettuyen;
JScrollPane tableResult;
public static DefaultTableModel model;
JTable tb = new JTable();
JButton edit , undoo , xuat , tim , nhapdiemxettuyen;
public static int selectedrow =0;
public static String nhapid;
    public thongtinhs (){
        xettuyen.dieuhuongxettuyen2 = 0;
        JPanel p = new JPanel();
        dieuhuong =0;
        edit = new JButton("sửa");
        edit.addActionListener(this);
      //  Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
        undoo = new JButton("trở lại");
        tim = new JButton("tìm kiếm");
        nhapdiemxettuyen = new JButton("điểm xét");
     //   undoo.setIcon(icon);
        undoo.addActionListener(this);
        undoo.setBackground(Color.white);
        edit.setBackground(Color.white);
        undoo.setForeground(Color.black);
        edit.setForeground(Color.black);

        xuat = new JButton("xuất file");
        xuat.addActionListener(this);
        xuat.setBackground(Color.white);
        xuat.setForeground(Color.black);
        tim.addActionListener(this);
        tim.setBackground(Color.white);
        tim.setForeground(Color.black);
    
        nhapdiemxettuyen.addActionListener(this);
        nhapdiemxettuyen.setBackground(Color.white);
        nhapdiemxettuyen.setForeground(Color.black);
        thongtinhs.vTitle.clear();
        thongtinhs.vData.clear();
        p.add(undoo);
        p.add(edit);
        p.add(tim);
        p.add(xuat);
        p.add(nhapdiemxettuyen);
        
        this.add(p, "South");
        tableResult = new JScrollPane(tb);
        new reload3();
        model = new DefaultTableModel(vData,vTitle);
        tb = new JTable(model);
        tb.setForeground(Color.BLACK);
        tb.addMouseListener(this);
        tableResult = new JScrollPane(tb);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.getContentPane().add(tableResult,"North");
        this.setTitle("thông tin học sinh");
        this.setSize( 900, 450);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        

    }

    
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        selectedrow = tb.getSelectedRow();
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("sửa")){
            Vector st = (Vector)vData.elementAt(selectedrow);
            dieuhuong = 1;
             new editdiem("chỉnh sửa thông tin học sinh",(String)st.elementAt(0), (String)st.elementAt(1),(String)st.elementAt(2) , (String)st.elementAt(3),(String)st.elementAt(4),(String)st.elementAt(5));
            }
        
        else if(e.getActionCommand().equals("trở lại")){
            this.setVisible(false);
        }
        else if (e.getActionCommand().equals("xuất file")){
            if( xettuyen.dieuhuongxettuyen2 ==2){
                new nhapnamefile2();
            }
            else{
            dieuhuong = 1;
            new nhapnamefile();
            }
        }
        else if (e.getActionCommand().equals("tìm kiếm")){
            dieuhuong = 5;
            new nhapidtkhs();
        }
        else if (e.getActionCommand().equals("điểm xét")){
            this.setVisible(false);
            new xettuyen();
        }
    }
}
