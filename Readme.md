# Cross Platform Framework

* This framework can be used for API Automation as well for Web Automation
* Core of this framework is cucumber BDD and spring boot
* Supported browsers (chrome,edge,firefox)
* Parallel execution is supported
* Easy to integrate with jenkins for schedule execution and pipeline deployment
* GUI report link on cli at the end of execution
* Web Automation will load browser setup at run time

### System Requirements
* JDK 8
* Maven

##### Prerequisites for running automation suites
* Import project as maven project to intellij/eclipse

### Usage

Runs the tests with below mvn cli commands

mvn clean test -Dcucumber.filter.tags=@Regression -Dweb.browser=chrome -P web

    1- -P can have these two possible values web/api
    2- -Dweb.browser can have these posible values chrome/edge/firefox

### To Run Web Automation test locally, run below shared command through CLI

#### To Run on Chrome browser
    mvn clean test -Dcucumber.filter.tags=@Regression

#### To Run on Edge browser
    mvn clean test -Dcucumber.filter.tags=@Regression-Dweb.browser=edge

#### To Run on Firefox browser
    mvn clean test -Dcucumber.filter.tags=@Regression-Dweb.browser=firefox

### Analyze result post execution

    Please look for below sample report on cli, double click on cucumber report to see gui
    View your Cucumber Report at:
    https://reports.cucumber.io/reports/e6341b0f-330d-4e1a-81d9-82166e063111


### Application known issues

* Once navigate to resources tab, other menu tab is not working
* Search functionality is not working
* Connect to wallet is not working
* Top Signup up button is not working
* NFT categories are empty
* Term of services button is not working
* Privacy button is not working