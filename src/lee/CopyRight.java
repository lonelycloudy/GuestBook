package lee;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CopyRight {
	
	public String getInfo(){
		Date date = new Date();
		SimpleDateFormat from = new SimpleDateFormat("yyyy");
		String nowTime = from.format(date);
		String copyRightInfo = "����(localhost)��Ȩ���� 2010-"+nowTime;
		return copyRightInfo;
	}
}
