package hafta10;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;


public class form1 extends JFrame{
    private JTable table1;
    private JPanel panel;
    private JTextField textField1;
    private JButton listeleButton;
    DefaultTableModel modelim = new DefaultTableModel();
    Object[] kolonlar = {"No","Ad","Soyad","Telefon"};
    Object[] satirlar = new Object[4];

    form1(){
        add(panel);
        setTitle("DB işlemleri");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Veritabani.baglan();
        String sorgu = "select * from ogrenci";
        ResultSet rs = Veritabani.listele(sorgu);

        modelim.setColumnCount(0);
        modelim.setRowCount(0);
        modelim.setColumnIdentifiers(kolonlar);

        try{
            while(rs.next()){
                satirlar[0]=rs.getInt("numara");
                satirlar[1]=rs.getString("ad");
                satirlar[2]=rs.getString("soyad");
                satirlar[3]=rs.getString("tel");
                modelim.addRow(satirlar);
            }
            table1.setModel(modelim);
        }catch (SQLException e){
            System.out.println("veritabanı hatası");
        }

        listeleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelim.setColumnCount(0);
                modelim.setRowCount(0);
                modelim.setColumnIdentifiers(kolonlar);
                String sorgu = textField1.getText();
                ResultSet rs = Veritabani.listele(sorgu);
                try{
                    while(rs.next()){
                        satirlar[0]=rs.getInt("numara");
                        satirlar[1]=rs.getString("ad");
                        satirlar[2]=rs.getString("soyad");
                        satirlar[3]=rs.getString("tel");
                        modelim.addRow(satirlar);
                    }
                    table1.setModel(modelim);
                }catch (SQLException z){
                    System.out.println("veritabanı hatası");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f=new form1();
                f.setVisible(true);
            }
        });
    }
}
