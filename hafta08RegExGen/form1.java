package hafta08RegExGen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class form1 extends JFrame{
    private JPanel panel;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton ARAButton;
    private JTextField textField2;
    form1(){
        add(panel);
        setTitle("RrgEx");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ARAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textArea1.getText();
                Pattern p = Pattern.compile(textField1.getText());
                Matcher m = p.matcher(s);
                int sayac = 0;
                while (m.find()) sayac++;

                textField2.setText(Integer.toString(sayac) + " adet pattern bulundu");

            }
        });
    }
}
