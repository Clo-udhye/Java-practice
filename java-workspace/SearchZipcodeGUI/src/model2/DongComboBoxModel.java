package model2;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class DongComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> dongs;


	public DongComboBoxModel(String strSido, String strGugun) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		dongs = dao.listDong(strSido, strGugun); 
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return dongs.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = dongs.get(index);
		return to.getDong();
	}
	
}
