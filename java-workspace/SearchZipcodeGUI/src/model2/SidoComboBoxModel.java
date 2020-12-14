package model2;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class SidoComboBoxModel extends DefaultComboBoxModel<String> {
	private ArrayList<ZipcodeTO> sidos;
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		ZipcodeDAO dao = new ZipcodeDAO();
		sidos = dao.listSido();
		return sidos.size();
	}
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		ZipcodeTO to = sidos.get(index);
		return to.getSido();
	}
	
}
