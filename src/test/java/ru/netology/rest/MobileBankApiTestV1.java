package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        given()
                .baseUri("http://localhost:9999/api/v1")
                // Выполняемые действия
                .when()
                // get метод запроса GET
                // URI относительно baseUri
                .get("/demo/accounts")
                // Проверки
                .then()
                .statusCode(200);

    }
}