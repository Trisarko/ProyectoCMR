package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.User;
import models.UserTransform;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.LogIn;
import userinterfaces.CMRAlkomprarHomePage;
import tasks.OpenThePage;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SignUpCMRAlkomprarStepdefinition {

    @Managed()
    private WebDriver navegador;
    private Actor actor = Actor.named("Alejandro y Eva");

    private CMRAlkomprarHomePage cmrAlkomprarHomePage = new CMRAlkomprarHomePage();

    @DataTableType(replaceWithEmptyString = "[anonymous]")
    public User informationTheUser(Map<String, String> row){
        return new User(
                row.get("username"),
                row.get("password")
        );
    }
    @Before
    public void setUp() {
        setTheStage(new OnlineCast());
    }

    @Given("that try open CMR Alkomprar page")
    public void thatTryOpenCMRAlkomprarPage() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(cmrAlkomprarHomePage));
    }
    @When("try signup in the page")
    public void trySignupInThePage(List<User> informationTheUsers) {
        User informationTheUser = UserTransform.withThe(informationTheUsers);
        theActorInTheSpotlight().attemptsTo(LogIn.withThe(informationTheUser));
    }
    @Then("should see that success created user")
    public void shouldSeeThatSuccessCreatedUser() {

    }

}
