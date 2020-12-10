package model1;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class ZipcodeTableModel extends AbstractTableModel {
	private ArrayList<ArrayList<String>> datas = new ArrayList<ArrayList<String>>();;
	private String[] columnNames = {"우편번호", "시/도", "구/군", "동", "리", "번지"};
	

	public ZipcodeTableModel(String strDong) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		ArrayList<ZipcodeTO> addresses = dao.searchZipcode(strDong);
		
		for(ZipcodeTO address : addresses) {
			ArrayList<String> data = new ArrayList<String>();
			data.add(address.getZipcode());
			data.add(address.getSido());		
			data.add(address.getGugun());
			data.add(address.getDong());
			data.add(address.getRi());
			data.add(address.getBunji());
			
			datas.add(new ArrayList<String>(data));
		}
		
	}
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return columnNames[column];
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

		return datas.get(rowIndex).get(columnIndex);
	}

}
