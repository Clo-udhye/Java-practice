import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender2 {
	private String fromMail;
	private String fromPassword;
	
	public MailSender2() {
		this.fromMail = "skssskdy@gmail.com"; //구글 아이디
		this.fromPassword = "qq91522737"; //구글 비밀번호
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toMail = "skssskdy@gmail.com"; //받는사람
		String toName = "테스터"; //받는 사람 이름
		String subject = "테스트 제목";
		// 형식화된 메일 - html
		// 이미지 첨부 - 이미지의 절대 주소 
		String content = "<html><head><meta charset ='utf-8'/> </head><body><font color='blue'>html 내용</font><br/><img src='https://ssl.pstatic.net/tveta/libs/1313/1313466/5f5d81fa7f2d6adb4704_20201211101154645.jpg'></body></html>";

		
		MailSender2 mailSender = new MailSender2();
		mailSender.sendMail(toMail, toName, subject, content);
	}
	
	public void sendMail(String toMail, String toName, String subject, String content) {
		try {
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
			msg.setHeader("Content-Type", "text/html; charset=utf-8"); 
			// 받는사람 설정
			// CC 참조 / BCC 숨은참조 
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toMail, toName, "utf-8"));
			// 제목
			msg.setSubject(subject);
			// 내용
			msg.setContent(content, "text/html; charset=utf-8");	
			// 보내는 시간 설정
			msg.setSentDate(new java.util.Date());		
			// 보내기
			Transport.send(msg);
			
			System.out.println("메일 전송 완료");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
