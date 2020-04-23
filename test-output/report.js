$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ajeet/eclipse-workspace/Freeui/src/main/java/Feature/createAccount.feature");
formatter.feature({
  "line": 1,
  "name": "FreeUI create account",
  "description": "",
  "id": "freeui-create-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Create account on Free ui scenario",
  "description": "",
  "id": "freeui-create-account;create-account-on-free-ui-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User launch url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user click to login link",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "verify user is on createaccount page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user create account",
  "keyword": "Then "
});
formatter.match({
  "location": "Createaccountstepdefinition.user_launch_url()"
});
formatter.result({
  "duration": 8908924800,
  "status": "passed"
});
formatter.match({
  "location": "Createaccountstepdefinition.user_click_to_login()"
});
formatter.result({
  "duration": 6621451100,
  "status": "passed"
});
formatter.match({
  "location": "Createaccountstepdefinition.verify_user_is_on_createaccount_page()"
});
formatter.result({
  "duration": 29598600,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c...ing from HostMonster[111]\u003e but was:\u003c...ing from HostMonster[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat StepDefinitions.Createaccountstepdefinition.verify_user_is_on_createaccount_page(Createaccountstepdefinition.java:44)\r\n\tat ✽.Then verify user is on createaccount page(C:/Users/ajeet/eclipse-workspace/Freeui/src/main/java/Feature/createAccount.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Createaccountstepdefinition.create_account()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 914221600,
  "status": "passed"
});
});