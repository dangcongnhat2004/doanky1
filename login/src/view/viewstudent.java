package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;
public class viewstudent extends JFrame implements ActionListener {
    private Container jp ;
    private JButton tim;
    public static  JButton rp ;
    private JButton undoo;
    private  JLabel lb;
    private JLabel kqtc;
    private  JLabel tracuu;
    private JLabel tracuudiemut;
    private JLabel tracuudiem;
    public static String id ;
    public static String name ;
    public static String tuoi ;
    public static String diemuutien ;
    public static String diemvan ;
    public static String diemtoan ;
    public static String diemtienganh ;
    public static int dieuhuong =0;
    public static int dieuhuongrp =0;
    private JTextField sea = new JTextField();
    public viewstudent(){
jp = new Container();

jp.setBackground(Color.white);
jp.setLayout(null);
Icon iscon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\search.png");
JLabel search = new JLabel(iscon);
 sea = new JTextField();
tim = new JButton("Tìm kiếm");
tim.addActionListener(this);
tim.setBackground(Color.white);
tim.setFont(new Font("Times new Roman" , Font.BOLD , 17));
tim.setBounds(470,40,110,50);
sea.setBounds(70, 40, 400, 50);
search.setBounds(0, 30, 64, 64);
rp = new JButton("Phúc khảo");
rp.addActionListener(this);
rp.setBackground(Color.white);
rp.setBounds(480, 300, 100, 60);
rp.setFont(new Font("Times new Roman" , Font.BOLD , 14));
Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
 undoo = new JButton(" ");
 undoo.setIcon(icon);
 undoo.setBackground(Color.white);
 undoo.setBounds(0, 300, 100, 60);
undoo.addActionListener(this);
  lb = new JLabel("Xem kết quả thi");
 lb.setFont(new Font("Times new Roman" , Font.BOLD | Font.ITALIC , 26));
 lb.setForeground(Color.RED);
 lb.setBounds(200, -10, 300, 60);
 kqtc = new JLabel("kết quả :");
 kqtc.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC , 16));
 kqtc.setBounds(50, 100, 500, 70);
 tracuu = new JLabel("id : "+ id +", tên : "+name);
 tracuu.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC , 18));
 tracuu.setBounds(50, 140, 500, 70);
 tracuudiemut = new JLabel("ngày sinh : "+tuoi +" , điểm ưu tiên : "+ diemuutien );
 tracuudiemut.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC , 18));
 tracuudiemut.setBounds(50, 170, 500, 70);
 tracuudiem = new JLabel("điểm văn : "+diemvan + ", điểm toán : "+diemtoan +", điểm tiếng anh : "+ diemtienganh);
 tracuudiem.setFont(new Font("Times new Roman", Font.BOLD | Font.ITALIC , 18));
 tracuudiem.setBounds(50, 200, 500, 70);
 if(dieuhuong==0){
    tracuu.setVisible(false);
    tracuudiem.setVisible(false);
    tracuudiemut.setVisible(false);
 }
 if(dieuhuongrp==0){
    rp.setVisible(false);
     }
     else if (dieuhuongrp==1){
        rp.setVisible(true);
         }
 kqtc.setForeground(Color.black);
 tracuu.setForeground(Color.black);
 tracuudiemut.setForeground(Color.black);
 tracuudiem.setForeground(Color.black);
jp.add(tim);
jp.add(sea);
jp.add(search);
jp.add(rp);
jp.add(undoo);
jp.add(lb);
jp.add(kqtc);
jp.add(tracuu);
jp.add(tracuudiemut);
jp.add(tracuudiem);
this.setTitle("Student view");
this.setSize(600, 400);
this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setResizable(false);
this.add(jp);
this.setUndecorated(true);
this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\vs.png"));
this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("Phúc khảo")){
            new phuckhao();
        }
        else if  (e.getActionCommand().equals("Tìm kiếm")){
            id = sea.getText();
            this.setVisible(false);
            new tracuu();
        }
        else {
            this.setVisible(false);
            new loading();
        }
    }
}
