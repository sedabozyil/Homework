package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import Pages.Page;

public class Steps {

    Page page = new Page();

    @Given("Kampanya ve Çerez Kabul Edilir")
    public void cerezlerKabulEdilir(){

        page.kampanyakabuledilir();
    }

    @When("Mağazalar Açılır")
    public void magazaAc() throws Exception {
        page.magazaAcilir();
    }
}
