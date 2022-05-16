package mysql;

import java.sql.*;
public class Test {

    /*test mysql connection*/

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://mysql-iflores.alwaysdata.net/iflores_observatory", "iflores_pg", "wev6pimwmduULgs");
            stmt = conn.createStatement();
            /*String sql = "SELECT * FROM users";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("username"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }*/
            String sql = "INSERT INTO users (username, password) VALUES ('test', 'test')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        }
}
