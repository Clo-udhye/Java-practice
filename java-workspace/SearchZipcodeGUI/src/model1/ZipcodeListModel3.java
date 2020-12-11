package model1;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class ZipcodeListModel3 extends AbstractListModel<String> {
	private ArrayList<ZipcodeTO> datas = new ArrayList<ZipcodeTO>();
	
	public ZipcodeListModel3(String strSido, String strGugun, String strDong) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO2 dao = new ZipcodeDAO2();
		datas = dao.searchZipcode(strSido, strGugun, strDong);
	
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO value = datas.get(index);
		String address = String.format("[%s] %s %s %s %s %s\n", 
				value.getZipcode(), value.getSido(), value.getGugun(), 
				value.getDong(), value.getRi(), value.getBunji());
		
		return address;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return datas.size();
	}

}
