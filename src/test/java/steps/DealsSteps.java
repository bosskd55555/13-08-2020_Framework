package steps;

import net.thucydides.core.annotations.Step;
import pageObjects.DealsPageObject;
import utilities.DefaultPageObject;

public class DealsSteps {
	
	DealsPageObject Dealspageobject;
	
	
	
	@Step
	public void Enter_the_deals_details() throws Exception
	{
		
		
		Dealspageobject.Enter_the_deals_details();
		
		
	}
	
	@Step
	public void Enter_the_deals(String title, String amount, String probability, String commision) throws Exception
	{
		Dealspageobject.Enter_the_deals_datatable(title,amount,probability,commision);
		
	}

	
	

}
