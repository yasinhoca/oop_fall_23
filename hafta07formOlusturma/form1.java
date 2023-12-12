package hafta07formOlusturma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form1 extends JFrame {
    private JButton button1;
    private JTextField textField1;
    private JPanel panel;

    form1(){
        add(panel);
        setTitle("İlk görsel penceremiz");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setText("Hoşgeldin "+textField1.getText());
            }
        });
    }
}
