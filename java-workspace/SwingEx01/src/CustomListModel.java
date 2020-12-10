import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel<String> {
	private String[] values = new String[] {"사과", "딸기", "수박", "참외"};
	
	/*
	public CustomListModel() {
		// TODO Auto-generated constructor stub
		values.add("사과");
		values.add("딸기");
		values.add("수박");
		values.add("참외");
	}
	 */
	
	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return values[index];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return values.length;
	}

}
