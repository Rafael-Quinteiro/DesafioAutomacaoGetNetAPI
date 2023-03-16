package desafiotecnicoapi.base;

import java.io.IOException;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

/*Classe base utilizada para todos os testes do projeto. Ao criar um novo teste, deve ser feito a herança dessa classe. */
public class BaseTest {

    /**
     * Método responsável por iniciar todos os pontos necessários antes de executar qualquer teste do sistema. *
     * @throws IOException Indica uma exceção I/O.
     */
    @BeforeClass
    public static void setup() throws IOException {
        RestAssured.baseURI = "https://reqres.in/api/";
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
