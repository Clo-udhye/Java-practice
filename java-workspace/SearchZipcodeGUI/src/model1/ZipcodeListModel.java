package model1;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class ZipcodeListModel extends AbstractListModel<String> {
	private ArrayList<String> values = new ArrayList<String>();
	
	public ZipcodeListModel(String strDong) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		ArrayList<ZipcodeTO> datas = dao.searchZipcode(strDong);
		for(ZipcodeTO data : datas) {
			values.add(String.format("[%s] %s %s %s %s %s\n", 
					data.getZipcode(), data.getSido(), data.getGugun(), 
					data.getDong(), data.getRi(), data.getBunji()));
		}
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return values.get(index);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return values.size();
	}

}
