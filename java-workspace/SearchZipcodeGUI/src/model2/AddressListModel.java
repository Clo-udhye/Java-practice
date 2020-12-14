package model2;

import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class AddressListModel extends AbstractListModel<String> {
	private ArrayList<ZipcodeTO> addresses;
	
	private String strSido;
	private String strGugun;
	private String strDong;
	
	public AddressListModel(String strSido, String strGugun, String strDong) {
		// TODO Auto-generated constructor stub
		ZipcodeDAO dao = new ZipcodeDAO();
		addresses = dao.listAddress(strSido, strGugun, strDong);
		
		this.strSido = strSido;
		this.strGugun = strGugun;
		this.strDong = strDong;
	}
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return addresses.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = addresses.get(index);
		String address = String.format("[%s] %s %s %s %s %s", 
				to.getZipcode(), strSido, strGugun, strDong,to.getRi(), to.getBunji());
		return address;
	}

}
