package view;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import java.awt.*;
import java.awt.event.*;  
import controller.*;
public class xettuyen extends JFrame implements ActionListener {
  private JFrame jf = new JFrame();
  private JTextField tf = new JTextField();
  private JButton ok = new JButton();
  private JButton cancel = new JButton();
  public static int dieuhuongxettuyen;
  public static int dieuhuongxettuyen2;
  public static double q ;
    public xettuyen(){
       jf = new JFrame();
      jf.setLayout(null);
      jf.setUndecorated(true);

      JLabel lb = new JLabel("Nhập điểm xét :");
      lb.setForeground(Color.black);
      lb.setFont(new Font("Times New Roman" , Font.BOLD | Font.PLAIN , 15));
      lb.setBounds(0, -15, 1000, 50);
      tf = new JTextField();
      tf.setBackground(Color.white);
      tf.setFont(new Font("Times New Roman" , Font.BOLD | Font.PLAIN , 15));
      tf.setForeground(Color.black);
      tf.setBounds(0, 30, 300, 50);
      jf.add(tf);
      jf.add(lb);
      ok = new JButton("xét");
      ok.setForeground(Color.BLACK);
      ok.setBackground(Color.white);
      ok.setFont(new Font("Times New Roman" , Font.BOLD | Font.PLAIN ,19));
      ok.setBounds(20, 100, 100, 40);
      ok.addActionListener(this);
      cancel = new JButton("hủy");
      cancel.setForeground(Color.BLACK);
      cancel.setBackground(Color.white);
      cancel.setFont(new Font("Times New Roman" , Font.BOLD | Font.PLAIN ,19));
      cancel.setBounds(165, 100, 100, 40);
      cancel.addActionListener(this);
      jf.add(ok);
      jf.add(cancel);
      jf.getRootPane().setWindowDecorationStyle(JRootPane.FILE_CHOOSER_DIALOG);
      jf.setSize(300, 190);
      jf.setLocationRelativeTo(null);
      jf.setVisible(true);
     }

    @Override
    public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if(e.getActionCommand().equals("xét")){
        try {
             q = Double.parseDouble(tf.getText());
        }
        catch (Exception q){
                 JOptionPane.showMessageDialog(rootPane, "lỗi dữ liệu " ,"enter error",
            JOptionPane.ERROR_MESSAGE);
        }
           if(q>=0.0&&q<=30.0){
            dieuhuongxettuyen = 5;
            new thongtinhs();
            jf.setVisible(false);
           }
           else {
            JOptionPane.showMessageDialog(rootPane, "số nhập không nằm trong khoảng điểm " ,"enter error",
            JOptionPane.ERROR_MESSAGE);
           }
      }
      else{
         new thongtinhs();
        jf.setVisible(false);
      } 
    }
}
