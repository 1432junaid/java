package dbmsProject;
import java.sql.*;

public class mydb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String url = "jdbc:mysql://localhost:3306/junaid";
		final String username = "junaid";
		final String password = "junaid";
		try {
			DataAccessClass d = new DataAccessClass();
			Connection con = DriverManager.getConnection(url,username,password);
//			Statement st = d.createConnection(url,username,password);
//			String query = "select id,name from mytable";
//			ResultSet rs = d.selectData(st,query);
//			d.displayData(rs);
			PreparedStatement pst = con.prepareStatement("Select name from mytable where (id = ?)"); 
			pst.setInt(1,10);
			pst.execute();
			ResultSet rs = pst.getResultSet();
			while(rs.next()) {
//				String x = rs.
				System.out.println(rs.getNString("name"));
			}
//			while(rs.next()) {
//				String x = rs.getString(1);
//				String s = rs.getString(2);
//				System.out.println(x+" "+s);
//			}
//		}catch(ClassNotFoundException cnf) {
//			cnf.printStackTrace();
//		}
//		catch(SQLException sqle) {
//			sqle.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
//		try {
//			Class.forName("com.mysql.jdbc.Driver");  //Checks the register
//		}catch (ClassNotFoundException cnf) {
//			cnf.printStackTrace();
//		}
		
//		try {
//			Connection con = DriverManager.getConnection(url,username,password);
//			Statement st = con.createStatement();
//			String query  = "CREATE TABLE mytable(id int(10) Primary key, name char(20))";
//			String query1 = "insert into mytable()" 
//			String query = "select id,name from mytable";
//			st.execute(query);
//			ResultSet rs = st.executeQuery(query);
//			while(rs.next()) {
//				String x = rs.getString(1);
//				String s = rs.getString(2);
//				System.out.println(x+" "+s);
//			}
//		}catch(SQLException sqle) {
//			sqle.printStackTrace();
//		}
	}



