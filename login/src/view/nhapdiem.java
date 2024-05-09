package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import controller.*;

public class nhapdiem extends JFrame implements ActionListener {
    private JFrame jf = new JFrame();
    private JLabel id ;
    private JTextField idd;
    private JLabel nguvan ;
    private JTextField diemnguvan;
    private JLabel toan ;
    private JTextField diemtoan;
    private JLabel tienganh ;
    private JTextField diemtienganh;
    private JButton ok = new JButton();
    private JButton cancle = new JButton();
    public static String idst;
    public static String diemtoanst;
    public static String diemnguvanst;
    public static String diemtienganhst;
    private Double a;
    private Double b;
    private Double c;
public nhapdiem(){
    jf = new JFrame();
    jf.setUndecorated(true);
    jf.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
    id = new JLabel("nhập ID học sinh :");
    idd = new JTextField();
    nguvan = new JLabel("nhập điểm ngữ văn");
    diemnguvan = new JTextField();
    toan = new JLabel("nhập điểm toán");
    diemtoan = new JTextField();
    tienganh = new JLabel("nhập điểm tiếng anh");
    diemtienganh = new JTextField();
    ok = new JButton("OK");
    cancle = new JButton("Cancle");
    ok.addActionListener(this);
    cancle.addActionListener(this);
    jf.add(id);
    jf.add(idd);
    jf.add(nguvan);
    jf.add(diemnguvan);
    jf.add(toan);
    jf.add(diemtoan);
    jf.add(tienganh);
    jf.add(diemtienganh);
    jf.add(ok);
    jf.add(cancle);
    jf.setTitle("nhập điểm học sinh");
    jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    jf.setLayout(new GridLayout(5,2));
    jf.setSize(300,400);
    jf.setLocationRelativeTo(null);
    jf.setResizable(false);
    jf.setVisible(true);

}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("Cancle")){
            jf.setVisible(false);
        }
        else {
            try{
                 a = Double.parseDouble(diemtoan.getText());
                 b = Double.parseDouble(diemtienganh.getText());
                 c = Double.parseDouble(diemnguvan.getText());
                
         if(a<0||a>10||b<0||b>10||c<0||c>10){
            JOptionPane.showMessageDialog(rootPane, "điểm nằm ngoài vùng cho phép !!","enter error",
            JOptionPane.ERROR_MESSAGE);
         }
        else if(a>=0&&a<=10&&b>=0&&b<=10&&c>=0&&c<=10){
            idst = idd.getText();
            diemtoanst = diemtoan.getText();
            diemtienganhst = diemtienganh.getText();
            diemnguvanst = diemnguvan.getText();
            new nhapdiemhs();
            jf.setVisible(false);
        }
            }
            catch(Exception q){
                JOptionPane.showMessageDialog(rootPane, "sai kiểu dữ liệu điểm !!","enter error",
                JOptionPane.ERROR_MESSAGE);
                new nhapdiem();
            }

        }
    }
    
}
