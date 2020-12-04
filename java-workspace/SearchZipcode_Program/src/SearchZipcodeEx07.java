import java.sql.SQLException;
import java.util.ArrayList;

public class SearchZipcodeEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ZipcodeDAO dao = new ZipcodeDAO();
			ArrayList<ZipcodeTO> datas= dao.searchZipcode("명동");
			
			for(ZipcodeTO to : datas) {
				System.out.println(to.getZipcode() +" "+ to.getSido()+" "+ to.getGugun()+" "+ to.getDong()
				+" "+ to.getRi()+" "+ to.getBunji()+" "+ to.getSeq());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
