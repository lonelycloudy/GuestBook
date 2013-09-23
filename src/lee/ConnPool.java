package lee;
import java.sql.*;
import java.util.Vector;
import java.util.Iterator;
//¡¨Ω”≥ÿ¿‡
public class ConnPool {
	private final String DRIVER="";
	private final String DBURL="";
	private final String ACCOUNT="";
	private final String PASSWORD="";
	private final int SIZE=2;
	
	private static Vector<Dbconn> pool = null;
	private static ConnPool cp = null;
	
	private ConnPool(){ 
		pool = new Vector<DbConn>();
		for(int i=0;i<SIZE;i++){ 
			Connection conn = createSingleConn();
			if(conn != null){ 
				DbConn dbconn = new DbConn(conn);
				pool.add(dbconn);
			}
		}
	}
	private Connection createSingleConn(){ 
		try{
			Class.forName(DRIVER).newInstance();
			Connection conn = DriverManager.getConnection(DBURL,ACCOUNT,PASSWORD);
			return conn;
		} catch(ClassNotFoundException cnfe){ 
			cnfe.printStackTrace();
			
		} catch(SQLException se){
			se.printStackTrace();
		} catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public static DbConn getConnection(){
		if(cp == null){
			cp = new ConnPool();
		}
		if(cp.pool == null || cp.pool.isEmpty()){
			cp = new ConnPool();
		}
		Iterator<Dbconn> it = cp.pool.iterator();
		while(it.hasNext()){
			Dbconn conn = it.next();
			if(conn.isClose()){ 
				conn.open();
				return conn;
			}
		}
		return null;
	}
	
}
