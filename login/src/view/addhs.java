package view;
import controller.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

import java.awt.*;
import java.awt.event.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class addhs extends JFrame implements ActionListener {
    private JButton ok;
    private JButton cancel;
    private JLabel idhs;
    private JTextField idhstf;
    private JLabel namehs;
    private JTextField namehstf;
     private JLabel gioitinh;
    private JComboBox gtcb;
    private JLabel ngaysinh;
    private JDateChooser ngaysinhtf ;
    private JLabel uut;
    private JComboBox uutien;
    private JLabel nguv;
    private JComboBox nguvan;
    private JLabel toanv;
    private JComboBox toan;
    private JLabel tienga;
    private JComboBox tienganh;
    private JFrame addhs;
    public static String ids;
    public static String names;
    public static String ngaysinhs;
    public static Double diemuutien;
    public static String phongthinguvan;
    public static String phongthitoan;
    public static String phongthitienganh;
    public static String gtst;
  private  SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
public addhs(String s , String id , String ten , String tuoi , Double diemuutien,String nguvans , 
String toans, String tienganhs){
    super(s);
    Font font = new Font("Times new Roman", Font.BOLD | Font.PLAIN, 17);
    addhs = new JFrame(s);
    addhs.setFont(font);
addhs.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\student.png"));
addhs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
addhs.setSize(420, 550);
addhs.setLocationRelativeTo(null);
addhs.setResizable(false);
JPanel cont = new JPanel();
cont.setBackground(new java.awt.Color(185, 245, 245) );
cont.setLayout(new GridLayout(9,2));
idhs = new JLabel("ID học sinh");
idhs.setForeground(Color.black);
idhstf = new JTextField(id);
idhstf.setForeground(Color.black);
if(s.equals("chỉnh sửa thông tin học sinh")){
  idhstf.setEditable(false);
}
else {
  idhstf.setEditable(true);
}
namehs = new JLabel("Họ và tên");
namehs.setForeground(Color.black);
 namehstf = new JTextField(ten);
 namehstf.setForeground(Color.black);
 ngaysinh = new JLabel("Ngày sinh");
 ngaysinh.setForeground(Color.black);
 ngaysinhtf = new JDateChooser();
 ngaysinhtf.setForeground(Color.black);
 java.util.Date date = new java.util.Date();
 ngaysinhtf.setDate(date);
 String [] phong = new String []{"201","202","203","204","205"};
 Double [] dut = new Double []{0.0,0.25,0.5,0.75,1.0,1.25,1.5,1.75,2.0};
  String [] gt = new String []{"Nam","nữ"};
  gioitinh = new JLabel("Giới tính");
 gioitinh.setForeground(Color.black);
 gtcb = new JComboBox<>(gt);
 gtcb.setForeground(Color.black);
 uut = new JLabel("Điểm ưu tiên");
 uut.setForeground(Color.black);
 uutien = new JComboBox<>(dut);
 uutien.setForeground(Color.black);
 nguv = new JLabel("Phòng thi ngữ văn");
 nguv.setForeground(Color.black);
 nguvan = new JComboBox<>(phong);
 nguvan.setForeground(Color.black);
 toanv = new JLabel("Phòng thi toan");
 toanv.setForeground(Color.black);
 toan = new JComboBox<>(phong);
 toan.setForeground(Color.black);
  tienga = new JLabel("Phòng thi tiếng anh");
  tienga.setForeground(Color.black);
  tienganh = new JComboBox<>(phong);
  tienganh.setForeground(Color.black);
  ok = new JButton("OK");
  ok.setFont(new Font ("Times New Roman" , Font.PLAIN | Font.BOLD , 21));
  ok.setForeground(Color.black);
  ok.addActionListener(this);
  cancel = new JButton("Cancel");
  cancel.setForeground(Color.black);
cancel.setFont(new Font ("Times New Roman" , Font.PLAIN | Font.BOLD , 21));
cancel.addActionListener(this);
ok.setBackground(Color.white);
cancel.setBackground(Color.white);
uutien.setBackground(Color.white);
nguvan.setBackground(Color.white);
toan.setBackground(Color.white);
gtcb.setBackground(Color.white);
idhs.setFont(font);
idhstf.setFont(font);
namehs.setFont(font);
namehstf.setFont(font);
ngaysinh.setFont(font);
ngaysinhtf.setFont(font);
uut.setFont(font);
uutien.setFont(font);
nguv.setFont(font);
nguvan.setFont(font);
toanv.setFont(font);
toan.setFont(font);
tienganh.setFont(font);
tienga.setFont(font);
gioitinh.setFont(font);
gtcb.setFont(font);
tienganh.setBackground(Color.white);
cont.add(idhs);
 cont.add(idhstf);
 cont.add(namehs);
 cont.add(namehstf);
 cont.add(gioitinh);
 cont.add(gtcb);
 cont.add(ngaysinh);
 cont.add(ngaysinhtf);
 cont.add(uut);
 cont.add(uutien);
 cont.add(nguv);
  cont.add(nguvan);
  cont.add(toanv);
  cont.add(toan);
  cont.add(tienga);
  cont.add(tienganh);
  cont.add(ok);
  cont.add(cancel);
  Container con = this.getContentPane();
con.setBackground(Color.BLUE);
con.setLayout(new BorderLayout());
JPanel jp = new JPanel();
jp.setBackground(new java.awt.Color(185, 245, 245) );
jp.setLayout(new GridLayout());
JLabel reg = new JLabel("Thông tin học sinh");
reg.setFont(new Font("Times New Roman" , Font.BOLD | Font.PLAIN, 24));
ImageIcon iscon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Student-3-icon.png");
JLabel iconreg = new JLabel(iscon);
jp.add(iconreg);
jp.add(reg);
con.add(jp,BorderLayout.NORTH);
con.add(cont, BorderLayout.CENTER);
addhs.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
addhs.setContentPane(con);
addhs.setUndecorated(true);
addhs.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("Cancel")){
            addhs.setVisible(false);
            if(viewAdmin.cuaso==1){
                new viewAdmin();
            }
        }
        else if(e.getActionCommand().equals("OK")){
            if(idhstf.getText().equals("")||namehstf.getText().equals("")){
              //  new adderror();
              JOptionPane.showMessageDialog(rootPane, "Thông tin không được rỗng.","Add Teacher error",
              JOptionPane.ERROR_MESSAGE);

            }
            else{
                ids = idhstf.getText();
                names = namehstf.getText();
            ngaysinhs = dcn.format(ngaysinhtf.getDate() );
                diemuutien =(Double) uutien.getSelectedItem();
               phongthinguvan =(String) nguvan.getSelectedItem();
               phongthitoan = (String) toan.getSelectedItem();
               phongthitienganh = (String) tienganh.getSelectedItem();
               String q = (String)gtcb.getSelectedItem();
               if(q.equals("Nam")){
                gtst = "True";
               }
               else {
                gtst = "False";
               }
              if(viewAdmin.cuaso==0){
               new addhscontrol();
              }
               if(viewAdmin.cuaso==1&&viewAdmin.chinhsuav==0){
               // new deletehs();
                new addhscontrol();
                new reload2();
                new viewAdmin();
              }
              if(viewAdmin.cuaso==1&&viewAdmin.chinhsuav==2){
                viewAdmin.chinhsuav =0;
                 new deletehs();
                 new addhscontrol();
                 new reload2();
                 new viewAdmin();
               }
               addhs.setVisible(false);
             }
        }
    }
}

