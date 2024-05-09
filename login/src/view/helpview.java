package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class helpview extends JFrame implements ActionListener {
    private Container cont;
    private JButton undoo;
    public helpview (){
        Font font = new Font("Times New Roman", Font.BOLD , 14 );
        cont = this.getContentPane();
        cont.setLayout(null);
        JLabel ttll = new JLabel("Thông tin liên lạc");
        ttll.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cont.add(ttll);
        ttll.setBounds(170, -40, 300, 100);

ImageIcon iscon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\rsz_ths.jpg");
 JLabel label = new JLabel(iscon);
cont.add(label);
label.setBounds(0, 0, 150, 200);
JLabel ten = new JLabel("Tên : Tô Hiếu Ngoan");
ten.setFont(font);
JLabel diachi = new JLabel("Địa chỉ liên hệ : Quận Ngũ Hành Sơn, Đà Nẵng");
diachi.setFont(font);
JLabel sdt = new JLabel("sdt liên hệ : 0987654321");
sdt.setFont(font);
JLabel email = new JLabel("Email : ngoanth.22it@vku.udn.vn");
email.setFont(font);
cont.add(ten);
cont.add(email);
cont.add(diachi);
cont.add(sdt);
ten.setBounds(150, 0, 200, 100);
sdt.setBounds(150, 30, 200, 100);
email.setBounds(150, 60, 400, 100);
diachi.setBounds(150, 90, 500, 100);
Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
 undoo = new JButton("trở lại");
 undoo.setIcon(icon);
 undoo.setSize(50, 100);
 undoo.addActionListener(this);
 cont.add(undoo);
 undoo.setBounds(190, 210, 110, 50);
 undoo.setBackground(Color.white);
       this.setSize(500, 300);
       this.setTitle("Help view");
       this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\Help-icon.png"));
       this.setResizable(false);
       this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       this.setLocationRelativeTo(null);
       this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("trở lại")){
     this.setVisible(false);
    }
}

}
