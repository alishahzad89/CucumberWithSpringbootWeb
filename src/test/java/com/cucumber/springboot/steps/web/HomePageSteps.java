package com.cucumber.springboot.steps.web;

import com.cucumber.springboot.context.AppContext;
import com.cucumber.springboot.pages.HomePages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePageSteps extends WebTest {


    @Autowired
    HomePages homePages;

    @Given("^Navigate to home page$")
    public void navigateToHome() {
        PageFactory.initElements(driver, homePages);
        driver.navigate().to(AppContext.hostUrl);
    }

    @Then("^Validate home page navigation$")
    public void validateHomeNavigation() {
        assertThat(AppContext.driver.getCurrentUrl()).as("Validate home url").isEqualTo(AppContext.hostUrl);
    }

    @Then("^Validate home page menu tabs$")
    public void validateHomeTabs() {
        List<String> expectedTab = Arrays.asList("Explore", "Market", "How It Works", "Resources");
        List<String> actualTab = homePages.lstTab.stream().map(x -> x.getText()).collect(Collectors.toList());
        assertThat(actualTab).as("Validate home menu tab").isEqualTo(expectedTab);
    }

    @Then("^Validate home page social links$")
    public void validateSocialLinks() {
        List<String> expectedSocials = Arrays.asList("https://t.me/junglenft",
                "https://twitter.com/Junglenftmarket",
                "https://discord.gg/tQzEMNhMfV",
                "https://www.instagram.com/junglenftmarket/",
                "https://www.facebook.com/junglenft/",
                "https://www.linkedin.com/company/junglenft");
        List<String> actualSocials = homePages.lstSocial.stream().map(x -> x.getAttribute("href")).collect(Collectors.toList());
        assertThat(actualSocials).as("Validate home social links").isEqualTo(expectedSocials);
    }

    @Then("^Validate home page nft categories$")
    public void validateNFTCategories() {
        List<String> expectedCategories = Arrays.asList("Art",
                "Music",
                "Domain Names",
                "Virtual Worlds",
                "Trading Cards",
                "Collectibles",
                "Sports",
                "Utility",
                "All NFTs");
        List<String> actualCategories = homePages.nftCategories.stream().map(x -> x.getText()).collect(Collectors.toList());
        System.out.println(actualCategories);
        assertThat(actualCategories).as("Validate home nft categories").isEqualTo(expectedCategories);
    }

    @Given("^Click on (.*) tab of home page$")
    public void navigateToTab(String tabName) {
        String tab = homePages.btnTabName.replace("{TABNAME}", tabName);
        driver.findElement(By.xpath(tab)).click();
    }

    @Given("^Validate explore tab content$")
    public void validateExploreTab() {
        assertThat(homePages.lblFAQ.getText()).as("Validate explore tab").isEqualTo("Frequently asked questions");
    }

    @Given("^Validate market tab content$")
    public void validateMarketTab() {
        assertThat(homePages.lblMarket.getText()).as("Validate market tab").isEqualTo("Browse by category");
    }

    @Given("^Validate how it works tab content$")
    public void validateHIWTab() {
        assertThat(homePages.lblHowWorks.getText()).as("Validate how it works tab content").isEqualTo("How it works");
    }

    @Given("^Validate resources tab content$")
    public void validateResourcesTab() {
        assertThat(homePages.lblResources.getText()).as("Validate resources tab content").isEqualTo("Frequently Asked Questions");
        assertThat(driver.getCurrentUrl()).as("Validate resource url").isEqualTo("https://jungle.co/faq/");
    }

    @Given("^Input (.*) email id for signup$")
    public void inputEmail(String email) {

        if (email.equalsIgnoreCase("valid")) {
            homePages.txtInputEmail.sendKeys("shahzadali@mailinator.com");
        } else {
            homePages.txtInputEmail.sendKeys(email);
        }
    }

    @Given("^Click in signup button$")
    public void clickOnSignUp() {
        jsClick(homePages.btnSignUp);
    }

    @Given("^Validate signup functionality$")
    public void validateSignup() {
        assertThat(homePages.lblSignUpSuccess.getText()).as("Validate signup success").isEqualTo("Thank you, You are in!");
    }

    @Given("^Validate signup functionality for negative case$")
    public void validateSignupNegative() {
        assertThat(elementPresent("//form[@id='subscribeForm']/div[text()='Thank you, You are in!']")).as("Validate signup success msg not shown").isFalse();
    }
}
