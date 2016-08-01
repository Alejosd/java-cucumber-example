$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/resources/features/ejemplo.feature");
formatter.feature({
  "line": 1,
  "name": "Welcome To The Jungle",
  "description": "",
  "id": "welcome-to-the-jungle",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Animales",
  "description": "",
  "id": "welcome-to-the-jungle;animales",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the following animals: cow, horse, sheep",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "cow, horse, sheep",
      "offset": 23
    }
  ],
  "location": "Steps.the_following_animals(String\u003e)"
});
formatter.result({
  "duration": 27952205738,
  "status": "passed"
});
});