package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controller.reload2;

public class selectchoose extends JFrame implements ActionListener {
    public JLabel tenlb = new JLabel();
    public JLabel gtlb = new JLabel();
    public JLabel loplb = new JLabel();
    public JLabel diemuutienlb = new JLabel();
    public JLabel monlb = new JLabel();
    public  JComboBox ten ;
    public  JComboBox lop ;
    public  JComboBox diemuutien ;
    public  JComboBox mon ;
    public  JComboBox gioitinh ;
    private JButton ok;
    private JButton cancel;
    private Container frame = new Container();
    private JFrame choose = new JFrame();
    public static int sapxep = 0;
    public static String tenst;
    public static String lopst;
    public static String diemuutienst;
    public static String monst;
    public static String gt;
    public selectchoose(){
frame = new Container();
frame.setLayout(new GridLayout(6,2));
String [] tenar = new String [] {"tất cả" , "giảm dần", "tăng dần"};
String [] lopar = new String [] {"tất cả","202","203","204","205"};
String [] uutien = new String [] {"tất cả","tăng dần","giảm dần"};
String [] monar = new String [] {"toan","ngu van","tieng anh"};
String [] giotinh = new String [] {"tất cả","nam","nữ"};
ten = new JComboBox(tenar);
lop = new JComboBox(lopar);
diemuutien = new JComboBox<>(uutien);
gioitinh = new JComboBox<>(giotinh);
mon = new JComboBox<>(monar);
tenlb = new JLabel("Sắp xếp tên");
gtlb = new JLabel("Giới tính");
loplb = new JLabel("Sắp xếp lớp");
diemuutienlb = new JLabel("Sắp xếp điểm ưu tiên");
monlb = new JLabel("Sắp xếp môn");
frame.add(tenlb);
frame.add(ten);
frame.add(gtlb);
frame.add(gioitinh);
frame.add(diemuutienlb);
frame.add(diemuutien);
frame.add(monlb);
frame.add(mon);
frame.add(loplb);
frame.add(lop);
ok = new JButton("ok");
ok.addActionListener(this);
cancel = new JButton("cancel");
cancel.addActionListener(this);
ok.setBackground(Color.white);

cancel.setBackground(Color.white);
frame.add(ok);
 frame.add(cancel);

        choose = new JFrame("lựa chọn sắp xếp");
        choose.add(frame);
        choose.setSize(450,300);
        choose.setUndecorated(true);
        choose.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        choose.setLocationRelativeTo(null);
        choose.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
    if(e.getActionCommand().equals("ok")){
        sapxep = 1;
        tenst = (String)ten.getSelectedItem();
        gt = (String)gioitinh.getSelectedItem();
        lopst = (String)lop.getSelectedItem();
        diemuutienst = (String)diemuutien.getSelectedItem();
        monst = (String)mon.getSelectedItem();
        monst = monst.replaceAll(" ", "");
        new reload2();
        choose.setVisible(false);
        new viewAdmin();
    }
    else {
        sapxep =0;
        new reload2();
        choose.setVisible(false);
        new viewAdmin();
    }
        
    }

}
