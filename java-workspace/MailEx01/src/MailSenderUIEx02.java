
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MailSenderUIEx02 extends JFrame {

	private String fromMail;
	private String fromPassword;
	private File attachedFile = null;

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MailSenderUIEx02 frame = new MailSenderUIEx02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MailSenderUIEx02() {
		this.fromMail = "testUser@gmail.com"; //구글 이메일
		this.fromPassword = "password"; //구글 비밀번호

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 692);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField1 = new JTextField();
		textField1.setFont(new Font("굴림", Font.PLAIN, 16));
		textField1.setBounds(128, 15, 484, 27);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setFont(new Font("굴림", Font.PLAIN, 16));
		textField2.setBounds(128, 79, 484, 27);
		contentPane.add(textField2);
		textField2.setColumns(10);

		textField3 = new JTextField();
		textField3.setFont(new Font("굴림", Font.PLAIN, 16));
		textField3.setColumns(10);
		textField3.setBounds(128, 47, 484, 27);
		contentPane.add(textField3);

		JRadioButton rdbtn1 = new JRadioButton("HTML");
		rdbtn1.setSelected(true);
		rdbtn1.setFont(new Font("굴림", Font.PLAIN, 16));
		buttonGroup.add(rdbtn1);
		rdbtn1.setBounds(129, 107, 86, 29);
		contentPane.add(rdbtn1);

		JRadioButton rdbtn2 = new JRadioButton("TEXT");
		rdbtn2.setFont(new Font("굴림", Font.PLAIN, 16));
		buttonGroup.add(rdbtn2);
		rdbtn2.setBounds(224, 107, 86, 29);
		contentPane.add(rdbtn2);

		JLabel lblNewLabel1 = new JLabel("받을 주소");
		lblNewLabel1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel1.setBounds(34, 18, 82, 21);
		contentPane.add(lblNewLabel1);

		JLabel lblNewLabel2 = new JLabel("이름");
		lblNewLabel2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel2.setBounds(70, 50, 82, 21);
		contentPane.add(lblNewLabel2);

		JLabel lblNewLabel3 = new JLabel("제목");
		lblNewLabel3.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel3.setBounds(70, 82, 82, 21);
		contentPane.add(lblNewLabel3);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 168, 595, 365);
		contentPane.add(scrollPane);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 16));
		scrollPane.setViewportView(textArea);

		JLabel lblNewLabel_2 = new JLabel("메일 형식");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(36, 111, 82, 21);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("보내는 내용 :");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(17, 143, 99, 21);
		contentPane.add(lblNewLabel_3);

		JButton btn1 = new JButton("메일전송");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String type = "";
				if(rdbtn1.isSelected()) {
					type = "html";
				} else if(rdbtn2.isSelected()) {
					type = "plain";
				}


				try {
					sendMail(textField1.getText(), textField3.getText(), textField2.getText(), textArea.getText(),type, attachedFile);
					dispose();
				} catch (UnsupportedEncodingException | MessagingException e) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(MailSenderUIEx02.this, "수신 메일을 확인하세요", "메일 전송 실패", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn1.setFont(new Font("굴림", Font.PLAIN, 16));
		btn1.setBounds(483, 595, 129, 29);
		contentPane.add(btn1);

		textField4 = new JTextField();
		textField4.setFont(new Font("굴림", Font.PLAIN, 16));
		textField4.setBounds(116, 548, 351, 27);
		contentPane.add(textField4);
		textField4.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("첨부 파일");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(34, 551, 82, 21);
		contentPane.add(lblNewLabel_4);

		JButton btn2 = new JButton("찾기");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser fileChooser = new JFileChooser("c://Java");

				int result = fileChooser.showOpenDialog(MailSenderUIEx02.this);

				if(result==JFileChooser.APPROVE_OPTION) {
					attachedFile = fileChooser.getSelectedFile();
					textField4.setText(attachedFile.getName());			

				}				
			}
		});
		btn2.setFont(new Font("굴림", Font.PLAIN, 16));
		btn2.setBounds(483, 551, 129, 29);
		contentPane.add(btn2);
	}

	public void sendMail(String toMail, String toName, String subject, String content, String type, File attachedFile) throws UnsupportedEncodingException, MessagingException{
		//google smtp 서버 설정
		Properties props = new Properties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		// 인증환경
		MyAuthenticator authenticator = new MyAuthenticator(fromMail, fromPassword);

		// 접속 후 연결환경
		Session session = Session.getDefaultInstance(props, authenticator);

		// 메세지 내용
		MimeMessage msg = new MimeMessage(session);

		// 전체적인 설정
		msg.setHeader("Content-Type", "text/"+type+"; charset=utf-8"); 
		// 받는사람 설정
		// CC 참조 / BCC 숨은참조 
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toMail, toName, "utf-8"));
		// 제목
		msg.setSubject(subject);

		// 첨부파일
		if(attachedFile!=null) {
			MimeBodyPart attachPart = new MimeBodyPart();
			attachPart.setFileName(attachedFile.getName()); // 파일명
			attachPart.setDataHandler(new DataHandler(new FileDataSource(attachedFile)));		

			MimeBodyPart bodypart = new MimeBodyPart();
			bodypart.setContent(content, "text/"+type+";charset=utf-8");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(bodypart);
			multipart.addBodyPart(attachPart);

			// 메세지 내용
			msg.setContent(multipart);
		} else {			
			msg.setContent(content, "text/"+type+"; charset=utf-8");
		}

		// 보내는 시간 설정
		msg.setSentDate(new java.util.Date());	

		// 보내기
		Transport.send(msg);

		System.out.println("메일 전송 완료");

	}
}
