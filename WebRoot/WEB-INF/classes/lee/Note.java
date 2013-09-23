package lee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Note {
	private List noteInfo =null;
	private int noteid = 0;
	private Database db;
	//���췽��
	public void Note(int noteid){
		this.noteid = noteid;
		this.db = new Database();
	}
	//��ȡ������Ϣ
	public List getNoteInfo(){ 
		return this.noteInfo;
	}
	//��������
	public int addNote(){
		return 1;
	}
	//��ȡ����
	public List fetchNoteList(String sql){
		HashMap contentItem = new HashMap();
		//String contentList[]=null;
		List contentList = new ArrayList();
		try {
			this.db.mResultSet = this.db.mStatement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ResultSet mResultSet = this.db.mResultSet;
			while(mResultSet.next()){
				contentItem.put("id",mResultSet.getString("id"));
				contentItem.put("title",mResultSet.getString("title"));
				contentItem.put("content",mResultSet.getString("content"));
				contentItem.put("created",mResultSet.getString("created"));
				contentItem.put("uid",mResultSet.getString("uid"));
				contentList.add(contentItem);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contentList;
	}
	//��ȡ�û���Ϣ
	public List getUserInfo(){ 
		List user = new ArrayList();
		return user;
	}
}
