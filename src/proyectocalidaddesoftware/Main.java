package proyectocalidaddesoftware;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {

    public static void main(String[] args) {
        /*En la siguiente línea se cambia la ruta en donde se tiene instalado el driver de chrome en su computadora
        y al final escribir el nombre del driver de chrome con su extención que es .exe*/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\eduar\\OneDrive\\Escritorio\\Selenium\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://www.reverso.net/traducci%C3%B3n-texto");
        
    }
    
}
