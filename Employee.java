package guvizen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class Employee {
	//Add data to Employee table using JDBC connection
	public void insertEmployeeDetails(int empcod,String empnam,int empag,int esalar) throws Exception {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muledbcon","root","root");
		String insert_query = "insert into Employee (empcod,empnam,empag,esalar) values (?,?,?,?);";
		PreparedStatement st = con.prepareStatement(insert_query);
		st.setInt(1,empcod);
		st.setString(2, empnam);
		st.setInt(3,empag);
		st.setInt(4,esalar);
		int row_affected = st.executeUpdate();
		System.out.println("row_affected: "+row_affected);

	}
	public static void main(String[] args) throws Exception {
		Employee emObj = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese Enter Number Of Employees: ");
		int num =sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println("Please Enter Employee code: ");
			int empcod =sc.nextInt();
			System.out.println("Please Enter Employee Name: ");
			String empnam =sc.next();
			System.out.println("Please Enter Employee Age: ");
			int empag =sc.nextInt();
			System.out.println("Please Enter Employee Salary: ");
			int esalar =sc.nextInt();
			emObj.insertEmployeeDetails(empcod,empnam,empag,esalar);
		}
	}
}
