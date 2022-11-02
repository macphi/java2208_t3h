package day12_t3h;

import java.sql.*;

public class Main {
    static String DB_INFO = "jdbc:mysql://localhost:3306/t3h_2208";
    static String USER_NAME = "root";
    static String PASS = "Melodyy123";

    // Nhap tu ban phim thong tin ve sach (Ten sach, tac gia)
    // 1: Insert vao db
    // 2: Tim kiem theo ten sach hoac tac gia
    // 3: Cap nhat ten sach va tac gia theo id
    // 4: Phan biet su khac nhau gia Statement voi preparedStatement
    public static void main(String[] args) throws SQLException {
//        insert("Tieng Anh", "Jony"); // Them vao dtb
        //        getAllByName("a '; DELETE FROM sach; select * from sach where NAME = 'a");
        getAllByName("' or '1'='1"); // In ra man hinh
    }

    static void insert(String name, String author) throws SQLException {
        // Buoc 1: Tao ket noi den csdl
        Connection conn = DriverManager.getConnection(DB_INFO, USER_NAME, PASS);
        conn.setAutoCommit(false);
        // Buoc 2: Tao doi Statement tu doi tuong connection de viet cau lenh truy van
        // Cau lenh tuong tac voi csdl
        // PreparedStatement - Dong
        String insertSql = "INSERT INTO sach (NAME, AUTHOR) VALUES (?,?)";
        PreparedStatement preparedStatement = conn.prepareStatement(insertSql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, author);

        // khong dc thi xoa di
        PreparedStatement preparedStatement_2 = conn.prepareStatement(insertSql);
        preparedStatement_2.setString(1, name + "_1");
        preparedStatement_2.setString(2, author + "_1");

        preparedStatement.execute();
        //Statement - tinh
//        Statement sqlStatement = conn.createStatement();
//        String insertSql = "INSERT INTO sach(NAME, AUTHOR) VALUES ('" + name + "','" + author + "')";
        // Buoc 3: Thuc thi cau lenh len Sql server -> ket qua tra ve ResultSet
//        sqlStatement.execute(insertSql);
        // Buoc 4: Xu ly ket qua tra ve ( hien thi len man hinh )
        // Buoc 5: Dong ket noi
//        sqlStatement.close();
        conn.commit();
        conn.close();
    }

    static void getAll() throws SQLException {
        // Buoc 1: Tao ket noi den csdl
        Connection conn = DriverManager.getConnection(DB_INFO, USER_NAME, PASS);
        // Buoc 2: Tao doi Statement tu doi tuong connection de viet cau lenh truy van
        // Cau lenh tuong tac voi csdl
        Statement sqlStatement = conn.createStatement();
        String selectSql = "SELECT * FROM sach";
        // Buoc 3: Thuc thi cau lenh len Sql server -> ket qua tra ve ResultSet
        ResultSet ketQua = sqlStatement.executeQuery((selectSql));
        // Buoc 4: Xu ly ket qua tra ve ( hien thi len man hinh )
        while (ketQua.next()) {
            Long id = ketQua.getLong("ID");
            String monHoc = ketQua.getString("NAME");
            String tacGia = ketQua.getString("AUTHOR");
            System.out.println("ID = " + id + ", Mon = " + monHoc + ", Tac gia = " + tacGia);
        }
        // Buoc 5: Dong ket noi
        sqlStatement.close();
        conn.close();
    }

    static void getAllByName(String name) throws SQLException {
        // Buoc 1: Tao ket noi den csdl
        Connection conn = DriverManager.getConnection(DB_INFO, USER_NAME, PASS);
        // Buoc 2: Tao doi Statement tu doi tuong connection de viet cau lenh truy van
        // Cau lenh tuong tac voi csdl
        Statement sqlStatement = conn.createStatement();
        String selectSql = "SELECT * FROM sach where NAME = '" + name + "'";
        // Buoc 3: Thuc thi cau lenh len Sql server -> ket qua tra ve ResultSet
        ResultSet ketQua = sqlStatement.executeQuery(selectSql);
        // Buoc 4: Xu ly ket qua tra ve ( hien thi len man hinh )
        while (ketQua.next()) {
            Long id = ketQua.getLong("ID");
            String monHoc = ketQua.getString("NAME");
            String tacGia = ketQua.getString("AUTHOR");
            System.out.println("ID = " + id + ", Mon = " + monHoc + ", Tac gia = " + tacGia);
        }
        // Buoc 5: Dong ket noi
        sqlStatement.close();
        conn.close();
    }
}
