package model2;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class GugunComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> guguns;
	
	public GugunComboBoxModel(String strSido) {
		// TODO Auto-generated method stub
		ZipcodeDAO dao = new ZipcodeDAO();
		guguns = dao.listGugun(strSido);
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return guguns.size();
	}
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = guguns.get(index);
		return to.getGugun();
	}
	
}
