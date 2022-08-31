package br.com.buildbox.pages;

import br.com.buildbox.core.Dsl;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static br.com.buildbox.core.driverFactory.getDriver;

public class homePage{
    Dsl dsl;

    public homePage() {
        this.dsl = new Dsl();
    }

    public void entrarUrl(){
        getDriver().get("https://buger-eats.vercel.app/");
        dsl.espraInplicita(100000, TimeUnit.SECONDS );
    }

    public void validarTextoHomePage(){
        Assert.assertEquals("Seja um parceiro entregador pela Buger Eats", dsl.ObterTexto(By.xpath("//*[@id=\"page-home\"]/div/main/h1")));
    }

    public void clicarBotaoCadastro(){
        dsl.ClicarBotao(By.xpath("//*[@id=\"page-home\"]/div/main/a"));
    }

    public void validarTextoCadastrPage(){
        Assert.assertEquals("Dados", dsl.ObterTexto(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[1]/header/h2")));
    }
}
