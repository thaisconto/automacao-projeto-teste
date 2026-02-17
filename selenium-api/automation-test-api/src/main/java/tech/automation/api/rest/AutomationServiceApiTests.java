package tech.automation.api.rest;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import tech.automation.api.entidades.request.UsuarioRequest;
import static io.restassured.RestAssured.given;

public class AutomationServiceApiTests {

    private static final String URL_BASE = "https://serverest.dev";

    public ValidatableResponse doCadastrarUsuario(UsuarioRequest contentBody) {
        return given()
                .contentType(ContentType.JSON)
                .body(contentBody)
                .when()
                .post(URL_BASE + "/usuarios")
                .then();
    }

    public ValidatableResponse doConsultarUsuarioPorId(String idUsuario) {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(URL_BASE + "/usuarios/" + idUsuario)
                .then();
    }

    public ValidatableResponse doCadastrarUsuarioSemEmail(UsuarioRequest usuario) {
    return given()
            .contentType(ContentType.JSON)
            .body(usuario)
            .when()
            .post("/usuarios")
            .then();
}
}