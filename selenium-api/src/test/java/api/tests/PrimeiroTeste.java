package api.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class PrimeiroTeste {

    
    @Test
    public void deveValidarListaDeUsuarios() {
        given()
            .baseUri("https://reqres.in/api")
        .when()
            .get("/users?page=2")
        .then()
            .statusCode(200)
            .body("page", is(2));
    }
}