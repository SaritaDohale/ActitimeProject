package com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
//declaration
	@FindBy(xpath="//div[.='Add New']")
    private WebElement addnewbtn;
	
	@FindBy(xpath="//div[.=''+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'])")
	private WebElement custname;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description'])")
	private WebElement custdept;
	
	@FindBy(xpath="//div[.='Create Customer']")
    private WebElement createbtn;


//initialization
 public TaskPage(WebDriver driver)  {
	 PageFactory.initElements(driver,this);
	 
 }
 //utilization


public WebElement getAddnewbtn() {
	return addnewbtn;
}


public WebElement getNewcust() {
	return newcust;
}


public WebElement getCustname() {
	return custname;
}


public WebElement getCustdept() {
	return custdept;
}


public WebElement getCreatebtn() {
	return createbtn;
}

}