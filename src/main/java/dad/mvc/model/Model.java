package dad.mvc.model;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class Model {
	public Email email=new SimpleEmail();

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

}
