import com.sendgrid.*;
import java.io.IOException;

public class SendGrid {

	public static void main(String[] args) throws IOException {
//		Email from = new Email("dominic.hermida@alphait.mx");
//		String subject = "Sending with Sendgrid is Fun";
//		Email to = new Email("dominic.hermidass@udlap.mx");
//		Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
//		Mail mail =  new Mail(from, subject, to, content);
//		
//		com.sendgrid.SendGrid sg =  new com.sendgrid.SendGrid("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");
//		Request request = new Request();
//		
//		
//		try {
////			request.setMethod(Method.POST);
////			request.setEndpoint("mail/send");
////			request.setBody(mail.build());
////			Response response = sg.api(request);
////			System.out.println(response.getStatusCode());
////			System.out.println(response.getBody());
////			System.out.println(response.getHeaders());
//			
//		      request.setMethod(Method.GET);
//		      request.setEndpoint("api_keys");
//		      Response response = sg.api(request);
//		      System.out.println(response.getStatusCode());
//		      System.out.println(response.getBody());
//		      System.out.println(response.getHeaders());
//			
//		}catch(IOException ex) {
//			System.out.println(ex.getMessage());
//		}
		
//		Mail mail = new Mail();
//	    mail.setFrom(new Email("dominic.hermida@alphait.mx"));
//	    mail.setTemplateId("d-1e9c54e133974b4b944b22c072bad400");
//	    
//	    Personalization personalization = new Personalization(); 
//	    personalization.addDynamicTemplateData("subject", "Probando Templates");
//	    personalization.addDynamicTemplateData("name", "Example User");
//	    personalization.addDynamicTemplateData("city", "Dominic-City");
//	    personalization.addDynamicTemplateData("url", "www.google.com/url");
//	    personalization.addTo(new Email("dominic.hermidass@udlap.mx"));
//	    
//	    mail.addPersonalization(personalization);
//	    
//	    com.sendgrid.SendGrid sg  = new com.sendgrid.SendGrid("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");
//	    Request request = new Request();
//	    
//		    try {
//		    	request.setMethod(Method.POST);
//		    	request.setEndpoint("mail/send");
//		    	request.setBody(mail.build());
//		    	Response response = sg.api(request);
//		    	
//		    	System.out.println(response.getStatusCode());
//		    	System.out.println(response.getBody());
//		    	System.out.println(response.getHeaders());
//		    	
//		    }catch(IOException  ex){
//		    	System.out.println("Error" ex.getMessage());
//		    }
//		
		
		
		com.sendgrid.SendGrid sg = new com.sendgrid.SendGrid("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");
	      Request request = new Request();
	      request.addHeader("Authorization", "Bearer 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");
	      request.setMethod(Method.POST);
	      request.setEndpoint("mail/send");
	      request.setBody("{\"from\": {\"email\": \"dominic@alphait.mx\"},\"personalizations\":[{\"to\": [{\"email\": \"javiercuriel94@gmail.com\"}],\"dynamic_template_data\": {\"premio\": \"UN COCHEEE\",\"name\": \"Example User\", \"city\": \"Denver\"}}],\"template_id\": \"d-1e9c54e133974b4b944b22c072bad400\"}");
	      Response response = sg.api(request);
	      System.out.println(response.getStatusCode());
	      System.out.println(response.getBody());
	      System.out.println(response.getHeaders());
	}

}
