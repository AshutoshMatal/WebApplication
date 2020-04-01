import java.sql.Connection;
import java.sql.PreparedStatement;

import com.UserApplication.Model.User;
import com.UserApplication.utility.DB_Utility;

public class UserDaoImpl implements UserDao {
	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertUser(User u) {
		int status=0;
		try
		{
			con=DB_Utility.getCon();
			ps=con.prepareStatement("insert into login values(?,?)");
			ps.setString(1,u.getUsername());	
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getName());
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}