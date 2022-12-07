import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDemo {
	public static void main(String[] args) throws SQLException {
	Connection connection=PrepareState.getConnection();
	String sql="delete from student where std_id=?";
	PreparedStatement ps=connection.prepareStatement(sql);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id>>");
      int id=sc.nextInt();
	 ps.setInt(1, id);
	
	int i=	ps.executeUpdate();
		System.out.println("record deleted"+i);
	}

}
