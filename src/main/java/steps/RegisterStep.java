package steps;

import cucumber.api.java.pt.E;
import pages.RegisterPages;

/**
 * 
 * @author Master
 *  Step de preenchimento do formul�rio
 */
public class RegisterStep {
	
	/*
	 * Inst�ncia da classe ResgisterPage para preenchimento do formul�rio
	 */
	public RegisterPages registerPages = new RegisterPages();
	
	@E("preencha o formulario")
	public void preencha_o_formulario() {
		registerPages.newRegister();
	}

}
