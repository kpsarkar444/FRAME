package GenericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib {
	
	public static Select sel=null;
	
	public void selectByText(WebElement selWebEle, String visibleText){
		sel=new Select(selWebEle);
		sel.selectByVisibleText(visibleText);
	}
	
	public void selectByIndex(WebElement selWebEle, int index){
		sel=new Select(selWebEle);
		sel.selectByIndex(index);
	}
	
	public void selectByValue(WebElement selWebEle, String value){
		sel=new Select(selWebEle);
		sel.selectByValue(value);
	}
	
	public void deSelectByText(WebElement selWebEle, String deSelVisibleText){
		sel=new Select(selWebEle);
		sel.deselectByVisibleText(deSelVisibleText);
	}
	
	public void deSelectByIndex(WebElement selWebEle, int deSelIndex){
		sel=new Select(selWebEle);
		sel.deselectByIndex(deSelIndex);
	}
	
	
	public void deSelectByValue(WebElement selWebEle, String deSelvalue){
		sel=new Select(selWebEle);
		sel.deselectByValue(deSelvalue);
	}
	
	public void deSelectAll(WebElement selWebEle){
		sel=new Select(selWebEle);
		sel.deselectAll();
	}
	
	public boolean isMultiple(WebElement selWebEle){
		sel=new Select(selWebEle);
		return sel.isMultiple();
	}
	
	public void getOptions(WebElement selWebEle){
		sel=new Select(selWebEle);
		sel.getOptions();
	}
	
	
	public void getFirstSeletedOption(WebElement selWebEle){
		sel=new Select(selWebEle);
		sel.getFirstSelectedOption();
	}
	
	public void getAllSelectedOptions(WebElement selWebEle){
		sel=new Select(selWebEle);
		sel.getAllSelectedOptions();
	}
	

}
