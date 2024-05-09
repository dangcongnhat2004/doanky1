package view;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import controller.*;
import javax.swing.table.DefaultTableModel;
public class thongtinhs2 extends JFrame implements ActionListener , MouseListener  {
public static Vector vData = new Vector();
public static Vector vTitle = new Vector();
public static int dieuhuong =0;
JScrollPane tableResult;
public static DefaultTableModel model;
JTable tb = new JTable();
JButton edit , undoo , xuat;
public static int selectedrow =0;
    public thongtinhs2 (){
        JPanel p = new JPanel();
        dieuhuong =0;
        edit = new JButton("sửa");
        edit.addActionListener(this);
      //  Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
        undoo = new JButton("trở lại");
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
            edit.setVisible(false);
            thongtinhs2.vTitle.clear();
            thongtinhs2.vData.clear();
            new reload4();
        p.add(undoo);
        p.add(edit);
        p.add(xuat);
                tableResult = new JScrollPane(tb);
        this.add(p, "South");
        model = new DefaultTableModel(vData,vTitle);
        tb = new JTable(model);
        tb.setForeground(Color.BLACK);
        tb.addMouseListener(this);
        tableResult = new JScrollPane(tb);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.getContentPane().add(tableResult,"North");
        this.setTitle("thông tin học sinh");
        this.setSize( 600, 300);
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
            dieuhuong = 1;
            new nhapnamefile();
            
        }
    }
}
