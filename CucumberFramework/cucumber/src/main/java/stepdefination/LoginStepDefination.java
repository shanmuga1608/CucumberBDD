package stepdefination;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	@Given("User is at the login page of the application")
	public void user_is_at_the_login_page_of_the_application() {
	  
	}

	@When("User login with the following username and password")
	public void user_login_with_the_following_username_and_password(DataTable table){
		List<List<String>> data=  table.raw();
		for(List<String> str : data){
			for(String str1 : str){
				System.out.println("Data : " + str1);
			}
		}
	}

	@When("User login with the following username password and Address")
	public void user_login_with_the_following_username_password_and_Address(DataTable dataTable) {
	   
	}

	@Then("User should be able to login with correct username and password")
	public void user_should_be_able_to_login_with_correct_username_and_password() {
	  
	}



}
