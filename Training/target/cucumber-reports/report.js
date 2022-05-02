$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Assignment.feature");
formatter.feature({
  "name": "ToDo List",
  "description": "  Below scenarios will validate as per the assignment",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Generate TestData",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Generate random email",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.generate_random_email()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account Creation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Create Account",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.create_Account()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill user data and Register account",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.fill_user_data_and_Register_account()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.step({
  "name": "Login to the account \"\u003cuser\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Validate Home Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "user"
      ]
    },
    {
      "cells": [
        "dummy"
      ]
    },
    {
      "cells": [
        "dummy"
      ]
    },
    {
      "cells": [
        "Validuser"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login to the account \"dummy\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Login_to_the_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Validate_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login to the account \"dummy\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Login_to_the_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Validate_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Validation",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login to the account \"Validuser\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Login_to_the_account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Validate_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login to the account",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.loginToAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to women section",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.navigate_to_women_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adding all the items to cart from the list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.adding_all_the_items_to_cart_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to dresses section",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.navigate_to_dresses_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adding all the items to cart from the list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.adding_all_the_items_to_cart_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Tshirts section",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.navigate_to_Tshirts_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Adding all the items to cart from the list",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.adding_all_the_items_to_cart_from_the_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigating to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.navigate_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cart total item count",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.cartCount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Duplicate amount or product",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Duplicate_amount_or_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete third and sixth item",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.Delete_third_and_sixth_item()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Mobile View",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch browser in Mobile view",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.mobileView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Launch Demo application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.launch_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login to the account",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.AssignmentStepDefinition.loginToAccount()"
});
formatter.result({
  "status": "passed"
});
});