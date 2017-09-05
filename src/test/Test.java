package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Day.User;

public class Test {
public static void main(String[] args) {
	
	getAll();
}
public static List<User> getAll(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/nd?user=root&password=root");
		System.out.print(conn);
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		while (rs.next()){
			int id=rs.getInt("id");
			String name=rs.getString("name");	
			System.out.println("id为:"+id+"用户为:"+name);
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;

}
}
