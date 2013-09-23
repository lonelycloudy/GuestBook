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
    private		String dbDriver = "com.mysql.jdbc.Driver";//驱动类型
	private		String url = "jdbc:mysql://localhost:3306/myjsp";//连接url
	private		String username="root";//用户名
	private		String password = "ictspace";//密码
	private 	java.sql.Connection mConnection=null;//连接
	private 	java.sql.Statement mStatement=null;//资源
	private 	ResultSet mResultSet=null;//记录集合
	
	//获取用户信息
	public void getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{ 
		Statement mStatement=null;
		ResultSet mResultSet = null;
		Connection mConnection =null;
		String sql = "select * from test";
		Class.forName(this.dbDriver).newInstance();
		//获取数据库连接
		this.mConnection =   DriverManager.getConnection(this.url,this.username,this.password);
		this.mStatement = this.mConnection.createStatement();
	}
	
	
}
