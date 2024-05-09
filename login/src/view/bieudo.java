 package view;
 import javax.swing.*;
import java.awt.*;
import org.jfree.chart.*;
import org.jfree.chart.labels.*;
import org.jfree.chart.plot.*;
import org.jfree.data.general.*;
import controller.*;

public class bieudo extends JPanel {
    public static int sodem = 0;
public static double diem30= 0;
public static double hon25= 0;
public static double hon20= 0;
public static double duoi20 = 0;
public static double duoi15 = 0;
    private static final long serialVersionUID = 4400735172378226919L;
    final DefaultPieDataset dataset = new DefaultPieDataset();

    public bieudo() {
        new tinhphantram();
        bieudo.diem30 = (bieudo.diem30*100)/(double)bieudo.sodem;
        bieudo.hon25 = (bieudo.hon25*100)/(double)bieudo.sodem;
        bieudo.hon20 = (bieudo.hon20*100)/(double)bieudo.sodem;
        bieudo.duoi20 = (bieudo.duoi20*100)/(double)bieudo.sodem;
        bieudo.duoi15 = (bieudo.duoi15*100)/(double)bieudo.sodem;
        final JFrame frame = new JFrame("THỐNG KÊ BẢNG ĐIỂM");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\doanjavacuoiky1\\login\\src\\icon\\diagram.png"));
        if(diem30!=0.0){
            dataset.setValue("Điểm tuyệt đối", diem30);
        }
        if(hon25!=0.0){
            dataset.setValue("Điểm trên 25", hon25);
        }
        if(hon20!=0.0){
            dataset.setValue("Điểm trên 20", hon20);
        }
    if(duoi20!=0.0){
        dataset.setValue("Điểm trên 15",duoi20);
    }
    if(duoi15!=0.0){
        dataset.setValue("Điểm dưới 15",duoi15);
    }
        final JFreeChart chart3 = ChartFactory.createPieChart3D("BIỂU ĐỒ TRÒN TRÌNH BÀY TỈ LỆ ĐIỂM  ", dataset, true, true, false);
        final PiePlot3D plot3 = (PiePlot3D) chart3.getPlot();
        this.setLayout(new GridLayout(1,1));
        final ChartPanel panel3 = new ChartPanel(chart3);
         frame.add(panel3);
         frame.setSize(640, 480);
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

   
}