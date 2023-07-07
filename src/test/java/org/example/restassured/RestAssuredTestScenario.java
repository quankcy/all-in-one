package org.example.restassured;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class RestAssuredTestScenario {

    /*
    TUTORIAL
    https://www.baeldung.com/rest-assured-tutorial

    DOCS
    https://github.com/rest-assured/rest-assured/wiki/Usage
    https://hamcrest.org/JavaHamcrest/tutorial

    USED API
    https://pokeapi.co/
     */

    @Test
    public void GET_restAssuredTestCase_withAssertion(){
        RestAssured.given()
                //.header()
                //.headers()
                //.body()
                .when()
                .get("https://pokeapi.co/api/v2/pokemon/ditto") // GET
                .then()
                .assertThat()
                .statusCode(200)
                .body("abilities", hasSize(2) )
                .body("moves[0].move.name", equalTo("transform"));
    }

    @Test
    public void GET_restAssuredTestCase_withBodyPrettyPrint(){
        RestAssured.given()
                //.header()
                //.headers()
                //.body()
                .when()
                .get("https://pokeapi.co/api/v2/pokemon/ditto") // GET
                .body()
                .prettyPrint();
    }

    @Test
    public void POST_restAssuredTestCase(){
        RestAssured.given()
                //.header()
                //.headers()
                //.body()
                .when()
                .post("https://pokeapi.co/api/v2/pokemon/ditto") // POST
                .then();
    }

}
