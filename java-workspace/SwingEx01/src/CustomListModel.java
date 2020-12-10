import javax.swing.AbstractListModel;

public class CustomListModel extends AbstractListModel<String> {
	private String[] values = new String[] {"사과", "딸기", "수박", "참외"};
	
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
