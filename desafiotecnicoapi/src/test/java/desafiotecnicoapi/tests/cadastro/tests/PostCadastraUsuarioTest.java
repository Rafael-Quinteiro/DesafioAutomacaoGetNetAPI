package desafiotecnicoapi.tests.cadastro.tests;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.CoreMatchers.is;

import java.io.File;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import desafiotecnicoapi.base.BaseTest;
import desafiotecnicoapi.suites.AllTests;
import desafiotecnicoapi.suites.TesteDeContrato;
import desafiotecnicoapi.suites.TesteDeFuncionalidade;
import desafiotecnicoapi.tests.cadastro.requests.PostCadastraUsuarioRequest;
import desafiotecnicoapi.tests.cadastro.utils.Utils;

/*Classe de testes de criação de usuário. */
public class PostCadastraUsuarioTest extends BaseTest {

    private String nameUsuario = "Rafael de Oliveira Quinteiro";
    private String jobUsuario = "Analista de Testes";
    private Integer nameUsuarioInteiro = 123456;
    private Integer jobUsuarioInteiro = 7891011;
    private String nameUsuarioVazio = "";
    private String jobUsuarioVazio = "";
    
    /*Instância de PostCadastraUsuarioRequest. */ 
    PostCadastraUsuarioRequest postCadastraUsuarioRequest = new PostCadastraUsuarioRequest();

    /*Método de teste de funcionalidade responsável por criar um usuário com dados válidos */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC001_deveCriarUsuarioComDadosValidos() {

        postCadastraUsuarioRequest.insereCadastroUsuarioComDadosValidos()
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body("name", is(nameUsuario))
                .body("job", is(jobUsuario));
    }

    /*Método de teste de funcionalidade responsável por criar um usuário com dados inteiros. */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC002_deveCriarUsuarioComDadosInteiros() {

        postCadastraUsuarioRequest.insereCadastroUsuarioComDadosInteiros()
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body("name", is(nameUsuarioInteiro))
                .body("job", is(jobUsuarioInteiro));
    }

    /*Método de teste de funcionalidade responsável por criar um usuário com dados vazios. */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC003_deveCriarUsuarioComDadosVazios() {

        postCadastraUsuarioRequest.insereCadastroUsuarioComDadosVazios()
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body("name", is(nameUsuarioVazio))
                .body("job", is(jobUsuarioVazio));
    }

    /*Método de teste de funcionalidade responsável por criar um usuário com dados de nome. */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC004_deveCriarUsuarioSomenteComDadosDeNome() {

        postCadastraUsuarioRequest.insereCadastroUsuarioSomenteComDadosDeNome()
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body("name", is(nameUsuario));
    }

    /*Método de teste de funcionalidade responsável por criar um usuário com dados de job. */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC005_deveCriarUsuarioSomenteComDadosDeJob() {

        postCadastraUsuarioRequest.insereCadastroUsuarioSomenteComDadosDeJob()
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body("job", is(jobUsuario));
    }

    /*Método de teste de funcionalidade responsável por criar um usuário sem informar dados de payload. */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC006_deveCriarUsuarioSemInformarPayload() {

        postCadastraUsuarioRequest.insereCadastroUsuarioSemInformarPayload()
                .then()
                .statusCode(HttpStatus.SC_CREATED);
    }

    /*Método de teste de funcionalidade responsável por criar por inserir cadastro com dados para simular StatusCode 415. */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC007_naodeveCriarUsuarioERetornarStatusCode415() {
        postCadastraUsuarioRequest.insereCadastroUsuarioComDadosViaParametroEValidaStatusCode415()
        .then()
        .statusCode(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE);
    }

    /*Método de teste de funcionalidade responsável por criar por inserir cadastro com dados para simular StatusCode 400. */
    @Test
    @Category({AllTests.class, TesteDeFuncionalidade.class})
    public void TC008_naodeveCriarUsuarioERetornarStatusCode400() {
        postCadastraUsuarioRequest.insereCadastroUsuarioComDadosViaParametroEValidaStatusCode400()
        .then()
        .statusCode(HttpStatus.SC_BAD_REQUEST);
    }

    /*Método de teste de contrato responsável por validar os dados de contrato. */
    @Test
    @Category({AllTests.class, TesteDeContrato.class})
    public void TC009_validaSchemaDeCadastroDeUsuario() {

        postCadastraUsuarioRequest.insereCadastroUsuarioComDadosValidos()
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body(matchesJsonSchema(new File(Utils.getSchemaBasePath("cadastro", "CadastroDeUsuario"))));
    }
}
