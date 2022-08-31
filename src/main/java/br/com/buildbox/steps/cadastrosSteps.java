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

    @Dado("^que nenhum campo foi preenchido$")
    public void que_nenhum_campo_foi_preenchido() throws Throwable {
        cadastroPage.nenhumcampopreenchido();
    }

    @Entao("^uma mensagem vermelha aparece em cada campo para ser preenchido$")
    public void uma_mensagem_vermelha_aparece_em_cada_campo_para_ser_preenchido() throws Throwable {
        cadastroPage.validarmensagem();
    }

    @Dado("^que o campo de nome não foi preenchido$")
    public void que_o_campo_de_nome_não_foi_preenchido() throws Throwable {

    }
}
