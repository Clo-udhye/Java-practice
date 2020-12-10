import javax.swing.SpinnerListModel;

public class UserSpinnerListModel extends SpinnerListModel {
	private String[] items = new String[]{"사과", "딸기", "수박", "참외"};

	@Override
	public SpinnerListModel getValue() {
		// TODO Auto-generated method stub
		SpinnerListModel spinnerListModel = new SpinnerListModel(items);
		return spinnerListModel;
	}
}
