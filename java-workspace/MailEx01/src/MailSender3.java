import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

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

public class MailSender3 {
	private String fromMail;
	private String fromPassword;
	
	public MailSender3(String fromMail, String fromPassword) {
		this.fromMail = fromMail;
		this.fromPassword = fromPassword;
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
