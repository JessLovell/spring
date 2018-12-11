# Spring Web Application

## Packages, Products, etc.
[Spring Initializr](https://start.spring.io/) with dependencies web, thymeleaf, devTools, postgreSQL.       
[Deployed Heroku site](https://cryptic-journey-45375.herokuapp.com/)

## The Challenge
1. Create a `hello world` route at `/hello`, and ensure that you can visit that route in your browser and see data come back.
2. Create a route that turns words into UPPER CASE. For instance, I should be able to visit `/capitalize/hello` and get back the response `HELLO`, or I could visit `/capitalize/this is Kinda Capitalized` and get the response THIS IS KINDA CAPITALIZED.

## Solution
Code | Deployed
--- | ---
[HelloController](src/main/java/com/jessica/Spring/CapitalizeController.java) | [`/hello`](https://cryptic-journey-45375.herokuapp.com/hello)      
[CapitalizeController](src/main/java/com/jessica/Spring/CapitalizeController.java) | [`/capitalize/this word here`](https://cryptic-journey-45375.herokuapp.com/capitalize/this%20word%20here)      
[UpperCase](src/main/java/com/jessica/Spring/CapitalizeController.java) | [Tests](src/test/java/com/jessica/Spring/CapitalizeControllerTest.java)     
