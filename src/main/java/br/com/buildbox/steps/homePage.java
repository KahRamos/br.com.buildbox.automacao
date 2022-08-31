package br.com.buildbox.steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class homePage {

    private br.com.buildbox.pages.homePage homepage = new br.com.buildbox.pages.homePage();

    @Quando("^use link da home$")
    public void use_link_da_home() throws Throwable {
        homepage.entrarUrl();
    }

    @Entao("^deve ser exibida a home page do Buger Eats com sucesso$")
    public void deve_ser_exibida_a_home_page_do_Buger_Eats_com_sucesso() throws Throwable {
        homepage.validarTextoHomePage();
    }

    @Quando("^clicar no botao pata pagina de cadastro$")
    public void clicar_no_botao_pata_pagina_de_cadastro() throws Throwable {
        homepage.entrarUrl();
        homepage.clicarBotaoCadastro();
    }

    @Entao("^sou direcionado para a pagina de cadastro$")
    public void foi_direcionado_para_a_pagina_de_cadastro() throws Throwable {
        homepage.validarTextoCadastrPage();
    }
}
