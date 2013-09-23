package lee;
import java.util.ArrayList;
import java.util.List;

import lee.Database;

public class User {
	private int uid;
	private List userInfo;
	private Database db;
	private String tableName="user";
	//构造方法
	public void User(int uid){ 
		this.uid = uid;
		this.db = new Database();
	}
	//获取用户信息
	public List getUserInfo(){ 
		List userInfo = new ArrayList();
		userInfo = this.db.getUserInfo();
		return userInfo;
	}
	//添加用户信息
	public int addUser(List userInfo){
		int flag = 0;
		return flag;
	}
	
}
