package view;
import javax.swing.*;
import javax.swing.KeyStroke;
import java.awt.*;
import java.awt.event.*;
import controller.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
public class viewAdmin extends JFrame implements ActionListener , MouseListener{
private JFrame window;
private JMenuBar menu;
private JMenu hethong;
private JMenu quanli;
private JMenu taikhoan;
private JMenu timkiem;
private JMenu trogiup;
public static JMenu homthu;
private JMenuItem dangxuat;
private JMenuItem thoat;
private JMenuItem themsinhvien;
private JMenuItem thongke;
private JMenuItem chinhsuatt;
private JMenuItem help;
private JMenuItem more;
private JMenuItem themtk;
private JMenuItem xoatk;
private JMenuItem print;
private JMenuItem timkimgiaovien;
private JMenuItem timkiemhs;
private  JLabel bg = new JLabel();
private static  String button;
public static int chinhsuav;
public static String tkhs;
public static String tkgv;
public static int cuaso;
public static int letter;
public static Vector vData = new Vector();
public static Vector vTitle = new Vector();
JScrollPane tableResult;
public static DefaultTableModel model;
public static String idhomthu;
JTable tb = new JTable();
JButton remove , undoo , xuat , chinhsua , sapxep;
public static int selectedrow =0;
public viewAdmin() {

  if(cuaso==0){

 createwindowadmin();
 //menu();
}
else if (cuaso==1){
  createwindowadmin2();
}
}
public void createwindowadmin () {
  window = new JFrame();
  window.setUndecorated(true);
  menu();
  window.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
  window.setLayout(null);
  window.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\School-icon.png"));
  window.setTitle("giao diện dành cho Admin");
  ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\anime.jpg"));
 bg = new JLabel("",img,JLabel.CENTER);
 bg.setBounds(0, 0, 1050, 700);
 JLabel jl = new JLabel("Phím tắt");
 jl.setFont(new Font("Times new Roman", Font.BOLD , 19));
 jl.setForeground(Color.white);
 jl.setBounds(50, 0, 100, 60);
 JLabel jl1 = new JLabel("Thêm học sinh : ctrl + A");
 jl1.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl1.setForeground(Color.white);
 jl1.setBounds(10, 30, 300, 60);
 window.add(jl1);
 
 JLabel jl2 = new JLabel("Thống kê : ctrl + R");
 jl2.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl2.setForeground(Color.white);
 jl2.setBounds(10, 50, 300, 60);
 window.add(jl2);

 JLabel jl3 = new JLabel("Chỉnh sửa thông tin học sinh : ctrl + E");
 jl3.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl3.setForeground(Color.white);
 jl3.setBounds(10, 70,500, 60);
 window.add(jl3);

 JLabel jl4 = new JLabel("Thêm tài khoản giáo viên : alt + A");
 jl4.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl4.setForeground(Color.white);
 jl4.setBounds(10, 90, 300, 60);
 window.add(jl4);

 JLabel jl5 = new JLabel("Xóa tài khoản giáo viên : alt + R");
 jl5.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl5.setForeground(Color.white);
 jl5.setBounds(10, 110, 300, 60);
 window.add(jl5);

 JLabel jl6 = new JLabel("Tìm kiếm  học sinh : alt + S");
 jl6.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl6.setForeground(Color.white);
 jl6.setBounds(10, 130, 300, 60);
 window.add(jl6);

 JLabel jl7 = new JLabel("Tìm kiếm giáo viên : alt + F");
 jl7.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl7.setForeground(Color.white);
 jl7.setBounds(10, 150, 300, 60);
 window.add(jl7);

 JLabel jl8 = new JLabel("Trợ giúp : ctrl + H");
 jl8.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl8.setForeground(Color.white);
 jl8.setBounds(10, 170, 300, 60);
 window.add(jl8);

 JLabel jl9 = new JLabel("Xem thêm thông tin : ctrl + M");
 jl9.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl9.setForeground(Color.white);
 jl9.setBounds(10, 190, 300, 60);
 window.add(jl9);

 JLabel jl10 = new JLabel("Xuất file : ctrl + P");
 jl10.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl10.setForeground(Color.white);
 jl10.setBounds(10, 210, 300, 60);
 window.add(jl10);

 JLabel jl11 = new JLabel("Đăng xuất : ctrl + L");
 jl11.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl11.setForeground(Color.white);
 jl11.setBounds(10, 230, 300, 60);
 window.add(jl11);

 JLabel jl12 = new JLabel("Thoát : ctrl + X");
 jl12.setFont(new Font("Times new Roman", Font.BOLD , 15));
 jl12.setForeground(Color.white);
 jl12.setBounds(10, 250, 300, 60);
 window.add(jl12);
 window.add(jl);
 window.add(bg);
//  window.add(drawletter.jf);
  window.setSize(1050, 670);
  window.setResizable(false);
  window.setLocationRelativeTo(null);
  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  window.setVisible(true);
}
public void createwindowadmin2(){
  JPanel p = new JPanel();
  ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\justcolor.png"));
  bg = new JLabel("",img,JLabel.CENTER);
  bg.setBounds(0, 0, 1050, 700);
  remove = new JButton("xóa học sinh");
  remove.addActionListener(this);
  undoo = new JButton("trở lại");
  undoo.addActionListener(this);
  xuat = new JButton("In ra ds");
  xuat.addActionListener(this);
  chinhsua = new JButton("chỉnh sửa");
  chinhsua.addActionListener(this);
  sapxep = new JButton("sắp xếp");
  sapxep.addActionListener(this);
  undoo.setBackground(new java.awt.Color(125, 255, 255));
  chinhsua.setBackground(new java.awt.Color(125, 255, 255));
  remove.setBackground(new java.awt.Color(125, 255, 255));
  sapxep.setBackground(new java.awt.Color(125, 255, 255));
  xuat.setBackground(new java.awt.Color(125, 255, 255));

  p.add(undoo);
  p.add(chinhsua);
  p.add(remove);
  p.add(sapxep);
  p.add(xuat);
  new reload2();
  model = new DefaultTableModel(vData,vTitle);
  tb = new JTable(model);
  tb.addMouseListener(this);
  tb.setShowGrid(false);
  p.setBackground(new java.awt.Color(255, 255, 255) );
  tableResult = new JScrollPane(tb);
  window = new JFrame();
  window.add(p,"South");
  window.setUndecorated(true);
  menu();
  window.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
  window.getContentPane().add(tableResult,"North");
  window.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\School-icon.png"));
  window.setTitle("Chỉnh sửa thông tin học sinh");
  window.add(bg);
  window.setSize(1000, 680);
  window.setResizable(false);
  window.setLocationRelativeTo(null);
  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  window.setVisible(true);

}
public void menu (){
  menu=new JMenuBar(){

    public void paintComponent(Graphics g)
  
    {
  
    g.drawImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\anime.jpg"),0,0,this);
  
    }
  
   };
    menu.setBorder(null);
    window.setJMenuBar(menu);
    hethong = new JMenu("Hệ thống");
    hethong.setForeground(Color.white);
    hethong.addActionListener(this);
    quanli = new JMenu("Quản lí học sinh");
    quanli.setForeground(Color.white);
    taikhoan = new JMenu("tài khoản");
    taikhoan.setForeground(Color.white);
    timkiem = new JMenu("Search");
    timkiem.setForeground(Color.white);
    trogiup = new JMenu("Trợ giúp");
    trogiup.setForeground(Color.white);
JMenu homthu = new JMenu("Hòm thư");

 homthu.setBackground(new java.awt.Color (8,45,85));
    homthu.setForeground(Color.white);
    new checkletter();
    // kiểm tra nếu có thư
     if(letter!=0){
      homthu.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\mail1.png"));
      //set icon thư màu 
      new addthu();
      for(int i =0 ; i<addthu.list.size();i++){
        JMenuItem it = new JMenuItem(" "+addthu.list.get(i));
        it.addActionListener(this);
        homthu.add(it);
        homthu.addSeparator();
  //xem mỗi bức thư như 1 jmenuitem
      }
    }
    else if(letter==0){
      homthu.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\mail.png"));
    }
  hethong.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\system-icon.png"));
  quanli.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\student-icon.png"));
  trogiup.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\helpview-icon.png"));
  taikhoan.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\add-icon.png"));
  timkiem.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\search-icon.png"));
  menu.add(hethong);
  menu.add(quanli);
  menu.add(taikhoan);
  menu.add(timkiem);
  menu.add(trogiup);
  menu.add(homthu);
  // JMenuItem jm = new JMenuItem();
  // homthu.add(jm);
  
 dangxuat = new JMenuItem("đăng xuất", KeyEvent.VK_L);
dangxuat.addActionListener(this);
dangxuat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,InputEvent.CTRL_DOWN_MASK));
 thoat = new JMenuItem("thoát" , KeyEvent.VK_X);
thoat.addActionListener(this);
thoat.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.CTRL_DOWN_MASK));
themsinhvien = new JMenuItem("thêm học sinh" , KeyEvent.VK_A);
themsinhvien.addActionListener(this);
themsinhvien.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.CTRL_DOWN_MASK));
thongke = new JMenuItem("thống kê" , KeyEvent.VK_R);
thongke.addActionListener(this);
thongke.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_DOWN_MASK));
 chinhsuatt = new JMenuItem("chỉnh sửa thông tin học sinh", KeyEvent.VK_E);
chinhsuatt.addActionListener(this);
chinhsuatt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_DOWN_MASK));
 help = new JMenuItem("Help" , KeyEvent.VK_H);
help.addActionListener(this);
help.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_DOWN_MASK));
 more = new JMenuItem("More" , KeyEvent.VK_M);
more.addActionListener(this);
more.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,InputEvent.CTRL_DOWN_MASK));
 themtk = new JMenuItem("Thêm tài khoản giáo viên" , KeyEvent.VK_A);
themtk.addActionListener(this);
themtk.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,InputEvent.ALT_DOWN_MASK));
 xoatk = new JMenuItem("Xóa tài khoản giáo viên", KeyEvent.VK_R);
xoatk.addActionListener(this);
xoatk.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.ALT_DOWN_MASK));
timkimgiaovien = new JMenuItem("Tìm kiếm giáo viên", KeyEvent.VK_F);
 timkimgiaovien.addActionListener(this);
 timkimgiaovien.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F , InputEvent.ALT_DOWN_MASK));
 timkiemhs = new JMenuItem("Tìm kiếm học sinh", KeyEvent.VK_S);
 timkiemhs.addActionListener(this);
 timkiemhs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.ALT_DOWN_MASK));

//  JMenuItem jj = new JMenuItem("dasd");
//  homthu.add(jj);

 print = new JMenuItem("xuất file" , KeyEvent.VK_P);
print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,InputEvent.CTRL_DOWN_MASK));
print.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\print-icon.png"));
print.addActionListener(this);
dangxuat.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Logout-icon.png"));
thoat.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Close-icon.png"));
help.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Help-icon.png"));
more.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\about-icon.png"));
chinhsuatt.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Edit-icon.png"));
thongke.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\remove-icon.png"));
themsinhvien.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\addst-icon.png"));
themtk.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\newtc-icon.png"));
xoatk.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\removetc-icon.png"));
timkimgiaovien.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\tutor.png"));
timkiemhs.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\student.png"));
trogiup.add(help);
trogiup.addSeparator();
trogiup.add(more);
taikhoan.add(themtk);
taikhoan.addSeparator();
taikhoan.add(xoatk);
quanli.add(themsinhvien);
quanli.addSeparator();
quanli.add(thongke);
quanli.addSeparator();
quanli.add(chinhsuatt);
hethong.add(print);
hethong.addSeparator();
hethong.add(dangxuat);
hethong.addSeparator();
hethong.add(thoat);
timkiem.add(timkimgiaovien);
timkiem.addSeparator();
timkiem.add(timkiemhs);
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
  else if (button.equals("xuất file")){
    new nhapnamefile();
  }
  else if(button.equals("thoát")){
    System.exit(0);
  }
  else if (button.equals("Thêm tài khoản giáo viên")){
    new Addteachers("" , "" , "" , "", 
    "" , "" );
  }
  else if(button.equals("Xóa tài khoản giáo viên")){
    new removetc();
  }
  else if (button.equals("Tìm kiếm giáo viên")){
    new nhapidtk();
  }
  else if (button.equals("Tìm kiếm học sinh")){
    new nhapidtkhs();
  }
  else if (button.equals("thêm học sinh")){
   if(cuaso==1){ window.setVisible(false);
   }
    new addhs("thêm học sinh","", "", "", 0.0, "", "", "");
    
  }
  else if(button.equals("chỉnh sửa thông tin học sinh")){
window.setVisible(false);
         viewAdmin.cuaso = 1;
         new viewAdmin();
    
  }
  else if(cuaso==1&&button.equals("trở lại")){
cuaso =0;
window.setVisible(false);
new viewAdmin();
  }
  else if (cuaso==1&&button.equals("xóa học sinh")){
    new deletehs();
    new reload2();
  }
  else if(cuaso==1&&button.equals("chỉnh sửa")){
    Vector st = (Vector)vData.elementAt(selectedrow);
   chinhsuav =2;
    new addhs("chỉnh sửa thông tin học sinh",(String)st.elementAt(0), (String)st.elementAt(1),(String)st.elementAt(2),  0.0, "", "", "");
  }
  else if (cuaso==1&&button.equals("sắp xếp")){
    window.setVisible(false);
    new selectchoose();
  }
  else if(cuaso==1&&button.equals("In ra ds")){
    new nhapnamefile();
  }
  else if(button.equals("thống kê")){
    new bieudo();
  }
  else {
     for(int i =0 ; i < addthu.list.size();i++){
    if(button.equals(" "+addthu.list.get(i))){
      // System.out.println(addthu.listid.get(i));
      idhomthu =addthu.listid.get(i);
      new viewthu();

  
    }
    }
  }
  // else if(button.equals("Hom thu")){
  //  new drawletter();
  // }

}
@Override
public void mouseClicked(MouseEvent arg0) {
  // TODO Auto-generated method stub
  selectedrow = tb.getSelectedRow();
  
}
@Override
public void mouseEntered(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
}
@Override
public void mouseExited(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
}
@Override
public void mousePressed(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
}
@Override
public void mouseReleased(MouseEvent arg0) {
  // TODO Auto-generated method stub
  
}
}

