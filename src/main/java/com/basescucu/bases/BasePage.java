package com.basescucu.bases;


	import java.util.Arrays;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	public class BasePage {

		WebDriver driver;
		String parent, child;
		public HashMap<String, By> ObjectRepo = new HashMap<String, By>();

		public BasePage(WebDriver driver) {
			this.driver = driver;
		}

		public void addObject(String logicalName, By by) {
			ObjectRepo.put(logicalName, by);
		}

		public WebElement getElement(String logicalName) {
			By by = ObjectRepo.get(logicalName);
			WebElement element = driver.findElement(by);
			return element;
		}

		public void enterIntoTextbox(String logicalName, String value) {

			WebElement element = getElement(logicalName);
			element.sendKeys(value);
		}

		public void ClickonButton(String logicalName) {

			WebElement element = getElement(logicalName);
			element.click();
		}

		public void ClickRadioButton(String logicalName) {

			WebElement element = getElement(logicalName);
			element.click();
		}

		public void Clickonlink(String LogicalName) {

			WebElement element = getElement(LogicalName);
			element.click();
		}

		public void cleartextbox(String LogicalName) {
			WebElement element = getElement(LogicalName);
			element.clear();
		}

		public String verifytextmsg(String logicalName) {
			WebElement element = getElement(logicalName);
			return element.getText();

		}
		public void windowhandles() {

			Set<String> w = driver.getWindowHandles();
			Iterator<String> t = w.iterator();
			parent = t.next();
			child = t.next();
			driver.switchTo().window(child);
		}

		public void switchtomainwindow() {
			driver.switchTo().window(parent);

		}
		public void switchtoframe(String logicalName) {
			WebElement element = getElement(logicalName);
			 driver.switchTo().frame(element);
		}

		public void defaultcontent() {
			driver.switchTo().defaultContent();
		}

		public void dropdown_list(String logicalName, List<String> ExpectedList) {
			List<WebElement> ActualListitems = driver.findElements(ObjectRepo.get(logicalName));

			String Actual = "";
			for (WebElement webelement : ActualListitems) {
				Actual = webelement.getText().replace("\n", ",");
			}
			List<String> ActualList = Arrays.asList(Actual.split(",", -1));
			Assert.assertEquals(ActualList, ExpectedList);
		}

		public void Clickoncheckbox(String logicalName) {
			WebElement element = getElement(logicalName);
			element.click();
			}

		public Boolean verifycheckbox(String logicalName) {
			WebElement element = getElement(logicalName);
			return element.isDisplayed();
		}

		public void mouseover(String logicalName) {
			Actions actions = new Actions(driver);
			WebElement element = getElement(logicalName);
			actions.moveToElement(element).build().perform();
			//element.click();
		}

		public void Selectoption(String logicalName, String value) {
			Select option = new Select(getElement(logicalName));
			option.selectByVisibleText(value);
		}
		public void waitforElement(String logicalName ) {

			WebDriverWait wait = new WebDriverWait(driver, 50);

		}

	}



