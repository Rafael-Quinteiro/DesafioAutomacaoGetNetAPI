package desafiotecnicoapi.tests.cadastro.requests;

import static io.restassured.RestAssured.given;

import desafiotecnicoapi.tests.cadastro.payloads.CadastraUsuarioPayloads;
import io.restassured.response.Response;

/*Classe responsável por armazenar os dados de request. */
public class PostCadastraUsuarioRequest {

    /*Instancia de CadastraUsuarioPayloads. */
    CadastraUsuarioPayloads cadastraUsuarioPayloads = new CadastraUsuarioPayloads();

    /**
     * Método responsável por inserir cadastro com dados válidos.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioComDadosValidos() {
        return given()
                .header("Content-Type","application/json")
                .when()
                .body(cadastraUsuarioPayloads.jsonCadastraUsuarioComDadosValidos().toString())
                .post("api/users/");
    }

    /**
     * Método responsável por inserir cadastro com dados inteiros.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioComDadosInteiros() {
        return given()
                .header("Content-Type","application/json")
                .when()
                .body(cadastraUsuarioPayloads.jsonCadastraUsuarioComDadosInteiros().toString())
                .post("api/users/");
    }

    /**
     * Método responsável por inserir cadastro com dados vazios.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioComDadosVazios() {
        return given()
                .header("Content-Type","application/json")
                .when()
                .body(cadastraUsuarioPayloads.jsonCadastraUsuarioComDadosVazios().toString())
                .post("api/users/");
    }

    /**
     * Método responsável por inserir cadastro com dados de nome.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioSomenteComDadosDeNome() {
        return given()
                .header("Content-Type","application/json")
                .when()
                .body(cadastraUsuarioPayloads.jsonCadastraUsuarioSomenteComDadosDeNome().toString())
                .post("api/users/");
    }

    /**
     * Método responsável por inserir cadastro com dados de job.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioSomenteComDadosDeJob() {
        return given()
                .header("Content-Type","application/json")
                .when()
                .body(cadastraUsuarioPayloads.jsonCadastraUsuarioSomenteComDadosDeJob().toString())
                .post("api/users/");
    }

    /**
     * Método responsável por inserir cadastro com dados sem informar payload.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioSemInformarPayload() {
        return given()
                .header("Content-Type","application/json")
                .when()
                .body(cadastraUsuarioPayloads.jsonCadastraUsuarioSemInformarPayload().toString())
                .post("api/users/");
    }

    /**
     * Método responsável por inserir cadastro com dados para simular StatusCode 415.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioComDadosViaParametroEValidaStatusCode415() {
        return given()
                .params("name", "Rafael De Oliveira Quinteiro")
                .params("job", "Analista de Testes")
                .when()
                .post("api/users/");
    }

    /**
     * Método responsável por inserir cadastro com dados para simular StatusCode 400.
     * @return : Retorna dados da estrutura do request.
     */
    public Response insereCadastroUsuarioComDadosViaParametroEValidaStatusCode400() {
        return given()
                .header("Content-Type","application/json")
                .params("name", "Rafael De Oliveira Quinteiro")
                .params("job", "Analista de Testes")
                .when()
                .post("api/users/");
    }
}
