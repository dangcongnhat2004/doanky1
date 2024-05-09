package view;
import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.event.*;
public class loading extends JFrame {
    public final static int ONE_SECOND = 100;
    private JFrame thi = new JFrame();
    private Timer timer ;
    private JProgressBar progressBar;
    private JMenuBar jb = new JMenuBar();
    private JMenu twitter , facebook , instagram , youtube , gmail;
    BasicProgressBarUI ui = new BasicProgressBarUI() {
        protected Color getSelectionBackground() {
            return Color.black;
            //khi thanh loading chưa chạy qua chỗ % thì chữ màu đen
        }
        protected Color getSelectionForeground() {
            return Color.red;
             //khi thanh loading chưa chạy qua chỗ % thì chữ màu đỏ
        }
    };
    public loading (){
        super("ProgressBardemo");
         thi = new JFrame();
         thi.setUndecorated(true);
         //ẩn nút phóng to thu nhỏ và tắt của jframe
         thi.setSize(600, 400);
         thi.setLocationRelativeTo(null);
         thi.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\vku.jpg"));
       Container panel = new Container();
        panel.setLayout(null);
        progressBar = new JProgressBar(90,100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        // hiển thị %
        progressBar.setForeground(new java.awt.Color(169, 224, 49));
        progressBar.setBorderPainted(true);
        // vẽ đường viền
        progressBar.setBounds(0, 320, 600, 40);
        progressBar.setUI(ui);
        progressBar.setBackground(Color.WHITE);
        Font font = new Font("Times New Roman", Font.BOLD , 25);
      JLabel textimg =  new JLabel(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_DOT_100px.png"));
      JLabel textimg2 = new JLabel("JAVA SWING");
      JLabel textimg3 = new JLabel("Quản lí tuyển sinh lớp 10");
      textimg.setForeground(new java.awt.Color(169, 224, 49));
      textimg.setBounds(100, 40, 200, 100);
      panel.add(textimg);
      textimg2.setFont(font);
      textimg2.setForeground(new java.awt.Color(169, 224, 49));
      textimg2.setBounds(250, 45, 200, 100);
      textimg3.setFont(new Font("Times new Roman", Font.BOLD,19));
      textimg3.setForeground(new java.awt.Color(169, 224, 49));
      textimg3.setBounds(200, 100, 250, 120);
      panel.add(textimg2);
      panel.add(textimg3);
        panel.add(progressBar);
       thi.add(panel);
        menu();
        thi.getContentPane().setBackground(Color.black );
        thi.setVisible(true);
        timer = new Timer(ONE_SECOND , new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(progressBar.getValue() + 1);
                if(progressBar.getValue()==progressBar.getMaximum()){
                thi.setVisible(false);
                timer.stop();
                new login();
                }
            }

            private void setVisible(boolean b) {
            }
        });
        timer.start();
    }
    public void menu (){
        jb = new JMenuBar();
        thi.setJMenuBar(jb);
        jb.setBackground(Color.black);
        jb.setBorder(null);
        twitter = new JMenu();
        twitter.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_Twitter_32px.png"));
        facebook = new JMenu();
        facebook.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_Facebook_32px_2.png"));
        instagram = new JMenu();
        instagram.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_Instagram_32px.png"));
        youtube = new JMenu();
        youtube.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_YouTube_32px.png"));
        gmail = new JMenu("ngoan22it@vku.udn.vn");
        gmail.setForeground(new java.awt.Color(169, 224, 49));
        gmail.setIcon(new ImageIcon("D:\\doanjavacuoiky1\\login\\src\\icon\\icons8_Secured_Letter_32px.png"));
        jb.add(twitter);
        jb.add(facebook);
        jb.add(instagram);
        jb.add(youtube);
        jb.add(gmail);
    }

}

