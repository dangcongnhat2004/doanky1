package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import controller.*;
    public class ghichu extends JFrame implements ActionListener {
        public static String ghichuint;
        public static String idhs ;
        public static String namehs;
        public static String namsinhhs;
        public static String diemuutien;
        public static String nguvan;
        public static String toan ;
        public static String tienganh ;
        public static String monvp ;
        public static String loivp ;
        public static String noidungvp ;
        public static String phongthivp ;
        public static int ktra ;
        private JComboBox luamon = new JComboBox();
        private JComboBox vipham = new JComboBox();
        private JTextArea ghi = new JTextArea();
        public static JFrame frame = new JFrame();
        public ghichu(){
            new ghichuhs();
            Font font = new Font("Times New Roman", Font.BOLD , 19);
             frame = new JFrame();
             frame.setUndecorated(true);
             frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
            Container con = new Container();
            frame.setSize(400,600);
            JLabel id = new JLabel("id :"+idhs);
            id.setFont(font);
            JLabel name = new JLabel("name :"+namehs);
            name.setFont(font);
            JLabel namsinh = new JLabel("năm sinh :"+namsinhhs);
            namsinh.setFont(font);
            String [] monar = new String [] {"toán","ngữ văn","tiếng anh"}; 
             luamon = new JComboBox(monar);
            JLabel mon = new JLabel("môn :");
            mon.setFont(font);
            luamon.setFont(font);
            String [] loi = new String [] {"Dùng tài liệu","trao đổi","vắng mặt","vi phạm khác"}; 
            vipham = new JComboBox(loi);
            JLabel viphamlb = new JLabel("vi phạm :");
            viphamlb.setFont(font);
            vipham.setFont(font);
            JLabel ghichuu = new JLabel("ghi chú ");
            ghichuu.setFont(font);
             ghi = new JTextArea();
            ghi.setFont(new Font("Times New Roman",font.BOLD , 15));
            JButton ok = new JButton("OK");
            ok.setFont(font);
            JButton cancel = new JButton("Cancel");
            cancel.setFont(font);
            ok.addActionListener(this);
            cancel.addActionListener(this);
            JLabel jl = new JLabel("Ghi chú lỗi vi phạm học sinh ");
            jl.setForeground(Color.BLACK);
            jl.setFont(new Font("Times new Roman " , Font.BOLD| Font.PLAIN , 22));
            jl.setBounds(50, 20, 300, 30);
            id.setBounds(50, 50, 100, 100);
            name.setBounds(50, 80, 300, 100);
            namsinh.setBounds(50, 110, 309, 100);
            mon.setBounds(50, 180, 50, 50);
            luamon.setBounds(140, 180, 200, 50);
            viphamlb.setBounds(50, 240, 200, 50);
            vipham.setBounds(140, 240, 200, 50);
            ghichuu.setBounds(50, 270, 309, 100);
            ghi.setBounds(40, 340, 309, 150);
            ok.setBounds(70, 500, 110, 50);
            cancel.setBounds(200, 500, 110, 50);
            id.setForeground(Color.black);
            name.setForeground(Color.black);
            namsinh.setForeground(Color.black);
            mon.setForeground(Color.black);
            luamon.setForeground(Color.black);
            viphamlb.setForeground(Color.black);
            vipham.setForeground(Color.black);
            ghichuu.setForeground(Color.black);
            ghi.setForeground(Color.black);
            ok.setForeground(Color.black);
            cancel.setForeground(Color.black);
            con.add(jl);
            con.add(id);
            con.add(name);
            con.add(namsinh);
            con.add(mon);
            con.add(luamon);
            con.add(viphamlb);
            con.add(vipham);
            con.add(ghichuu);
            con.add(ghi);
            con.add(ok);
            con.add(cancel);
            ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\cloud.jpg"));
            JLabel  bg = new JLabel("",img,JLabel.CENTER);
              bg.setBounds(0, 0, 400, 600);
             con.add(bg);
            frame.add(con);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            if(ktra==0){
                frame.setVisible(false);
                teacherview.dieuhuonghs =1;
        new nhapidtkhs();
                }
            if(ktra==1){
            frame.setVisible(true);
            }

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            if(e.getActionCommand().equals("Cancel")){
                frame.setVisible(false);

            }
            else if(e.getActionCommand().equals("OK")){
                monvp =(String) luamon.getSelectedItem();
                loivp = (String) vipham.getSelectedItem();
                noidungvp = ghi.getText();
                new timphongvipham();
                frame.setVisible(false);
            }
        }
}
