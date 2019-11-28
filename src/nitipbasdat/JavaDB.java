package nitipbasdat;

import java.sql.*;

public class JavaDB {
    static String url = "jdbc:sqlserver://DESKTOP-EKACP9K:1433;database=Mahasiswa;user=DESKTOP-EKACP9K/Root;integratedSecurity=true;";
    public static void main(String[] args) {
        Connection conn;
        JavaDB j = new JavaDB();
        try{
            conn = DriverManager.getConnection(url);
            j.insertQuery(conn);
            j.tampilQuery(conn);
            j.deleteQuery(conn);
        } catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }

    private void tampilQuery(Connection conn) throws SQLException {
        ResultSet rs = conn.createStatement().executeQuery("SELECT m.nim, m.nama, n.nilai FROM tb_mahasiswa m JOIN tb_nilai n ON n.nim = m.nim");
        System.out.println("===============================================================");
        System.out.printf("| %10s%9s %11s%20s %6s%3s \n", "NIM", "|","NAMA", "|", "NILAI", "|");
        while (rs.next()) {
            System.out.printf("| %-18s| %-30s| %-8s|\n", rs.getString(1), rs.getString(2), rs.getFloat(3));
        }
        System.out.println("===============================================================");
    }

    private void insertQuery(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO tb_mahasiswa values ('185150201111013', 'Yusuf Gladiensyah Bihanda')");
        st.executeUpdate("INSERT INTO tb_mahasiswa values ('185150200111106', 'Rizki Aditya Nur')");
        st.executeUpdate("INSERT INTO tb_nilai values ('185150201111013', 90)");
        st.executeUpdate("INSERT INTO tb_nilai values ('185150200111106', 94)");
    }

    private void deleteQuery(Connection conn) throws SQLException {
        Statement st = conn.createStatement();
        st.executeUpdate("DELETE FROM tb_nilai");
        st.executeUpdate("DELETE FROM tb_mahasiswa");
    }
}
