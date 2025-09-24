package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage {

	// Declaration
	@FindBy(id = "name")
	private WebElement nameTF;

	@FindBy(name = "email")
	private WebElement emailTF;

	@FindBy(id = "password")
	private WebElement passwordTF;

	@FindBy(xpath = "//button[text()='Register']")
	private WebElement registerBtn;

	// Initialization
	public LoginPomPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	// Utilization

	public WebElement getNameTF() {
		return nameTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

}
