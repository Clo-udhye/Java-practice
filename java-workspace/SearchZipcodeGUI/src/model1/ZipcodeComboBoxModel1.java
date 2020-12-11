package model1;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class ZipcodeComboBoxModel1 extends DefaultComboBoxModel<Object> {
	private ArrayList<String> datas;
	
	public ZipcodeComboBoxModel1(String strColumn) {
		// TODO Auto-generated method stub
		ZipcodeDAO2 dao = new ZipcodeDAO2();
		datas= dao.searchList(strColumn);
	}
	
	public ZipcodeComboBoxModel1(String strColumn1, String strColumn2) {
		// TODO Auto-generated method stub
		ZipcodeDAO2 dao = new ZipcodeDAO2();
		datas= dao.searchList(strColumn1, strColumn2);
	}
	
	public ZipcodeComboBoxModel1(String strColumn1, String strColumn2, String strColumn3) {
		// TODO Auto-generated method stub
		ZipcodeDAO2 dao = new ZipcodeDAO2();
		datas= dao.searchList(strColumn1, strColumn2, strColumn3);
	}
	
	@Override
	public int getSize() { //데이터의 사이즈
		// TODO Auto-generated method stub
		return datas.size();
	}
	
	@Override
	public Object getElementAt(int index) { // 데이터를 얻는법
		// TODO Auto-generated method stub
		return datas.get(index);
	}

}
