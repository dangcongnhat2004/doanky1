package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;
public class phuckhao extends JFrame implements ActionListener {
    private JFrame jf ;
    private JLabel tieude ;
    public static JTextField nodungtieude ;
    private JLabel nguvan;
    private JLabel toan;
    private JLabel tienganh;
    public static JCheckBox cb ;
    public static JCheckBox cb1 ;
    public static JCheckBox cb2;
    private JLabel noidung;
    public static String chonnguvan;
    public static String chontoan;
    public static String chontienganh;
    public static JTextArea jta;
    private JButton ok , cancle; 
    public phuckhao(){ 
        jf = new JFrame("Phúc khảo ");
        JLabel donphuckhao = new JLabel("Đơn Phúc Khảo");
        donphuckhao.setFont(new Font("Times New Roman", Font.BOLD | Font.PLAIN , 22));
        Font font = new Font("Times new Roman", Font.BOLD | Font.PLAIN , 18);
        jf.setLayout(null);
        tieude = new JLabel("Tiêu đề");
        nodungtieude = new JTextField();
        nguvan = new JLabel("Ngữ văn");
        toan = new JLabel("Toán");
        tienganh = new JLabel("Tiếng anh");
        cb = new JCheckBox("1");
        cb.addActionListener(this);
        cb1 = new JCheckBox("2");
        cb1.addActionListener(this);
        cb2 = new JCheckBox("3");
        cb2.addActionListener(this);
        noidung = new JLabel("Ghi chú");
        jta = new JTextArea();
        JScrollPane jp = new JScrollPane(jta);
        add(jp, BorderLayout.CENTER);
        pack();
        donphuckhao.setBounds(110, 0, 1000, 40);
        tieude.setBounds(20, 50, 100, 40);
        tieude.setFont(font);
        nodungtieude.setFont(font);
        nodungtieude.setBounds( 100, 50, 300, 40);
        nguvan.setBounds(20, 150, 100, 40);
        nguvan.setFont(font);
        cb.setBounds(100, 150, 40, 40);
        JLabel chon = new JLabel("Chọn môn phúc khảo");
        chon.setFont(new Font("Times new roman", Font.BOLD , 20));
        chon.setBounds(100, 100, 200, 40);
        toan.setFont(font);
        toan.setBounds(20, 180, 100,40);
        cb1.setBounds(100, 180, 40, 40);
        tienganh.setFont(font);
        tienganh.setBounds(20, 210, 100,40);
        cb2.setBounds(100, 210, 40, 40);
        noidung.setFont(new Font("Times new roman", Font.BOLD | Font.PLAIN , 22));
        noidung.setBounds(150, 250, 100, 40);
        jta.setFont(font);
        jta.setBounds(20, 300, 350, 200);
        ok = new JButton("ok");
        ok.addActionListener(this);
        ok.setBounds(60, 510, 100, 60);
        cancle = new JButton("cancle");
        cancle.addActionListener(this);
        cancle.setBounds(230, 510, 100, 60);
        jf.add(ok);
        jf.add(cancle);
        jf.add(jta);
        jf.add(noidung);
        jf.add(cb1);
        jf.add(tienganh);
        jf.add(cb2);
        jf.add(toan);
        jf.add(chon);
        jf.add(donphuckhao);
        jf.add(tieude);
        jf.add(nodungtieude);
        jf.add(cb);
        jf.add(nguvan);
        jf.setSize(400, 600);
        jf.setUndecorated(true);
        jf.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getActionCommand().equals("cancle")){
            jf.setVisible(false);
        }
        else if (e.getActionCommand().equals("ok")){
            if(cb.isSelected()==true){
               chonnguvan = "ngữ văn";
            }
            if(cb1.isSelected()==true){
                chontoan = "toán";
             }
             if(cb2.isSelected()==true){
                chontienganh = "tiếng anh";
             }
             if(cb.isSelected()==false){
                chonnguvan = "";
             }
             if(cb1.isSelected()==false){
                 chontoan = "";
              }
              if(cb2.isSelected()==false){
                 chontienganh = "";
              }
            new xuatdonphuckhao();
            jf.setVisible(false
            
            );
        }
        
    }
    
}
