# Spring Web Application
## Using the Application
### Running Locally
1. `git clone` this repo on your laptop. `cd` into the directory.
2. Create a local postgres database with the name `album_app`.
3. Open `application.properties` and
    * Uncomment `#spring.datasource.url=jdbc:postgresql://localhost:5432/album_app` by removing the leading `#`.
    * Then comment out `spring.datasource.url=${DATABASE_URL}` by adding a leading `#`.
    * **If running for the first time, uncomment `#spring.jpa.hibernate.ddl-auto=create` by removing the leading `#`. (This command will build the database for you). Comment it out after the DB has been created so you don't keep dropping the tables.**
4. In the command line use `gradle bootrun` to start the application. Open a browser window to `http://localhost:8080/` to see the application and to navigate to other pages.
5. To terminate the application type `CRTL + C` in the command line.

### Deployed Site
1. Go to the [deployed site](https://cryptic-journey-45375.herokuapp.com/) and play around.


## Packages, Products, etc.
[Spring Initializr](https://start.spring.io/) with dependencies web, thymeleaf, devTools, postgreSQL.

## The Challenge
### Day 1
1. Create a `hello world` route at `/hello`, and ensure that you can visit that route in your browser and see data come back.
2. Create a route that turns words into UPPER CASE. For instance, I should be able to visit `/capitalize/hello` and get back the response `HELLO`, or I could visit `/capitalize/this is Kinda Capitalized` and get the response THIS IS KINDA CAPITALIZED.

### Day 2
1. Create an Album model with a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
2. A user should be able to see information about all the albums on the site.
3. A user should be able to add albums to the site.
4. **Stretch Goal:** A user should be able to update information about albums on the site. A user should be able to delete albums on the site.

### Day 3
1. Create a Song model. A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears. Ensure that the relationship between Albums and Songs is appropriately set up.
2. A user should be able to see information about all the songs on the site, view a page with data about one particular album, add songs to an album, and see the songs that belong to an album when looking at that album.
3. Write integration tests for your hello world routes.
4. **Stretch Goals:** A user should be able to update information about songs on the site, delete songs on the site, delete albums on the site, and when they do, all associated songs should also be deleted.



## Solution
Code | Deployed
--- | ---
[HelloController](src/main/java/com/jessica/Spring/CapitalizeController.java) | [`/hello`](https://cryptic-journey-45375.herokuapp.com/hello)      
[CapitalizeController](src/main/java/com/jessica/Spring/CapitalizeController.java) | [`/capitalize/this word here`](https://cryptic-journey-45375.herokuapp.com/capitalize/this%20word%20here)      
[UpperCase](src/main/java/com/jessica/Spring/CapitalizeController.java) | [Tests](src/test/java/com/jessica/Spring/CapitalizeControllerTest.java)
[AlbumController](src/main/java/com/jessica/Spring/AlbumController.java) | [`/albums`](https://cryptic-journey-45375.herokuapp.com/albums)
[SongController](src/main/java/com/jessica/Spring/SongController.java) | [`/songs`](https://cryptic-journey-45375.herokuapp.com/songs)

