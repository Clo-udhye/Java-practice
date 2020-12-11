package model1;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ZipcodeTableModel3 extends AbstractTableModel {
	private ArrayList<ZipcodeTO> datas;
	
	public ZipcodeTableModel3(String strDong) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		datas = dao.searchZipcode(strDong);
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 6;
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
		ZipcodeTO to = datas.get(rowIndex);
		
		switch(columnIndex) {
		case 0:
			result = to.getZipcode();
			break;
		case 1:
			result = to.getSido();
			break;
		case 2:
			result = to.getGugun();
			break;
		case 3:
			result = to.getDong();
			break;
		case 4:
			result = to.getRi();
			break;
		case 5:
			result = to.getBunji();
			break;
		
		}		
		return result;
	}
	
	//컬럼이름
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		String[] columnNames = {"우편번호", "시/도", "구/군", "동", "리", "번지"}; //지역변수로 선언해도 괜찮다
		return columnNames[column];
	}

	//Editable Option
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
		};
		
		return columnEditables[columnIndex];
	}
	
}
