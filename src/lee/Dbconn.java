package lee;
import java.sql.*;
//数据库连接
public class Dbconn {
	private Connection conn = null;
	private boolean status = false;
	
	public Dbconn(Connection conn){
		this.conn = conn;
	}
	public void open(){ 
		status = true;
	}
	public boolean isClose(){ 
		return !status;
	}
	public void close(){ 
		status = false;
	}
	public Statement createStatement(int resultSetType,int resultSetConcurrency) throws SQLException{
		return conn.createStatement(resultSetType,resultSetConcurrency);
	}
	public Statement createStatement() throws SQLException{ 
		return conn.createStatement();
	}
}
