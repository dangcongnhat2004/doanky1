package view;
import java.awt.*;
import javax.swing.*;
import controller.*;

import java.awt.event.*;
public class ttgv extends JFrame implements ActionListener {
    public static String idgv ;
    public static String namegv;
    public static String namsinhgv;
    public static String chucvu;
    public static String taikhoangv;
    public static String mkgv ;
    public static int ktra ;
    JLabel id = new JLabel();
    JLabel ten = new JLabel();
    JLabel namsinh = new JLabel();
    JLabel chuc = new JLabel();
    JLabel tk = new JLabel();
    JLabel mk = new JLabel();
    JButton undoo , timtiep = new JButton();
    JLabel anh = new JLabel();
    JLabel title = new JLabel();
    JFrame gv = new JFrame();
    public ttgv(){
        ktra=0;
        new timgv();
        Font font = new Font("Times new Roman", Font.BOLD , 19);
        JPanel con = new JPanel();
        con.setBackground(new java.awt.Color(255, 255, 185));
         con.setLayout(null);
         title = new JLabel("Thông tin giáo viên");
         title.setFont(new Font("Times New Roman", Font.BOLD,26));
         title.setBounds(130, 0, 400, 100);
         Icon iconn = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Minion-icon.png");
         anh = new JLabel(iconn);
         anh.setBounds(0, 0, 128, 128);
         con.add(title);
         con.add(anh);
         id = new JLabel("ID giáo viên :"+idgv);
         id.setFont(font);
         id.setBounds(130, 80, 300, 100);
         ten = new JLabel("Tên giáo viên :"+namegv);
         ten.setFont(font);
         ten.setBounds(130, 130, 300, 100);
         namsinh = new JLabel("Năm sinh :"+namsinhgv);
         namsinh.setFont(font);
         namsinh.setBounds(130, 180, 300, 100);
         chuc = new JLabel("Chức vụ :"+chucvu);
         chuc.setFont(font);
         chuc.setBounds(130, 230, 300, 100);
         tk = new JLabel("Tài khoản :"+taikhoangv);
         tk.setFont(font);
         tk.setBounds(130, 280, 300, 100);
         mk = new JLabel("Mật khẩu :"+mkgv);
         mk.setFont(font);
         mk.setBounds(130, 330, 300, 100);
              Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
            undoo = new JButton("trở lại");
               undoo.setIcon(icon);
               undoo.addActionListener(this);
               undoo.setBackground(new java.awt.Color(185, 255, 255));
               undoo.setBounds(50, 500, 170, 50);
               Icon iconnn = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\plus-icon.png");
               timtiep = new JButton("tìm gv khác");
                  timtiep.setIcon(iconnn);
                  timtiep.setBackground(new java.awt.Color(185, 255, 255));
                  timtiep.addActionListener(this);
                  timtiep.setBounds(250, 500, 170, 50);
                  con.add(timtiep);
               con.add(id);
               con.add(ten);
               con.add(namsinh);
               con.add(chuc);
               con.add(tk);
               con.add(mk);
               con.add(undoo);
               gv = new JFrame();
               gv.add(con);
               gv.setUndecorated(true);
               gv.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
               gv.setTitle("xem thông tin giáo viên");
               gv.setResizable(false);
               gv.setSize(450, 600);
               gv.setLocationRelativeTo(null);
               gv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if(ktra==1) {
              gv.setVisible(true);
    }
    if(ktra==0){
        gv.setVisible(false);
        setVisible(false);
        JOptionPane.showMessageDialog(rootPane, "không tìm được giáo viên có id : "+ viewAdmin.tkgv ,"find error",
        JOptionPane.ERROR_MESSAGE);
        new nhapidtk(); 
    }
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("trở lại")){
            gv.setVisible(false);
        }
        else  if(e.getActionCommand().equals("tìm gv khác")){
            gv.dispose();
            new nhapidtk();
        }
    }
}
