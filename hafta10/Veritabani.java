package hafta10;

import java.sql.*;


public class Veritabani {
    static String url = "jdbc:postgresql://localhost:5432/normalogretim";
    //uzak serverda ise localhost yerine oranın ip adresi yazılır
    static Connection conn = null;

    static void baglan(){
        try {
            conn = DriverManager.getConnection(url,"postgres","1234");
            System.out.println("Veritabanı bağlantısı başarılı");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


    static ResultSet listele(String sorgu){
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(sorgu);
            return rs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
