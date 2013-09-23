package lee;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.rmi.transport.Connection;
import com.mysql.jdbc.Statement;

public class Database {
	public		String dbDriver = "com.mysql.jdbc.Driver";//驱动类型
    public		String url = "jdbc:mysql://localhost:3306/myjsp";//连接url
	public		String username="root";//用户名
	public		String password = "ictspace";//密码
	public 	 	Connection mConnection=null;//连接
	public		Statement mStatement=null;//资源
	public		ResultSet mResultSet=null;//记录集合
	
	//获取用户信息
	public void getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{ 
		Statement mStatement=null;
		ResultSet mResultSet = null;
		Connection mConnection =null;
		String sql = "select * from test";
		Class.forName(this.dbDriver).newInstance();
		//获取数据库连接
		this.mConnection =   (Connection) DriverManager.getConnection(this.url,this.username,this.password);
		this.mStatement = (Statement) ((java.sql.Connection) this.mConnection).createStatement();
	}

	public List getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
