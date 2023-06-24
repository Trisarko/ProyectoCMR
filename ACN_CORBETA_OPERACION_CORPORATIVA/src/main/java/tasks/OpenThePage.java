package tasks;

import exceptions.OpenPageException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import static exceptions.OpenPageException.IMPOSSIBLE_OPEN_PAGE;

public class OpenThePage implements Task {

    private PageObject page;

    public OpenThePage(PageObject page) {
        this.page = page;
    }
    @Override
    @Step("{0} try open the page #page")
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.wasAbleTo(Open.browserOn(page));
        } catch (AssertionError e){
            throw new OpenPageException(IMPOSSIBLE_OPEN_PAGE, e);
        }

    }
    public static OpenThePage the(PageObject page){
        return Tasks.instrumented(OpenThePage.class, page);
    }
}
