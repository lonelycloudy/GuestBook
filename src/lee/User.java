package lee;
import java.util.ArrayList;
import java.util.List;

import lee.Database;

public class User {
	private int uid;
	private List userInfo;
	private Database db;
	private String tableName="user";
	//���췽��
	public void User(int uid){ 
		this.uid = uid;
		this.db = new Database();
	}
	//��ȡ�û���Ϣ
	public List getUserInfo(){ 
		List userInfo = new ArrayList();
		userInfo = this.db.getUserInfo();
		return userInfo;
	}
	//����û���Ϣ
	public int addUser(List userInfo){
		int flag = 0;
		return flag;
	}
	
}
