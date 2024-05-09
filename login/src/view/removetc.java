package view;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import controller.*;
import javax.swing.table.DefaultTableModel;
public class removetc extends JFrame implements ActionListener , MouseListener  {
public static Vector vData = new Vector();
public static Vector vTitle = new Vector();
JScrollPane tableResult;
public static DefaultTableModel model;
JTable tb = new JTable();
JButton remove , undoo ;
public static int selectedrow =0;
    public removetc (){
        JPanel p = new JPanel();
        remove = new JButton("xóa tk");
        remove.addActionListener(this);
      //  Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
        undoo = new JButton("trở lại");
     //   undoo.setIcon(icon);
        undoo.addActionListener(this);
        undoo.setBackground(Color.white);
        remove.setBackground(Color.white);
        undoo.setForeground(Color.black);
        remove.setForeground(Color.black);
        p.add(undoo);
        p.add(remove);
                tableResult = new JScrollPane(tb);
        this.add(p, "South");
        new reload();
        model = new DefaultTableModel(vData,vTitle);
        tb = new JTable(model);
        tb.setForeground(Color.BLACK);
        tb.addMouseListener(this);
        tableResult = new JScrollPane(tb);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.getContentPane().add(tableResult,"North");
        this.setTitle("xóa tài khoản giáo viên");
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
        if(e.getActionCommand().equals("xóa tk")){
            new deletetc();
            new reload();
        }
        else if(e.getActionCommand().equals("trở lại")){
            this.setVisible(false);
        }
    }
}
