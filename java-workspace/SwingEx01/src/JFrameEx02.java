import javax.swing.JFrame;

public class JFrameEx02 extends JFrame {

	public JFrameEx02() {

		// 창닫기시 프로그램 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setSize(1024, 768);
		//this.setLocation(100, 100);
		this.setBounds(100, 100, 1024, 768);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameEx02 frame = new JFrameEx02();
		frame.setVisible(true);
	}

}
