package view;
import controller.logincontrol;
import controller.logincontroltc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class login extends JFrame implements ActionListener {
    private JPasswordField jt2 = new JPasswordField();
    private JTextField jt3 = new JTextField();
    private JButton button = new JButton();
    private JButton button2 = new JButton();
    private JComboBox select = new JComboBox();
    private JTextField jt = new JTextField();
    private JFrame jf = new JFrame();
    public static  String us=""; 
    public static  String pa="";
    public login(){
         jf = new JFrame();
         jf.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\vku.jpg"));
        jf.setUndecorated(true);
        jf.setSize(800, 500);
        jf.setLayout(null);
        JPanel trai = new JPanel();
        trai.setBackground(new java.awt.Color(26 ,19, 19));
        JPanel phai = new JPanel();
        phai.setBackground(new java.awt.Color(35,35,35));
        trai.setBounds(0, 0, 400, 500);
        phai.setBounds(400, 0, 400, 500);
        JLabel img1 = new JLabel(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_User_Shield_100px.png"));
        img1.setBounds(150, 50, 100, 100);
        JLabel img2 = new JLabel(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_Male_User_35px.png"));
        img2.setBounds(30, 190, 50, 50);
        jt = new JTextField();
        jt.setBounds(80, 190, 260, 50);
        JLabel img3 = new JLabel(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_Lock_35px.png"));
        img3.setBounds(30, 310, 50, 50);
        jt3 = new JTextField();
        jt2 = new JPasswordField();
        jt3.setForeground(Color.white);
        jt3.setBounds(80, 310, 260, 50);
        jt3.setFont(new Font("Times New Roman" , Font.BOLD, 18));
        jt3.setBorder(BorderFactory.createLineBorder(Color.decode("#A9E031")));
        jt3.setBackground(new java.awt.Color(26 ,19, 19));
        jt2.setBounds(80, 310, 260, 50);
        jt.setForeground(Color.white);
        jt.setFont(new Font("Times New Roman" , Font.BOLD, 18));
        jt2.setForeground(Color.white);
        jt2.setFont(new Font("Times New Roman" , Font.BOLD, 18));
        jt.setBorder(BorderFactory.createLineBorder(Color.decode("#A9E031")));
        jt.setBackground(new java.awt.Color(26 ,19, 19));
        jt2.setBorder(BorderFactory.createLineBorder(Color.decode("#A9E031")));
        jt2.setBackground(new java.awt.Color(26 ,19, 19));
        JButton login = new  JButton("Đăng nhập");
        login.addActionListener(this);
        login.setForeground(Color.black);
        login.setFont(new Font("Times New Roman" , Font.BOLD, 18));
        login.setBackground(new java.awt.Color(169, 224, 49));
        login.setBounds(40, 400, 120, 50);
        JButton thoat = new  JButton("Thoát");
        thoat.addActionListener(this);
        thoat.setForeground(Color.black);
        thoat.setFont(new Font("Times New Roman" , Font.BOLD, 18));
        thoat.setBackground(new java.awt.Color(169, 224, 49));
        thoat.setBounds(240, 400, 120, 50);
         select = new JComboBox<>();
        select.addItem("Admin");
        select.addItem("Teacher");
        select.addItem("Student");
        select.setForeground(Color.white);
        select.setBackground(new java.awt.Color(26 ,19, 19));
        select.setBounds(320, 0, 80, 30);
        select.setBorder(BorderFactory.createLineBorder(new java.awt.Color(169, 224, 49)));
        JLabel text1 = new JLabel("Tài khoản");
        JLabel text2 = new JLabel("Mật khẩu");
        text1.setForeground(new java.awt.Color(169, 224, 49));
        text2.setForeground(new java.awt.Color(169, 224, 49));
        text1.setBounds(80, 150, 260, 50);
        text2.setBounds(80, 270, 260, 50);
        Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\hide.png");
        button = new JButton(".");
        button.addActionListener(this);
        button.setBorder(null);
        button.setIcon(icon);
        button.setBounds(350 , 310 , 50 , 50);
        button.setBackground(new java.awt.Color(26 ,19, 19));
        button.setForeground(new java.awt.Color(26 ,19, 19));
        Icon icon2 = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\show.png");
        button2 = new JButton(",");
        button2.setIcon(icon2);
        button2.addActionListener(this);
        button2.setBounds(350 , 310 , 50 , 50);
        button2.setBackground(new java.awt.Color(26 ,19, 19));
        button2.setForeground(new java.awt.Color(26 ,19, 19));
        button2.setBorder(null);
        button2.setVisible(false);
        jt3.setVisible(false);
        
        Font font = new Font("Times New Roman", Font.BOLD , 25);
        JLabel textimg =  new JLabel(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_DOT_100px.png"));
        JLabel textimg2 = new JLabel("JAVA SWING");
        JLabel textimg3 = new JLabel("Quản lí tuyển sinh lớp 10");
        textimg.setForeground(new java.awt.Color(169, 224, 49));
        textimg.setBounds(400, 100, 200, 100);
        textimg2.setFont(font);
        textimg2.setForeground(new java.awt.Color(169, 224, 49));
        textimg2.setBounds(550, 105, 200, 100);
        textimg3.setFont(new Font("Times new Roman", Font.BOLD,19));
        textimg3.setForeground(new java.awt.Color(169, 224, 49));
        textimg3.setBounds(500, 160, 250, 120);
        jf.add(textimg3);
        jf.add(textimg);
        jf.add(textimg2);
        jf.add(jt3);
        jf.add(button2);
        jf.add(button);
        jf.add(text2);
        jf.add(text1);
        jf.add(select);
        jf.add(thoat);
        jf.add(login);
        jf.add(img3);
        jf.add(jt2);
        jf.add(img1);
        jf.add(img2);
        jf.add(jt);
        jf.add(trai);
        jf.add(phai);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    @Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    String right = (String)select.getSelectedItem();
    us = jt.getText();
    pa = jt2.getText();
    if(e.getActionCommand().equals(".")){
        jt3.setText(jt2.getText());
        jt2.setVisible(false);
        jt3.setVisible(true);
        button.setVisible(false);
        button2.setVisible(true);
      
    }
    else if (e.getActionCommand().equals(",")){
        jt2.setText(jt3.getText());
        jt3.setVisible(false);
        jt2.setVisible(true);
        button2.setVisible(false);
        button.setVisible(true);
    }
    else if(right.equals("Student")&&e.getActionCommand().equals("Đăng nhập")){
        jf.setVisible(false);
        new viewstudent();
    }
    else if(right.equals("Admin")&&e.getActionCommand().equals("Đăng nhập")){
        jf.setVisible(false);
        new logincontrol();
        
    }
    else if(right.equals("Teacher")&&e.getActionCommand().equals("Đăng nhập")){
        jf.setVisible(false);
        new logincontroltc();
    }
    else {
        System.exit(0);
    }
}
    
}



