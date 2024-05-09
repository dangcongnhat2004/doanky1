package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Moreview extends JFrame implements ActionListener {
    private Container cont;
    private JButton undoo;
    public Moreview (){
        Font font = new Font("Times New Roman", Font.BOLD , 14 );
        cont = this.getContentPane();
        cont.setLayout(null);
        JLabel ttll = new JLabel("Thông tin ứng dụng");
        ttll.setFont(new Font("Times New Roman", Font.BOLD, 20));
        cont.add(ttll);
        ttll.setBounds(170, -40, 300, 100);

ImageIcon iscon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\logo.png");
 JLabel label = new JLabel(iscon);
cont.add(label);
label.setBounds(0, 30, 159, 159);
JLabel ten = new JLabel("Tên : Mô hình quản lí tuyển sinh lớp 10");
ten.setFont(font);
JLabel thongtin = new JLabel("Thông tin : Đồ án cuối kì môn java ") ;
 JLabel thongtinn = new JLabel("của Tô Hiếu Ngoan.");
thongtin.setFont(font);
thongtinn.setFont(font);
JLabel phienban = new JLabel("mã sv : 22IT183");
phienban.setFont(font);
JLabel ngaylam = new JLabel("Ngay bat dau lam : 26/12/2022");
ngaylam.setFont(font);
cont.add(ten);
cont.add(phienban);
cont.add(ngaylam);
cont.add(thongtin);
cont.add(thongtinn);
ten.setBounds(170, 0, 300, 100);
phienban.setBounds(170, 30, 200, 100);
ngaylam.setBounds(170, 60, 400, 100);
thongtin.setBounds(170, 90, 500, 100);
thongtinn.setBounds(240, 120, 500, 100);
Icon icon = new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\Undo-icon.png");
 undoo = new JButton("trở lại");
 undoo.setIcon(icon);
 undoo.setSize(50, 100);
 undoo.addActionListener(this);
 cont.add(undoo);
 undoo.setBounds(190, 210, 110, 50);
 undoo.setBackground(Color.white);
       this.setSize(500, 300);
       this.setBackground(Color.white);
       this.setTitle("More view");
       this.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\about-icon.png"));
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
