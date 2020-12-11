import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class EmpTableModel extends AbstractTableModel {
	ArrayList<EmpTO> datas;
	
	public EmpTableModel(String strEname) {
		// TODO Auto-generated constructor stub
		EmpDAO dao = new EmpDAO();
		datas = dao.searchEname(strEname);
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return datas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		String result = "";
		EmpTO to = datas.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			result = to.getEmpno();
			break;
		case 1:
			result = to.getEname();
			break;
		case 2:
			result = to.getJob();
			break;
		case 3:
			result = to.getSal();
			break;
		case 4:
			result = to.getGrade();
			break;
		case 5:
			result = to.getDeptno();
			break;
		case 6:
			result = to.getLoc();
			break;
		case 7:
			result = to.getDname();
			break;
		default:	
		}
		
		return result;
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		String[] columnNames = {"사원번호", "사원이름", "직책" , "급여", "호봉", "부서번호", "부서위치", "부서이름"};
		return columnNames[column];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
		};
		
		return columnEditables[columnIndex];
	}
	
}
