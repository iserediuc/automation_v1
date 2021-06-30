package stepdefinitions;

import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CountryInfoSteps;

public class CountryInfoStepDefinitions {

    @Steps
    private CountryInfoSteps countryInfoSteps;

    @When("I retrieve information about (d//)")
    public void iRetrieveInformationAbout(String country) {
        countryInfoSteps.getInfoByCountry(country);
    }

}
