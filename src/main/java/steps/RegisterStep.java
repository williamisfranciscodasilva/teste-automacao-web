package steps;

import cucumber.api.java.pt.E;
import pages.RegisterPages;

/**
 * 
 * @author Master
 *  Step de preenchimento do formulário
 */
public class RegisterStep {
	
	/*
	 * Instância da classe ResgisterPage para preenchimento do formulário
	 */
	public RegisterPages registerPages = new RegisterPages();
	
	@E("preencha o formulario")
	public void preencha_o_formulario() {
		registerPages.newRegister();
	}

}
