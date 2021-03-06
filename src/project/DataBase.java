package project;
import java.sql.*;

public class DataBase {

     Connection myConn;
        Statement st;
        int val;
        ResultSet rows;

        public DataBase() {
            String url = "jdbc:mysql://localhost:3306/oop";
            String user = "root";
            String password = "Krip@2002";

            try {
                myConn = DriverManager.getConnection(url, user, password);

                if (myConn != null) {
                    System.out.print("");
                } else {
                    System.out.println("error occurred.");
                }
                st = myConn.createStatement();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public int insert(String query) {
            try {
                val = st.executeUpdate(query);
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }
            return val;
        }

        public int delete(String query) {
            try {
                val = st.executeUpdate(query);
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }
            return val;

        }

        public int update(String query) {
            try {
                val = st.executeUpdate(query);
            } catch (Exception throwables) {
                throwables.printStackTrace();
            }
            return val;

        }

        public ResultSet select(String query) {
            try {
                rows = st.executeQuery(query);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return rows;
        }

}
