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
    private		String dbDriver = "com.mysql.jdbc.Driver";//��������
	private		String url = "jdbc:mysql://localhost:3306/myjsp";//����url
	private		String username="root";//�û���
	private		String password = "ictspace";//����
	private 	java.sql.Connection mConnection=null;//����
	private 	java.sql.Statement mStatement=null;//��Դ
	private 	ResultSet mResultSet=null;//��¼����
	
	//��ȡ�û���Ϣ
	public void getConnection() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{ 
		Statement mStatement=null;
		ResultSet mResultSet = null;
		Connection mConnection =null;
		String sql = "select * from test";
		Class.forName(this.dbDriver).newInstance();
		//��ȡ���ݿ�����
		this.mConnection =   DriverManager.getConnection(this.url,this.username,this.password);
		this.mStatement = this.mConnection.createStatement();
	}
	
	
}
