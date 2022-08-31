package br.com.buildbox.pages;

import br.com.buildbox.core.Dsl;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static br.com.buildbox.core.driverFactory.getDriver;

public class cadastroPage {

    private  Dsl dsl;

    public cadastroPage() {
        this.dsl = new Dsl();
    }

    public void entrarUrl(){
        getDriver().get("https://buger-eats.vercel.app/deliver");
        dsl.espraInplicita(100000, TimeUnit.SECONDS );
    }

    public void name(){
        dsl.Escreve(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[1]/div[1]/div[1]/input"), "Roberto Alves");
    }

    public void cpf() {
        dsl.Escreve(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[1]/div[1]/div[2]/input"), "37069682545");
    }

    public void email() {
        dsl.Escreve(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[1]/div[2]/div[1]/input"), "roberto.alves@gmail.com.br");
    }

    public void whatsapp() {
        dsl.Escreve(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[1]/div[2]/div[2]/input"), "11999665514");
    }

    public void cep() {
        dsl.Escreve(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[2]/div[1]/div[1]/input"), "01311-000");
    }

    public void botaoCep() {
        dsl.ClicarBotao(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[2]/div[1]/div[2]/input"));
    }

    public void numero() {
        dsl.Escreve(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[2]/div[3]/div[1]/input"), "301");
    }

    public void entrega() {
        dsl.ClicarBotao(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[3]/ul/li[1]/img"));
    }

    public void cnh(){
        //dsl.ClicarBotao(By.xpath("//*[@id=\"page-deliver\"]/form/div/p/svg"));
        dsl.upLoad(By.xpath("//*[@id=\"page-deliver\"]/form/div/p/svg/path"),"C:\\Users\\KARINA\\Workspace\\Projetos\\br.com.buildbox.automacao\\target\\imagem");
    }

    public void clicarBotaoCadastro(){
        dsl.ClicarBotao(By.xpath("//*[@id=\"page-home\"]/div/main/a/span/svg"));
    }

    public void validarCadastro(){
        Assert.assertEquals("Recebemos os seus dados. Fique de olho na sua caixa de email, pois e em breve retornamos o contato.", dsl.ObterTexto(By.xpath("//*[@id=\"swal2-html-container\"]")));
    }

    public void nenhumcampopreenchido(){
        dsl.Escreve(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[1]/div[1]/div[1]/input"), "");
    }
    public void validarmensagem(){
        Assert.assertEquals("É necessário informar o nome", dsl.ObterTexto(By.xpath("//*[@id=\"page-deliver\"]/form/fieldset[1]/div[1]/div[1]/span")));
    }
}