$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/TecfiosPage.feature");
formatter.feature({
  "name": "Verify Techfios Page Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@OtherPage"
    }
  ]
});
formatter.scenario({
  "name": "Sky Blue BackGround",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OtherPage"
    },
    {
      "name": "@Scenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TechFiosStepDefintion.Set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TechFiosStepDefintion.I_click_on_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TechFiosStepDefintion.The_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "White Background Change",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@OtherPage"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TechFiosStepDefintion.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the button;",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TechFiosStepDefintion.i_click_on_the_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TechFiosStepDefintion.the_background_color_will_change_to_white()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});