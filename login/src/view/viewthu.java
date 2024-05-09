package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;
public class viewthu extends JFrame implements ActionListener {
    private JButton undo , hoso , donphuckhao;
    private JPanel panel = new JPanel();
    private JPanel panel2 = new JPanel();
    private  JFrame jf = new JFrame();
    public static String ten ;
    public static String namsinh ;
    public static String diemuutien;
    public static String diemvan;
    public static String diemtoan;
    public static String diemtienganh;
    public static String noidungtieude;
    public static String monphuckhao;
    public static String ghichu;
    public viewthu(){
        new updatetinhtrang();
        new updatetinhtrang2();
         jf = new JFrame("Hồ sơ phúc khảo");
        jf.setSize(400, 600);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        undo = new JButton("trở về");
        hoso = new JButton("xem hồ sơ học sinh");
        donphuckhao = new JButton("đơn phúc khảo");
        hoso.setBounds(0, 0, 200, 35);
        hoso.setBackground(Color.WHITE);
        hoso.setForeground(Color.black);
        jf.add(hoso);
        donphuckhao.setBounds(200, 0, 200, 35);
        donphuckhao.setBackground(Color.WHITE);
        donphuckhao.setForeground(Color.black);
        jf.add(hoso);
        jf.add(donphuckhao);
        undo = new JButton("Trở lại");
        undo.setBackground(Color.yellow);
        undo.setForeground(Color.black);
        undo.setBounds(0, 520, 100,40);
        undo.setBorder(null);
        jf.add(undo);   
        undo.addActionListener(this);
        donphuckhao.addActionListener(this);
        hoso.addActionListener(this);
        cuasohoso();
        thongtinphuckhao();
        jf.setResizable(false);
        jf.setVisible(true);

    }
    public void cuasohoso(){
        panel = new JPanel();
        Font font = new Font("Times New Roman" , Font.PLAIN | Font.BOLD , 18);
        panel.setLayout(new GridLayout(10,1));
        panel.setBounds(20, 20, 400, 600);
        JLabel tieude = new JLabel("   XEM THÔNG TIN HỌC SINH");
        tieude.setForeground(Color.black);
        tieude.setFont(new Font("Times New Roman" , Font.PLAIN | Font.BOLD , 22));
        JLabel jl = new JLabel("id học sinh : " +viewAdmin.idhomthu);
        jl.setFont(font);
        jl.setForeground(Color.black);
        panel.add(tieude);
        panel.add(jl);
        new thongtinhspk();
        JLabel jl1 = new JLabel("tên học sinh : " +ten);
        jl1.setFont(font);
        jl1.setForeground(Color.black);
        panel.add(jl1);
        JLabel jl2 = new JLabel("tuổi học sinh : " +namsinh);
        jl2.setFont(font);
        jl2.setForeground(Color.black);
        panel.add(jl2);
        JLabel jl3  = new JLabel("điểm ưu tiên : " +diemuutien);
        jl3.setFont(font);
        jl3.setForeground(Color.black);
        panel.add(jl3);
        JLabel jl4 = new JLabel("điểm văn : " +diemvan);
        jl4.setFont(font);
        jl4.setForeground(Color.black);
        panel.add(jl4);
        JLabel jl5 = new JLabel("điểm toán : " +diemtoan);
        jl5.setFont(font);
        jl5.setForeground(Color.black);
        panel.add(jl5);
        JLabel jl6 = new JLabel("điểm tiếng anh : " +diemtienganh);
        jl6.setFont(font);
        jl6.setForeground(Color.black);
        panel.add(jl6);



         jf.add(panel);

    }
    public void thongtinphuckhao(){
        panel2 = new JPanel();
        Font font = new Font("Times new Roman", Font.BOLD | Font.PLAIN , 18);
        panel2.setLayout(null);
        panel2.setBounds(20, 20, 400, 600);
        JLabel jl = new JLabel("XEM HỒ SƠ PHÚC KHẢO");
        jl.setForeground(Color.black);
        jl.setFont(new Font("Times New Roman" , Font.PLAIN | Font.BOLD , 22));
         jl.setBounds(20, 15, 1000, 30);
         JLabel jl2 = new JLabel("Tiêu đề : "+noidungtieude);
        jl2.setFont(font);
        jl2.setForeground(Color.black);
        jl2.setBounds(40, 80, 1000, 30);
        panel2.add(jl2);
        JLabel jl3 = new JLabel("Môn phúc khảo : "+monphuckhao);
        jl3.setFont(font);
        jl3.setForeground(Color.black);
        jl3.setBounds(40, 130, 1000, 30);
        JLabel jl4 = new JLabel("Nội dung :");
        jl4.setFont(font);
        jl4.setForeground(Color.black);
        jl4.setBounds(40, 200, 200, 30);
        panel2.add(jl4);
        JTextArea jt = new JTextArea(ghichu);
        jt.setEditable(false);
        jt.setForeground(Color.black);
        jt.setFont(font);
        jt.setBounds(00, 240, 350, 300);
        JScrollPane jp = new JScrollPane(jt);
        add(jp);
        panel2.add(jt);
        panel2.add(jl3);
         panel2.add(jl);
         jf.add(panel2);
        // panel2
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("Trở lại")){
            jf.setVisible(false);
        }
        else if(e.getActionCommand().equals("đơn phúc khảo")){
            panel.setVisible(false);
            panel2.setVisible(true);
            jf.add(panel2);
        }
        else if(e.getActionCommand().equals("xem hồ sơ học sinh")){
            panel2.setVisible(false);
            panel.setVisible(true);
            jf.add(panel);
        }
    }
}
