package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://10.181.11.150/cmpqr_cartera/index.php")
public class CMRAlkomprarHomePage extends PageObject {
    public static Target SELECT_NAME = Target.the("Select name").located(By.id("usuario"));
    public static Target SELECT_PASS = Target.the("Select password").located(By.id("/html/body/center/table/tbody/tr[2]/td/form/table/tbody/tr[3]/td[2]/input"));
    public static Target BUTTON_INGRESAR = Target.the("Boton ingresar").located(By.id("ingresa"));
}
