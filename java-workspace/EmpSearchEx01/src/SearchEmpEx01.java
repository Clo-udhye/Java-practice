import java.sql.SQLException;
import java.util.ArrayList;

public class SearchEmpEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DAO의 메서드 호출
		
		try {
			EmpDAO dao = new EmpDAO();
			ArrayList<EmpTO> datas = dao.searchEmp("20");
			
			for(EmpTO data : datas) {
				System.out.printf("%s %s %s %s %s %s %s %s\n", data.getEmpno(), data.getEname(), data.getJob(), 
						data.getMgr(), data.getHiredate(), data.getSal(), data.getComm(), data.getDeptno());
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
