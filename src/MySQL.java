import java.sql.*;

public class MySQL {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public static Connection getCon(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=GMT%2B8","root","11204516ss");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
//        String sql = "select * from test where id = ? ";  //查询
        String sql = "insert into test(id,name) values( ? ,? )";//添加
        Connection con = getCon();
//        Statement stmt = null;
        try {
          /* *//* stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);*//*
           PreparedStatement stmt = con.prepareStatement(sql);
//           stmt.setString(1,"1");
           ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2));
            }
            rs.close();
            stmt.clearBatch();*/

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,"3");
            ps.setString(2,"nacy");
            int i = ps.executeUpdate();
            System.out.println(i+"行受到影响");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
