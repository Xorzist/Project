package Base;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;




@SuppressWarnings("serial")
public class Animate2 extends JPanel implements ActionListener {

    
    private final Timer timer = new Timer(100, this);
    private final JLabel label = new JLabel();
    private final String text;
    private final int txtlen;
    private int index;

    public Animate2(String text, int txtlen) {
       
        StringBuilder sb = new StringBuilder(txtlen);
        for (int i = 0; i < txtlen; i++) {
            sb.append(' ');
        }
        this.text = sb + text + sb;
        this.txtlen = txtlen;
        label.setFont(new Font("Serif", Font.ITALIC, 36));
        label.setText(sb.toString());
        this.add(label);
    }

    public void start() {
        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        index++;
        if (index > text.length() - txtlen) {
            index = 0;
        }
        label.setText(text.substring(index, index + txtlen));
    }
}