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
	public		String dbDriver = "com.mysql.jdbc.Driver";//��������
    public		String url = "jdbc:mysql://localhost:3306/myjsp";//����url
	public		String username="root";//�û���
	public		String password = "ictspace";//����
	public 	 	Connection mConnection=null;//����
	public		Statement mStatement=null;//��Դ
	public		ResultSet mResultSet=null;//��¼����
	
	//��ȡ�û���Ϣ
	public void getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{ 
		Statement mStatement=null;
		ResultSet mResultSet = null;
		Connection mConnection =null;
		String sql = "select * from test";
		Class.forName(this.dbDriver).newInstance();
		//��ȡ���ݿ�����
		this.mConnection =   (Connection) DriverManager.getConnection(this.url,this.username,this.password);
		this.mStatement = (Statement) ((java.sql.Connection) this.mConnection).createStatement();
	}

	public List getUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
