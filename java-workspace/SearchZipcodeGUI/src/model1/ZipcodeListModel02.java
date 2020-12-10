package model1;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class ZipcodeListModel02 extends AbstractListModel<String> {
	private ArrayList<ZipcodeTO> values = new ArrayList<ZipcodeTO>();
	
	public ZipcodeListModel02(String strDong) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		values = dao.searchZipcode(strDong);
		
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO value = values.get(index);
		String address = String.format("[%s] %s %s %s %s %s\n", 
				value.getZipcode(), value.getSido(), value.getGugun(), 
				value.getDong(), value.getRi(), value.getBunji());
		
		return address;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return values.size();
	}

}
