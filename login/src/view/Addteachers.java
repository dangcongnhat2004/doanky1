package view;
import controller.*;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
public class Addteachers extends JFrame implements ActionListener {
    private JLabel IDgv;
    private JTextField IDgvtf;
    private JLabel tengv;
    private JTextField tengvtf;
    private JLabel namsinhgv;
    private  JDateChooser namsinhgvtf;
    private JLabel chucvul;
    private JComboBox chucvucb;
    private JLabel taikhoans;
    private JTextField taikhoantf;
    private JLabel matkhaus;
    private JPasswordField matkhautf;
    private JLabel matkhauag;
    private JPasswordField matkhautfag;
    private JButton ok;
    private JButton cancel;
    private JFrame addtc;
    private String check;
    public static String idv;
    public static String tenv;
    public static String namsinhv;
    public static String chucvuv;
    public static String taikhoanv;
    public static String matkhauv;
    private  SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
    // chỉnh định dạng ngày về giống kiểu date bên sql
        public Addteachers(String ID1 , String ten , String tuoi , String chucvu , 
        String taikhoan , String matkhau ){
            Font font = new Font("Times new Roman", Font.BOLD | Font.PLAIN, 17);
addtc = new JFrame("Tạo tài khoản giáo viên");
addtc.setFont(font);
// addtc.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\vku.png"));
addtc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
addtc.setSize(400, 550);
addtc.setLocationRelativeTo(null);
addtc.setResizable(false);
JPanel cont = new JPanel();
cont.setLayout(new GridLayout(8,2));
cont.setBackground(new java.awt.Color(255, 255, 190) );
IDgv = new JLabel("ID");
IDgv.setFont(font);
IDgvtf = new JTextField(ID1);
cont.add(IDgv);
cont.add(IDgvtf);
tengv = new JLabel("Tên");
tengv.setFont(font);
tengvtf = new JTextField(ten);
cont.add(tengv);
cont.add(tengvtf);
namsinhgv = new JLabel("Năm sinh");
namsinhgv.setFont(font);
namsinhgvtf = new JDateChooser();
java.util.Date date = new java.util.Date();
namsinhgvtf.setDate(date);
cont.add(namsinhgv);
cont.add(namsinhgvtf);
chucvul = new JLabel("Chức vụ");
chucvul.setFont(font);
String [] as = new String []{"giáo viên coi thi","giáo viên chấm điểm"};
chucvucb = new JComboBox<String>(as);
chucvucb.setBackground(Color.white);
chucvucb.setFont(font);
cont.add(chucvul);
cont.add(chucvucb);
taikhoans = new JLabel("Tài khoản");
taikhoans.setFont(font);
taikhoantf = new JTextField(taikhoan);
cont.add(taikhoans);
cont.add(taikhoantf);
matkhaus = new JLabel("nhập mật khẩu");
cont.add(matkhaus);
matkhaus.setFont(font);
matkhautf = new JPasswordField(matkhau);
cont.add(matkhautf);
matkhauag = new JLabel("Nhập lại mật khẩu");
matkhauag.setFont(font);
matkhautfag = new JPasswordField(check);
matkhauag.setForeground(Color.black);
IDgv.setForeground(Color.BLACK);
IDgvtf.setForeground(Color.BLACK);
tengv.setForeground(Color.BLACK);
tengvtf.setForeground(Color.BLACK);
namsinhgv.setForeground(Color.BLACK);
namsinhgvtf.setForeground(Color.BLACK);
chucvul.setForeground(Color.BLACK);
chucvucb.setForeground(Color.BLACK);
taikhoans.setForeground(Color.BLACK);
matkhauag.setForeground(Color.BLACK);
taikhoantf.setForeground(Color.black);
matkhautf.setForeground(Color.BLACK);

cont.add(matkhauag);
cont.add(matkhautfag);
ok = new JButton("OK");
ok.setFont(new Font ("Times New Roman" , Font.PLAIN | Font.BOLD , 21));
ok.setForeground(Color.black);
ok.setBackground(Color.WHITE);
cancel = new JButton("Cancel");
cancel.setForeground(Color.black);
cancel.setBackground(Color.WHITE);
cancel.setFont(new Font ("Times New Roman" , Font.PLAIN | Font.BOLD , 21));
cont.add(ok);
cont.add(cancel);
ok.addActionListener(this);
cancel.addActionListener(this);
Container con = this.getContentPane();
con.setBackground(Color.BLUE);
con.setLayout(new BorderLayout());
JPanel jp = new JPanel();
jp.setLayout(new GridLayout());
JLabel reg = new JLabel("Tạo tài khoản gv");
reg.setFont(new Font("Times New Roman" , Font.BOLD , 24));
ImageIcon iscon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\usercon.png");
JLabel iconreg = new JLabel(iscon);
jp.setBackground(new java.awt.Color(255, 255, 190) );
jp.add(iconreg);
jp.add(reg);
con.add(jp,BorderLayout.NORTH);
con.add(cont, BorderLayout.CENTER);
addtc.setContentPane(con);
addtc.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
addtc.setUndecorated(true);
addtc.setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Cancel")){
            addtc.setVisible(false);
          
        }
        else if(e.getActionCommand().equals("OK")){
            if(IDgvtf.getText().equals("")||tengvtf.getText().equals("")||taikhoantf.getText().equals("")||matkhautf.getText().equals("")
            ||dcn.format(namsinhgvtf.getDate()).equals("") ){
       // new adderror();
       JOptionPane.showMessageDialog(rootPane, "Thông tin không được rỗng.","Add Teacher error",
       JOptionPane.ERROR_MESSAGE);
                
            }
            else{
            if(matkhautfag.getText().equals(matkhautf.getText())){
                idv = IDgvtf.getText();
                tenv = tengvtf.getText();
                namsinhv = dcn.format(namsinhgvtf.getDate());
                chucvuv = (String)chucvucb.getSelectedItem();
                taikhoanv = taikhoantf.getText();
                matkhauv = matkhautf.getText();
                new addteachercontrol();
                addtc.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "2 mật khẩu không giống nhau.","password error",
                JOptionPane.ERROR_MESSAGE);
            }
        }
        }
    }
    
}
