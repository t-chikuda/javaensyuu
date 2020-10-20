import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class Hiit extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new Hiit();
    }

    JComboBox<String> c1;

    public Hiit() {

        setTitle("HIITトレーニング");
        setBounds(100, 100, 300, 140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        c1 = new JComboBox(new String[] { "1", "2", "3", "4", "5" }); //コンボの内容
        JSeparator sp1 = new JSeparator(JSeparator.HORIZONTAL);
        sp1.setPreferredSize(new Dimension(280, 0));
        JSeparator sp3 = new JSeparator(JSeparator.HORIZONTAL);
        sp3.setPreferredSize(new Dimension(280, 3));

        add(new JLabel("　セット数　"));
        add(c1);
        add(sp1);

        JButton b = new JButton("スタート");
        b.addActionListener(this);
        add(sp3);
        add(new JLabel("　　　　　　　　"));
        add(b);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        int exercise = 30;   //運動(秒)
        int interval = 10;   //インターバル(秒)
        int setCount = Integer.parseInt(c1.getSelectedItem().toString());  //セット数

        for(int i = 0; i < setCount; i++) {
            try {
                Thread.sleep(1000 * exercise );
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(1000 * interval );
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            java.awt.Toolkit.getDefaultToolkit().beep();
        }
        JOptionPane.showMessageDialog(null, "お疲れさまでした！");
    }
}
