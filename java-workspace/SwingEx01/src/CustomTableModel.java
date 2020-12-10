import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class CustomTableModel extends AbstractTableModel {
	//2차원 배열 / ArrayList<ArrayList> / ArratList<TO>
	private String[][] datas = new String[][] {
		{"11", "12", "13", "14"},
		{"21", "22", "23", "24"},
		{"31", "32", "33", "34"},
	};
	
	private ArrayList<ArrayList> datas2 = new ArrayList<ArrayList>();
	public CustomTableModel() {
		// TODO Auto-generated constructor stub
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add("11"); data1.add("12"); data1.add("13"); data1.add("14");		
		ArrayList<String> data2 = new ArrayList<String>();
		data2.add("21"); data2.add("22"); data2.add("23"); data2.add("24");	
		ArrayList<String> data3 = new ArrayList<String>();
		data3.add("31"); data3.add("32"); data3.add("33"); data3.add("34");
		
		datas2.add(data1);
		datas2.add(data2);
		datas2.add(data3);
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		// 컬럼의 갯수		
		//return datas[0].length;
		return datas2.get(0).size();
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		// 데이터의 갯수	
		//return datas.length;
		return datas2.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		//return datas[rowIndex][columnIndex];
		return datas2.get(rowIndex).get(columnIndex);
	}

}
