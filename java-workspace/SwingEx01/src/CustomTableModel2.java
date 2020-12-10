import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel2 extends AbstractTableModel {
	//2차원 배열 / ArrayList<ArrayList> / ArratList<TO>

	private ArrayList<TableTO> datas;
	private String[] columnNames = {"컬럼1", "컬럼2", "컬럼3", "컬럼4"};	

	public CustomTableModel2() {
		// TODO Auto-generated constructor stub
		TableTO to1 = new TableTO("11", "12", "13", "14");
		TableTO to2 = new TableTO("21", "22", "23", "24");
		TableTO to3 = new TableTO("31", "32", "33", "34");
		
		datas = new ArrayList<TableTO>();
		datas.add(to1);
		datas.add(to2);
		datas.add(to3);
	}
	
	public String getColumnName(int column) {// 컬럼명 설정
		return columnNames[column];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		// 컬럼의 갯수		
		return 4;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		// 데이터의 갯수	
		return datas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		String result = "";
		TableTO to = datas.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			result = to.getCol1();
			break;
		case 1:
			result = to.getCol2();
			break;
		case 2:
			result = to.getCol3();
			break;
		case 3:
			result = to.getCol4();
			break;
		default:
		}
		
		return result;
	}
}
