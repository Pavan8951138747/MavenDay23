package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "")
	private WebElement unTB;

	@FindBy(id = "")
	private WebElement pwTB;

	@FindBy(id = "")
	private WebElement loginBTN;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pw) {
		unTB.sendKeys(pw);
	}

	public void clickLoginBTN() {
		loginBTN.click();
	}

}
