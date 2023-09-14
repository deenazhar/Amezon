package com.base;

import java.awt.image.BufferedImage;   
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	public static WebDriver driver;
	
	public static void enterUrl(String url) {

		driver.get(url);
	}

	public static void browserConf(String browserType) {

		switch (browserType) {
		case "chrome":

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			break;

		case "ie":

			WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

			break;

		default:
			break;
		}
	}

	public static void enterUrl(Object url) {

		driver = new ChromeDriver();

		driver.get((String) url);
	}
	public static void maximize() {

		driver.manage().window().maximize();

	}

	public static void elementText(WebElement element,String text) {

		visblityOfElement(element);

		element.sendKeys(text);

	}

	public static void elementText(WebElement element,Keys text) {

		//		visblityOfElement(element);

		element.sendKeys(text);

	}


	public static void elementClick(WebElement element) {

		//		visblityOfElement(element);

		element.click();

	}

	public static void acceptAlert() {

		driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {

		driver.switchTo().alert().dismiss();
	}	

	public static String elementGetText(WebElement element) {

		String text = element.getText();
		return text;


	}


	public static String elementAttributeText(WebElement element,String text) {

		String value = element.getAttribute(text);
		return value;


	}

	public static void currenteWindow() {
		driver.close();

	}

	public static void allWindow() {

		driver.quit();


	}

	public static String getTitle() {

		String title = driver.getTitle();
		return title;

	}
	public static String currectUrl() {

		String url = driver.getCurrentUrl();
		return url;

	}

	public static void selectVisibleText (WebElement element,String text) {

		visblityOfElement(element);


		Select s = new Select(element);

		s.selectByVisibleText(text);

	}

	public static void selectAttributeValue (WebElement element,String value) {

		visblityOfElement(element);

		Select s = new Select(element);

		s.selectByValue(value);
	}

	public static void SelectIndexText (WebElement element,int index) {

		visblityOfElement(element);

		Select s = new Select(element);

		s.selectByIndex(index);
	}

	public static void javaScriptText (WebElement element,String data) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}

	public static void javaScriptClick(WebElement element) {

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click();", element);

	}

	public static void launchBrowserChrome(String url) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.navigate().to(url);

	}
	
	public static void launchBrowserFirefox(String url) {

		WebDriverManager.firefoxdriver().setup();

		driver = new FirefoxDriver();

		driver.navigate().to(url);

	}

	public static void switchChildWindow(String name) {

		driver.switchTo().window(name);
	}

	public static void frameIndex(int index) {

		driver.switchTo().frame(index);
	}

	public static void frameId(String id) {

		driver.switchTo().frame(id);
	}	

	public static WebElement findElementUsingId(String id) {

		WebElement txtName = driver.findElement(By.id(id));
		return txtName;
	}	

	public static WebElement findElementUsingName(String name) {

		WebElement txtName = driver.findElement(By.name(name));
		return txtName;
	}

	public static WebElement findElementUsingClassName(String classname) {

		WebElement txtName = driver.findElement(By.className(classname));
		return txtName;
	}

	public static WebElement findElementUsingXpath(String expression) {

		WebElement txtName = driver.findElement(By.xpath(expression));
		return txtName;
	}

	public static WebElement findElementUsingXpath(WebElement expression) {

		WebElement txtName = driver.findElement(By.xpath("expression"));
		return txtName;

	}

	public static List<WebElement> selectUsingGetText(WebElement element) {

		visblityOfElement(element);

		Select select = new Select(element);

		List<WebElement> options = select.getOptions();

		for (WebElement webElement : options) {

			String text = webElement.getText();


		}
		return options;


	}

	public static List<WebElement> selectUsingGetText(WebElement element,String name) {

		Select select = new Select(element);

		List<WebElement> options = select.getOptions();

		for (WebElement webElement : options) {

			String attribute = webElement.getAttribute(name);




		}
		return options;

	}

	public static WebElement selectFirstOption(WebElement element) {

		visblityOfElement(element);

		Select select = new Select(element);

		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;


	}

	public static boolean selectMultiple(WebElement element) {

		visblityOfElement(element);

		Select select = new Select(element);

		boolean multiple = select.isMultiple();
		return multiple;


	}

	public static void implicityWait(int sec) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}

	public static void implicityWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public static void visblityOfElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void deselectIndex(WebElement element,int index) {

		visblityOfElement(element);

		Select select = new Select(element);

		select.deselectByIndex(index);
	}

	public static void deselectValue(WebElement element,String value) {

		visblityOfElement(element);

		Select select = new Select(element);

		select.deselectByValue(value);

	}

	public static void deselectText(WebElement element,String text) {

		visblityOfElement(element);

		Select select = new Select(element);

		select.deselectByVisibleText(text);

	}

	public static void deselectAll(WebElement element) {

		visblityOfElement(element);

		Select select = new Select(element);

		select.deselectAll();

	}

	public static String parentWindow() {

		String windowHandle = driver.getWindowHandle();
		return windowHandle;	 
	}

	public static Set<String> childWindow() {

		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {

			if (string.length()!=0) {

				driver.switchTo().window(string);


			}

		}
		return windowHandles;

	}

	public static void takeScreenShot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

		File file = new File(path);

		FileUtils.copyFile(screenshotAs, file);


	}

	public static void takeScreenShotElement(WebElement element,String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

		BufferedImage bufferedImage = ImageIO.read(screenshotAs);

		Point location = element.getLocation();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		BufferedImage subimage = bufferedImage.getSubimage(location.getX(), location.getY(), width, height);

		ImageIO.write(subimage, "png", screenshotAs);

		File shotlocation = new File(path);

		FileUtils.copyFile(screenshotAs, shotlocation);
	}

	public static void refreshpage() {

		driver.navigate().refresh();
	}

	public static byte[] byteTakeScreenShotBase() {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		byte[] screenshotAs = takesScreenshot.getScreenshotAs(OutputType.BYTES);
		return screenshotAs;   
	}  

	public static String getProjectPath() {

		String property = System.getProperty("user.dir");
		return property;
	}



	public static String getProprtiesFileValue(String key) throws FileNotFoundException, IOException {

		Properties properties = new Properties();

		properties.load(new FileInputStream(getProjectPath()+ "\\Config\\Config.properties"));

		Object object = properties.get(key);

		String string = (String) object;
		return string;

	}

	public static boolean selectDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		return displayed;

	}

	public static boolean selectEnabled(WebElement element) {

		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean selectSelected(WebElement element) {

		boolean selected = element.isSelected();
		return selected;
	}

	public static void singleActionInMouse(WebElement target) {

		Actions actions = (Actions) driver;

		actions.moveToElement(target);
	}

	public static void dragAndDrop(WebElement source,WebElement target) {

		Actions actions = (Actions) driver;

		actions.dragAndDrop(source, target);
	}

	public static void rightClick() {

		Actions actions = (Actions) driver;

		actions.contextClick();



	}

	public static String readCellValue(String sheetName,int index,int num) throws IOException {


		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\DataSheet\\FrameWork Details.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(index);
		Cell cell = row.getCell(num);
		String value = cell.getStringCellValue();
		return value ;


	}


	public static List<WebElement> findElementsUsingByXpath(String list) {

		List<WebElement> listElements = driver.findElements(By.xpath(list));
		return listElements;

	}


	public static List<String> elementGetListText(List<WebElement> element) {

		List<String> lists = new ArrayList<String>();

		for (WebElement webElement : element) {

			String text = webElement.getText();


			lists.add(text);

		}
		return lists;



	}
	

	

/////////////////////////////////////////////////////////////////////////////////////////////////////
	public static String excelNumericValue(String sheetName,int rowIndex,int cellIndex,int cellIndex2) throws IOException {

		String value ="";

		File file = new File("C:\\Users\\User\\Cucumber\\AmezonProject\\Excell\\Amezonlogin.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		CellType cellType = cell.getCellType();
		Cell cell2 = row.getCell(cellIndex2);
		CellType cellType2 = cell2.getCellType();
		switch (cellType) {
		case STRING:

			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");
				value = format.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				value = String.valueOf(round);
			}

			break;


		default:
			break;
		}
		return value;
		
		
		
	

}
/////////////////////////////////////////////////////////////////////////////////////////////////
	public void writeCellValue(String Sheet,int rowIndex,int cellIndex,String setValue) throws IOException {


		File file = new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\DataSheet\\FrameWork Details.xlsx");

		FileInputStream inputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(inputStream);

		Sheet sheet = workbook.getSheet(Sheet);

		Row row = sheet.createRow(rowIndex);

		Cell createCell = row.createCell(cellIndex);

		createCell.setCellValue(setValue);



		FileOutputStream outputStream = new FileOutputStream(file);

		workbook.write(outputStream);

	}

	public static List<WebElement> elementGetList(List<WebElement> element) {
		List <WebElement> lists= new ArrayList<WebElement>();

		for (WebElement webElement : element) {

			webElement.click();


		}
		return lists;	
	}

	public static void takeScreenShotName(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);

		File file = new File("D:\\Screenshot\\Test images\\TestNg\\" + name + "\\Output.png");

		FileUtils.copyFile(screenshotAs, file);


	}

}






