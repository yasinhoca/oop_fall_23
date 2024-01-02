package hafta10;


import java.sql.ResultSet;
import java.sql.SQLException;

public class baslat {
    public static void main(String[] args) throws SQLException {
        Veritabani.baglan();

        String sorgu = "select * from ogrenci";

        ResultSet rs = Veritabani.listele(sorgu);

        try {
            while (rs.next()){

                System.out.print(rs.getInt("numara") + " - ");
                System.out.print(rs.getString("ad") + " - ");
                System.out.print(rs.getString("soyad") + " - ");
                System.out.print(rs.getString("tel") + " - ");
                System.out.println();

            }
        } catch (SQLException e)
        {
            System.out.println("veritabanı hatası");
        }


    }


}
