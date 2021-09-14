package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona la universaidad choucair")
            .located(By.xpath("//*[@id=\"universidad\"]/a/img"));
    public static final Target INPUT_COURSE =Target.the("Buscar el curso")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO =Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click en el curso")
            .located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE = Target.the("Extra el nombre del curso")
            .located(By.xpath("//*[@id=\"page-header\"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1"));
    //    //*[@id="page-header"]/div/div/div[2]/div[1]/div[1]/a/div/div/h1
    //   //a[contains(text(),'BDD (Desarrollo guiado por pruebas)')]
}
