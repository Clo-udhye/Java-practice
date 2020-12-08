import javax.swing.JFrame;

public class JFrameEx01 {
	public static void main(String[] args) {
		
		//JFrame frame = new JFrame();
		JFrame frame = new JFrame("프레임 타이틀");
		
		frame.setTitle("새로운 타이틀");
		System.out.println(frame.getTitle());
		
		//크기와 위치
		frame.setSize(1024, 768);
		frame.setLocation(100, 100);
		
		frame.setVisible(true);
	}
}
