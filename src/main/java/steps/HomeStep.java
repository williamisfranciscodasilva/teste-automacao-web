package steps;

import cucumber.api.java.pt.E;
import pages.HomePages;

public class HomeStep {
	
	public HomePages homePages = new HomePages();
	
	@E("clique em contas")
	public void clique_em_contas() {
		homePages.accountClick();
	}
	
	@E("clique em fornecedores")
	public void clique_em_fornecedores() {
		homePages.suppliersClick();
	}
}
