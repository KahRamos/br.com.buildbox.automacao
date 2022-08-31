package br.com.buildbox.steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;


public class cadastrosSteps {

    private br.com.buildbox.pages.cadastroPage cadastroPage = new br.com.buildbox.pages.cadastroPage();

    @Dado("^preenchido o cadastro corretamente$")
    public void preenchido_o_cadastro_corretamente() throws Throwable {
        cadastroPage.entrarUrl();
        cadastroPage.name();
        cadastroPage.cpf();
        cadastroPage.email();
        cadastroPage.whatsapp();
        cadastroPage.cep();
        cadastroPage.botaoCep();
        cadastroPage.numero();
        cadastroPage.entrega();
        cadastroPage.cnh();
    }

    @Quando("^clica no botao de confirmacao$")
    public void clica_no_botao_de_confirmacao() throws Throwable {
        cadastroPage.clicarBotaoCadastro();
    }

    @Entao("^abre uma mensagem de confirmação$")
    public void abre_uma_mensagem_de_confirmação() throws Throwable {
        cadastroPage.validarCadastro();
    }
}