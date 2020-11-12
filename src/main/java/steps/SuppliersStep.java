package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import pages.SuppliersPage;

public class SuppliersStep {
	
	public SuppliersPage suppliersPage = new SuppliersPage();
	
	@E("clique no botao Add")
	public void clique_no_botao_Add() {
		suppliersPage.clickButtonAdd();
	}
	
	@Entao("devo validar o email na lista de fornecedores")
	public void devo_validar_o_email_na_lista_de_fornecedores() {
		suppliersPage.validateEmail();
	}
}
