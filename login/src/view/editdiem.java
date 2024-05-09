package view;
import controller.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class editdiem extends JFrame implements ActionListener {
    private JButton ok;
    private JButton cancel;
    private JLabel idhs;
    private JTextField idhstf;
    private JLabel namehs;
    private JTextField namehstf;
    private JLabel ngaysinh;
    private JTextField ngaysinhtf;
    private JLabel nguv;
    private JTextField nguvan;
    private JLabel toanv;
    private JTextField toan;
    private JLabel tienga;
    private JTextField tienganh;
    private JFrame ediths;
    public static String ids;
    public static String names;
    public static String ngaysinhs;
    public static Double diemnguvan;
    public static Double diemtoan;
    public static Double diemtienganh;
    private Double a;
    private Double b;
    
    private Double c;
public editdiem(String s , String id , String ten , String tuoi ,String nguvans , 
String toans, String tienganhs){
    super(s);
    Font font = new Font("Times new Roman", Font.BOLD | Font.PLAIN, 17);
    ediths = new JFrame(s);
    ediths.setFont(font);
    ediths.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    ediths.setSize(420, 550);
    ediths.setLocationRelativeTo(null);
    ediths.setResizable(false);
 JPanel cont = new JPanel();
 cont.setBackground(new java.awt.Color(185, 245, 245) );
 cont.setLayout(new GridLayout(7,2));
 idhs = new JLabel("ID học sinh");
 idhs.setForeground(Color.black);
 idhstf = new JTextField(id);
 idhstf.setEditable(false);
 idhstf.setForeground(Color.black);
 namehs = new JLabel("Họ và tên");
 namehs.setForeground(Color.black);
  namehstf = new JTextField(ten);
  namehstf.setEditable(false);
  namehstf.setForeground(Color.black);
  ngaysinh = new JLabel("Ngày sinh");
  ngaysinh.setForeground(Color.black);
  ngaysinhtf = new JTextField(tuoi);
  ngaysinhtf.setEditable(false);
  ngaysinhtf.setForeground(Color.black);
  nguv = new JLabel("điểm ngữ văn");
  nguv.setForeground(Color.black);
  nguvan = new JTextField(nguvans);
  nguvan.setForeground(Color.black);
  toanv = new JLabel("điểm toán");
  toanv.setForeground(Color.black);
  toan = new JTextField(toans);
   toan.setForeground(Color.black);
   tienga = new JLabel("điểm tiếng anh");
   tienga.setForeground(Color.black);
   tienganh = new JTextField(tienganhs);
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
nguvan.setBackground(Color.white);
toan.setBackground(Color.white);
idhs.setFont(font);
idhstf.setFont(font);
namehs.setFont(font);
namehstf.setFont(font);
ngaysinh.setFont(font);
ngaysinhtf.setFont(font);
nguv.setFont(font);
nguvan.setFont(font);
toanv.setFont(font);
toan.setFont(font);
tienganh.setFont(font);
tienga.setFont(font);
tienganh.setBackground(Color.white);
 cont.add(idhs);
  cont.add(idhstf);
 cont.add(namehs);
 cont.add(namehstf);
 cont.add(ngaysinh);
 cont.add(ngaysinhtf);
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
ediths.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
ediths.setContentPane(con);
ediths.setUndecorated(true);
ediths.setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
        if(e.getActionCommand().equals("Cancel")){
            ediths.setVisible(false);
           
        }
        else if(e.getActionCommand().equals("OK")){
            if(idhstf.getText().equals("")||namehstf.getText().equals("")||ngaysinhtf.getText().equals("")||nguvan.getText().equals("")||toan.getText().equals("")||tienganh.getText().equals("")){
              JOptionPane.showMessageDialog(rootPane, "Thông tin không được rỗng.","Edit student error",
              JOptionPane.ERROR_MESSAGE);

            }
            else{
                try{
                     a = Double.parseDouble(nguvan.getText());
                     b = Double.parseDouble(toan.getText());
                     c = Double.parseDouble(tienganh.getText());
                    
             if(a<0||a>10||b<0||b>10||c<0||c>10){
                JOptionPane.showMessageDialog(rootPane, "điểm nằm ngoài vùng cho phép !!","enter error",
                JOptionPane.ERROR_MESSAGE);
             }
            else if(a>=0&&a<=10&&b>=0&&b<=10&&c>=0&&c<=10){
                ids = idhstf.getText();
                names = namehstf.getText();
                ngaysinhs = ngaysinhtf.getText();
                diemnguvan =Double.parseDouble(nguvan.getText());
               diemtoan = Double.parseDouble(toan.getText());
               diemtienganh =  Double.parseDouble(tienganh.getText());
            
                new deletehsviewtc();
                new nhapdiemhs();
                new reload3();
               new thongtinhs();
              
               ediths.setVisible(false);
            }
                }
                catch(Exception q){
                    JOptionPane.showMessageDialog(rootPane, "sai kiểu dữ liệu điểm !!","enter error",
                    JOptionPane.ERROR_MESSAGE);
                    new nhapdiem();
                }
    


            //     ids = idhstf.getText();
            //     names = namehstf.getText();
            //     ngaysinhs = ngaysinhtf.getText();
            //     diemnguvan =Double.parseDouble(nguvan.getText());
            //    diemtoan = Double.parseDouble(toan.getText());
            //    diemtienganh =  Double.parseDouble(tienganh.getText());
            
            //     new deletehsviewtc();
            //     new nhapdiemhs();
            //     new reload3();
            //    new thongtinhs();
              
            //    ediths.setVisible(false);
            }
        }
     }
}

