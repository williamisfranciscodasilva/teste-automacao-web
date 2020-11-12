package steps;

import cucumber.api.java.pt.Dado;
import pages.LoginPages;

public class LoginStep {
	
	public LoginPages loginPages = new LoginPages();
	
	@Dado("que eu acesse o sistema")
	public void dado_que_eu_acesse_o_sistema() {
		loginPages.login();
	}

}
