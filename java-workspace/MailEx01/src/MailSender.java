import java.io.UnsupportedEncodingException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {
	private String fromMail;
	private String fromPassword;
	
	public MailSender() {
		this.fromMail = "skssskdy@gmail.com"; //구글 아이디
		this.fromPassword = "qq91522737"; //구글 비밀번호
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toMail = "skssskdy@gamil.com"; //받는사람
		String toName = "테스터"; //받는 사람 이름
		String subject = "테스트 제목";
		String content = "테스트내용";
		
		MailSender mailSender = new MailSender();
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
			msg.setHeader("Content-Type", "text/plain; charset=utf-8");
			// 받는사람 설정
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toMail, toName, "utf-8"));
			// 제목
			msg.setSubject(subject);
			// 내용
			msg.setContent(content, "text/plain; charset=utf-8");	
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
