package com.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class AmazonPage extends BaseClass {
	
	public AmazonPage(){
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy (id="nav-link-accountList-nav-line-1")
	private WebElement chkLoginSuccessMsg;
	
	@FindBy (id="twotabsearchtextbox")
	private WebElement lnkSearchBox;
	
	@FindBy (id="nav-search-submit-text")
	private WebElement clickSearchBtn;
	
	@FindBy (xpath="//span[@class='a-color-state a-text-bold']")
	private WebElement txtProductSuccessMsg;
	
	@FindBy (id="a-autoid-0-announce")
	private WebElement btnHightoLow1;
	
	@FindBy (id="s-result-sort-select_2")
	private WebElement btnHightoLow2;
	
	@FindBy (xpath="//span[@class='a-price-whole']")
	private List<WebElement> allProductPrice;
	
	@FindBy (xpath="(//div[@class='a-section']//div//img[@class='s-image'])[1]") 
	private WebElement clkFirstProduct;
	
	@FindBy (xpath="//span[@id='productTitle']")
	private WebElement txtProductName;
	
	@FindBy (xpath="(//span[@class='a-price-whole'])[5]")
	private WebElement txtProductPrice;
	
	@FindBy (xpath="(//span[@class='qa-item-title'])[1]")
	private WebElement verifyAfterProductClk;
	
	@FindBy (id="add-to-cart-button")
	private WebElement clkAddCart1;
	
	@FindBy (xpath="//input[@class='a-button-input']//ancestor::form[@id='attach-view-cart-button-form']")
	private WebElement clkAddCart2;
	
	@FindBy (xpath="//div[@class='a-row sc-cart-header']")
	private WebElement txtCartSuccessMsg;
	
	@FindBy (name="proceedToRetailCheckout")
	private WebElement clkCheckOut;
	
	@FindBy (id="ap_email")
	private WebElement txtUserName;
	
	@FindBy (id="continue")
	private WebElement clkContinue;
	
	@FindBy (id="ap_password")
	private WebElement txtPassword;
	
	@FindBy (id="signInSubmit")
	private WebElement btnSubmit;
	
	@FindBy (xpath="//div[@class='a-column a-span8']")
	private WebElement chkCheckOutMSg;
	
	@FindBy (id="add-new-address-popover-link")
	private WebElement txtaddNewAddress;
	
	@FindBy (xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	private WebElement txtName;
	
	@FindBy (xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	private WebElement txtMobileNo;
	
	@FindBy (xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	private WebElement txtPincode;
	
	@FindBy (xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	private WebElement txtFlatName;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
	private WebElement txtArea;
	
	@FindBy (xpath="//input[@id='address-ui-widgets-landmark']")
	private WebElement txtLandmark;
	
	@FindBy (xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	private WebElement txtCity;
	
	@FindBy (xpath="//span[text()='TAMIL NADU']")
	private WebElement txtState;
	
	@FindBy (xpath="//span[@id='address-ui-widgets-form-submit-button']")
	private WebElement clkaddNewAddress;
	
	@FindBy (xpath="//select[@class='a-native-dropdown']")
	private WebElement ddnCardClick;
	
	@FindBy (name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
	private WebElement clkPaymentMethod;
	
	@FindBy (xpath="//i[@class='a-icon a-icon-logo clickable-heading']")
	private WebElement lnkClickPage;
	
	@FindBy (xpath="(//a[@class='a-button-text'])[3]")
	private WebElement returnToCart;
	
	@FindBy (xpath="//span[@class='a-truncate-cut']")
	private WebElement chkProductName;
	
	@FindBy (xpath="//p[@class='a-spacing-mini']")
	private WebElement chkProductPrice;
	
	@FindBy (xpath="//input[@value='Delete']")
	private WebElement deleteCart;
	
	@FindBy (xpath="//h1[@class='a-spacing-mini a-spacing-top-base']")
	private WebElement chkRemoveMsg;

	public WebElement getChkLoginSuccessMsg() {
		return chkLoginSuccessMsg;
	}

	public WebElement getLnkSearchBox() {
		return lnkSearchBox;
	}

	public WebElement getClickSearchBtn() {
		return clickSearchBtn;
	}

	public WebElement getTxtProductSuccessMsg() {
		return txtProductSuccessMsg;
	}

	public WebElement getBtnHightoLow1() {
		return btnHightoLow1;
	}

	public WebElement getBtnHightoLow2() {
		return btnHightoLow2;
	}

	public List<WebElement> getAllProductPrice() {
		return allProductPrice;
	}

	public WebElement getClkFirstProduct() {
		return clkFirstProduct;
	}

	public WebElement getTxtProductName() {
		return txtProductName;
	}

	public WebElement getTxtProductPrice() {
		return txtProductPrice;
	}
	
	public WebElement getVerifyAfterProductClk() {
		return verifyAfterProductClk;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public WebElement getClkAddCart1() {
		return clkAddCart1;
	}

	public WebElement getClkAddCart2() {
		return clkAddCart2;
	}

	public WebElement getTxtCartSuccessMsg() {
		return txtCartSuccessMsg;
	}

	public WebElement getClkCheckOut() {
		return clkCheckOut;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getClkContinue() {
		return clkContinue;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public WebElement getChkCheckOutMSg() {
		return chkCheckOutMSg;
	}

	public WebElement getTxtaddNewAddress() {
		return txtaddNewAddress;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	public WebElement getTxtPincode() {
		return txtPincode;
	}

	public WebElement getTxtFlatName() {
		return txtFlatName;
	}

	public WebElement getTxtArea() {
		return txtArea;
	}

	public WebElement getTxtLandmark() {
		return txtLandmark;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getClkaddNewAddress() {
		return clkaddNewAddress;
	}
	

	public WebElement getDdnCardClick() {
		return ddnCardClick;
	}

	public WebElement getClkPaymentMethod() {
		return clkPaymentMethod;
	}

	public WebElement getLnkClickPage() {
		return lnkClickPage;
	}

	public WebElement getReturnToCart() {
		return returnToCart;
	}

	public WebElement getChkProductName() {
		return chkProductName;
	}

	public WebElement getChkProductPrice() {
		return chkProductPrice;
	}

	public WebElement getDeleteCart() {
		return deleteCart;
	}

	public WebElement getChkRemoveMsg() {
		return chkRemoveMsg;
	}
	
	public String txtLoginScuccessMsg() {
		
		String actSuccessmsg = elementGetText(getChkLoginSuccessMsg());
		return actSuccessmsg;

	}
	
	public void searchBox(String search) {
		
	elementText(getLnkSearchBox(),search);
	elementClick(getClickSearchBtn());
	implicityWait();
	
	}
	
	public String txtProductSuccessMsg() {
		
		String actProductMsg = elementGetText(getTxtProductSuccessMsg());
		return actProductMsg;
		
		
	}
	
	public void clickRdoHightoLow() throws InterruptedException {
		
		elementClick(getBtnHightoLow1());
		elementClick(getBtnHightoLow2());
		
	}
	
	public boolean sortProductPriceHighToLow() throws InterruptedException {
		
		
		Thread.sleep(3000);
		List<String> allPricesWithSymbol = elementGetListText(getAllProductPrice());
		List<Integer> allPricesBeforeSort = new ArrayList<Integer>();
		for (String replaceSymbol : allPricesWithSymbol) {
			String beforeSortPricelist = replaceSymbol.replaceAll("[,]","");
			try
			{
				allPricesBeforeSort.add(Integer.parseInt(beforeSortPricelist));
			} 
			catch(NumberFormatException ex){ 
			    
			}
			
		}
		System.out.println(allPricesBeforeSort);
		Thread.sleep(3000);
		List<Integer> listAfterSortWithOutSymbol = new ArrayList<Integer>(); 
		List<String> priceAfterSortWithSymbol = elementGetListText(getAllProductPrice());
		for (String replaceSymbol : priceAfterSortWithSymbol) {
			String priceList = replaceSymbol.replaceAll("[,]","");
			try{
				listAfterSortWithOutSymbol.add(Integer.parseInt(priceList));
			} catch(NumberFormatException ex){ 
			   
			}
			
		}
		System.out.println(listAfterSortWithOutSymbol);
		Collections.reverse(listAfterSortWithOutSymbol);
		Collections.reverse(listAfterSortWithOutSymbol);
		System.out.println(listAfterSortWithOutSymbol);
		
		boolean b = allPricesBeforeSort.equals(listAfterSortWithOutSymbol);
		return b;
	
		
	}
	
	public void clkFirstProduct() {
		
		//implicityWait();
		elementClick(getClkFirstProduct());
         
		String parId = driver.getWindowHandle();
		
		System.out.println(parId);
		
		Set<String> parId2 = driver.getWindowHandles();
		
		System.out.println(parId2);
		
		for (String amazonId : parId2) {
		
			if (amazonId.equals(parId)) {
				
				driver.switchTo().window(parId);
				
			} else {
				
				driver.switchTo().window(amazonId);

			}		
		}	
		
		
	}
	
	public static String productName;
	public static String productPrice;
	public void ProdutNameandPrice() {
		
        productName = elementGetText(getTxtProductName());
		String replacePrice = elementGetText(getTxtProductPrice());
		productPrice = replacePrice.replaceAll("[,]", "");
		System.out.println(productPrice);
		
	}
	
	public String txtAfterProductClick() {
		
		String actVerifyproductMsg = elementGetText(getVerifyAfterProductClk());
		return actVerifyproductMsg;
	}
	
	public void addCart() {
		
		elementClick(getClkAddCart1());
		implicityWait();
		elementClick(getClkAddCart2());
		
	}
	
	public String txtCartSuccessMsg() {
		
		String actCartSuccessMsg = elementGetText(getTxtCartSuccessMsg());
		return actCartSuccessMsg;
		
	}
	
	public void placeOrderOut() {
		
		elementClick(getClkCheckOut());
	}
	
	public void loginData(String loginSheet, int RowNumber, int CellNumber ,int CellNumber2) throws IOException {
		
		elementClick(getClkCheckOut());
		implicityWait();
		elementText(getTxtUserName(), excelNumericValue(loginSheet, RowNumber, CellNumber,CellNumber));
		elementClick(getClkContinue());
		elementText(getTxtPassword(), excelNumericValue(loginSheet, RowNumber, CellNumber2,CellNumber2));
		elementClick(getBtnSubmit());
	}
	
	
	
	
	public String txtCheckOutMsg() {
		
		String actChkCheckOutMsg = elementGetText(getChkCheckOutMSg());
		return actChkCheckOutMsg;
		
	}
	
	
	

	
	
	
	
	
	
	
	
	


	
	
	
	
	

	

}
