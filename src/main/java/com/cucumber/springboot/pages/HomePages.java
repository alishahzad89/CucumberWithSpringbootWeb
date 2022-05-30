package com.cucumber.springboot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HomePages {

    @FindBy(xpath = "//ul[@id='nav-menu']/li/a")
    public List<WebElement> lstTab;

    @FindBy(xpath = "//form[@id='subscribeForm']/button")
    public WebElement btnSignUp;

    @FindBy(css = "div.wallet-connection")
    public WebElement btnConnectWallet;

    @FindBy(css = "input.header-search__input")
    public WebElement txtSearch;

    @FindBy(xpath = "//div[@class='social-list']/a")
    public List<WebElement> lstSocial;

    @FindBy(xpath = "//div[@class='items__box']//h3")
    public List<WebElement> nftCategories;

    public String btnTabName = "//a[@class='nav__link' and text()='{TABNAME}']";

    @FindBy(xpath = "//div[@id='faq']//h2")
    public WebElement lblFAQ;

    @FindBy(xpath = "//div[@id='market']//h2")
    public WebElement lblMarket;

    @FindBy(xpath = "//div[@id='steps']//h2")
    public WebElement lblHowWorks;

    @FindBy(xpath = "//div[@class='faq-content__inner']/h1")
    public WebElement lblResources;

    @FindBy(xpath = "//form[@id='subscribeForm']/div[text()='Thank you, You are in!']")
    public WebElement lblSignUpSuccess;

    @FindBy(xpath = "//form[@id='subscribeForm']/input")
    public WebElement txtInputEmail;

}
