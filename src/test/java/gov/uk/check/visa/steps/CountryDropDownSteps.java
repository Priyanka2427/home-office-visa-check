package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.SelectNationalityPage;
import io.cucumber.java.en.Then;

public class CountryDropDownSteps {

        @Then("I can see following {string} into dropdown")
        public void iCanSeeFollowingCountryIntoDropdown(String country)
        {
            new SelectNationalityPage().nationalityDropDownList(country);
            System.out.println(country);

        }
    }