package view;
import javax.swing.*;
import javax.swing.KeyStroke;
import java.awt.*;
import java.awt.event.*;
public class teacherview extends JFrame implements ActionListener{
private JFrame window;
private JMenuBar menu;
private JMenu hethong;
private JMenu quanli;
private JMenu trogiup;
private JMenuItem dangxuat;
private JMenuItem thoat;
private JMenuItem chamdiem;
private JMenuItem note;
private JMenuItem chinhsuatt;
private JMenuItem help;
private JMenuItem more;
private static  String button;
public static int dieuhuonghs;
public teacherview() {
 createwindowadmin();
}
public void createwindowadmin () {
  window = new JFrame();
  window.setLayout(null);
  menu();
  ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\anime-sky-4k-0f.jpg"));
 JLabel bg = new JLabel("",img,JLabel.CENTER);
  bg.setBounds(0, 0, 1050, 700);
  window.add(bg);
  window.setUndecorated(true);
  window.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
  window.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\School-icon.png"));
  window.setTitle("giao diện dành cho giáo viên");
 JLabel jl = new JLabel("Phím tắt");
 jl.setFont(new Font("Times new Roman", Font.BOLD , 19));
 jl.setForeground(Color.white);
 jl.setBounds(50, 0, 100, 60);
 JLabel jl1 = new JLabel("Nhập điểm : ctrl + A");
 jl1.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl1.setForeground(Color.white);
 jl1.setBounds(10, 30, 300, 60);
 window.add(jl1);
 
 JLabel jl2 = new JLabel("Ghi chú học sinh : ctrl + R");
 jl2.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl2.setForeground(Color.white);
 jl2.setBounds(10, 50, 300, 60);
 window.add(jl2);

 JLabel jl3 = new JLabel("Chỉnh sửa thông tin học sinh : ctrl + E");
 jl3.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl3.setForeground(Color.white);
 jl3.setBounds(10, 70,500, 60);
 window.add(jl3);

 JLabel jl4 = new JLabel("Danh sách vi phạm : alt + O");
 jl4.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl4.setForeground(Color.white);
 jl4.setBounds(10, 90, 300, 60);
 window.add(jl4);

 JLabel jl8 = new JLabel("Trợ giúp : ctrl + H");
 jl8.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl8.setForeground(Color.white);
 jl8.setBounds(10, 110, 300, 60);
 window.add(jl8);

 JLabel jl9 = new JLabel("Xem thêm thông tin : ctrl + M");
 jl9.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl9.setForeground(Color.white);
 jl9.setBounds(10, 130, 300, 60);
 window.add(jl9);

 JLabel jl11 = new JLabel("Đăng xuất : ctrl + L");
 jl11.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl11.setForeground(Color.white);
 jl11.setBounds(10, 150, 300, 60);
 window.add(jl11);

 JLabel jl12 = new JLabel("Thoát : ctrl + X");
 jl12.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl12.setForeground(Color.white);
 jl12.setBounds(10, 170, 300, 60);
 window.add(jl12);
 window.add(jl);
 window.add(bg);
//  window.add(drawletter.jf);
  window.setSize(1050, 670);
  window.setResizable(false);
  window.setLocationRelativeTo(null);
  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  window.setVisible(true);
//   window = new JFrame();
//   window.setLayout(null);
//   menu();
//   ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\anime-sky-4k-0f.jpg"));
//  JLabel bg = new JLabel("",img,JLabel.CENTER);
//   bg.setBounds(0, 0, 1050, 700);
//   window.add(bg);
//   window.setUndecorated(true);
//   window.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
//   window.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\School-icon.png"));
//   window.setTitle("giao dien danh cho giao vien");
//   JLabel jl = new JLabel("Phím tắt");
//   jl.setFont(new Font("Times new Roman", Font.BOLD , 19));
//   jl.setForeground(Color.white);
//   jl.setBounds(50, 0, 100, 60);
//   JLabel jl1 = new JLabel("Thêm học sinh : ctrl + A");
//   jl1.setFont(new Font("Times new Roman", Font.BOLD , 15));
//   jl1.setForeground(Color.white);
//   jl1.setBounds(10, 30, 300, 60);
//   window.add(jl);
//   window.add(jl1);
//   window.setSize(1050, 700);
//   window.setResizable(false);
//   window.setLocationRelativeTo(null);
//   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//   window.setVisible(true);
}
public void menu (){
   // menu = new JMenuBar();
    menu=new JMenuBar(){

      public void paintComponent(Graphics g)
    
      {
    
      g.drawImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\anime-sky-4k-0f.jpg"),0,0,this);
    
      }
    
     };
    menu.setBorderPainted(true);
    menu.setBackground(Color.white);
     menu.setBorder(null);
 
    window.setJMenuBar(menu);
    hethong = new JMenu("Hệ thống");
    hethong.setForeground(Color.white);
    hethong.addActionListener(this);
    quanli = new JMenu("Quản lí học sinh");
    quanli.setForeground(Color.white);
    trogiup = new JMenu("Trợ giúp");
    trogiup.setForeground(Color.white);
  hethong.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\system-icon.png"));
  quanli.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\student-icon.png"));
  trogiup.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\helpview-icon.png"));
  menu.add(hethong);
  menu.add(quanli);
  menu.add(trogiup);
  JMenuItem dsvipham = new JMenuItem("Danh sách vi phạm");
dsvipham.addActionListener(this);
dsvipham.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,InputEvent.CTRL_DOWN_MASK));
 dangxuat = new JMenuItem("đăng xuất", KeyEvent.VK_L);
dangxuat.addActionListener(this);
dangxuat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,InputEvent.CTRL_DOWN_MASK));
 thoat = new JMenuItem("thoát" , KeyEvent.VK_X);
thoat.addActionListener(this);
thoat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
chamdiem = new JMenuItem("Nhập điểm" , KeyEvent.VK_A);
chamdiem.addActionListener(this);
chamdiem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_DOWN_MASK));
note = new JMenuItem("ghi chú học sinh" , KeyEvent.VK_R);
note.addActionListener(this);
note.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_DOWN_MASK));
 chinhsuatt = new JMenuItem("chỉnh sửa thông tin học sinh", KeyEvent.VK_E);
chinhsuatt.addActionListener(this);
chinhsuatt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
 help = new JMenuItem("Help" , KeyEvent.VK_H);
help.addActionListener(this);
help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_DOWN_MASK));
 more = new JMenuItem("More" , KeyEvent.VK_M);
more.addActionListener(this);
more.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,InputEvent.CTRL_DOWN_MASK));
thoat.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Close-icon.png"));
help.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Help-icon.png"));
more.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\about-icon.png"));
chinhsuatt.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Edit-icon.png"));
note.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Notes-icon.png"));
chamdiem.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\exam2.jpg"));
dangxuat.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Logout-icon.png"));
dsvipham.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\removeicon.png"));
trogiup.add(help);
trogiup.addSeparator();
trogiup.add(more);
quanli.addSeparator();
quanli.add(chamdiem);
quanli.addSeparator();
quanli.add(note);
quanli.addSeparator();
quanli.add(chinhsuatt);
quanli.addSeparator();
quanli.add(dsvipham);
hethong.addSeparator();
hethong.add(dangxuat);
hethong.addSeparator();
hethong.add(thoat);
}
@Override
public void actionPerformed(ActionEvent e) {

   button = e.getActionCommand();
  if(button.equals("đăng xuất")){
    window.setVisible(false);
    new login();
  }
  else if(button.equals("thoát")){
    System.exit(0);
  }
  else if (button.equals("Help")){
    new helpview();
  }
  else if (button.equals("More")){
    new Moreview();
  }
  else if(button.equals("ghi chú học sinh")){
    dieuhuonghs =1;
    new nhapidtkhs();
  }
  else if(button.equals("Nhập điểm")){
    new nhapdiem();
  }
  else if(button.equals("chỉnh sửa thông tin học sinh")){
    new thongtinhs();
  }
  else if (button.equals("Danh sách vi phạm")){
    dieuhuonghs =1;
    new thongtinhs2();
  }
}
}
