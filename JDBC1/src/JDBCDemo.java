import java.sql.*;
public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		update();
		
	}
	
	//READ RECORDS FROM MYSQL 
	
	public static void readRecords() throws Exception {
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String username="root";
		String password="P@@ja@153";
		String query="select * from employee";
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
		System.out.println("Id is "+rs.getInt(1));
		System.out.println("Name is "+rs.getString(2));
		System.out.println("Salary is "+rs.getInt(3));
		}
		con.close();

	}

//	INSERT RECORDS

public static void insertRecords() throws Exception {
	
	String query="insert into employee values(4,'priya',80000)";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "P@@ja@153");
	Statement st = con.createStatement();
	int rows = st.executeUpdate(query);
	
		System.out.println("no.of rows affected: "+rows);
	    con.close();
		
}

//INSESRTING WITH VARIABLES

public static void insertVar() throws Exception {
	int id=5;
	String name="Ram";
	int salary=850000;
	String query="insert into employee values("+id+ ",'"+name+"',"+salary+")";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "P@@ja@153");
	Statement st = con.createStatement();
	int rows = st.executeUpdate(query);
	
		System.out.println("no.of rows affected: "+rows);
	    con.close();
		
}	


//PREPARED STATMENT IS USED TO INSERT THE VALUES EASILY AND IT IS EFFICIENT TOO....


public static void insertUsingpst() throws Exception {
	int id=6;
	String name="nirmal";
	int salary=860000;
	String query="insert into employee values(?,?,?)";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "P@@ja@153");
	PreparedStatement ps = con.prepareStatement(query);
	ps.setInt(1,id);
	ps.setString(2, name);
	ps.setInt(3, salary);
	
	int rows = ps.executeUpdate();
	
		System.out.println("no.of rows affected: "+rows);
	    con.close();
		
}


//DELETE

public static void delete() throws Exception {
	
	String query="delete from employee where emp_id=5";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "P@@ja@153");
	PreparedStatement ps = con.prepareStatement(query);
	
	
	int rows = ps.executeUpdate(query);
	
		System.out.println("no.of rows affected: "+rows);
	    con.close();
		
}

//Update

public static void update() throws Exception {
	
	String query="update employee set salary =150000 where emp_id=1";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "P@@ja@153");
	PreparedStatement ps = con.prepareStatement(query);
	
	
	int rows = ps.executeUpdate(query);
	
		System.out.println("no.of rows affected: "+rows);
	    con.close();
		
}}	




























