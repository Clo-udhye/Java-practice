
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

public class CustomComboBoxModel extends DefaultComboBoxModel<Object> {
	private String[] datas1 = new String[] {"사과", "딸기", "수박", "참외"};
	private ArrayList<String> datas2 = new ArrayList<String>();
	
	public CustomComboBoxModel() {
		// TODO Auto-generated constructor stub
		datas2.add("사과1");
		datas2.add("딸기1");
		datas2.add("수박1");
		datas2.add("참외1");
	}
	
	// callback - comboBox에 의해 자동으로 불리워지는 메서드
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		//System.out.println("getSize() 호출");
		//return datas1.length;
		return datas2.size();
	}
	
	@Override
	public Object getElementAt(int index) {
		// TODO Auto-generated method stub
		//System.out.println("getElementAt() 호출");
		//return datas1[index];
		return datas2.get(index);
	}
	
}
