package desafiotecnicoapi.tests.cadastro.payloads;

import org.json.JSONObject;

import desafiotecnicoapi.tests.cadastro.cadastrousers.CadastroDeUsuario;

/*Classe responsável por armazenar os dados de payload. */
public class CadastraUsuarioPayloads {

    /*Instancia de CadastroDeUsuario. */
    CadastroDeUsuario cadastroDeUsuario = new CadastroDeUsuario();

    /**
     * Método responsável por cadastrar dados válidos no payload.
     * @return : Retorna o payload com dados de cadastro do usuário.
     */
    public JSONObject jsonCadastraUsuarioComDadosValidos() {
        JSONObject payloadCadastraUsuario = new JSONObject();
        
        payloadCadastraUsuario.put("name", cadastroDeUsuario.getNameUsuario());
        payloadCadastraUsuario.put("job", cadastroDeUsuario.getJobUsuario());

        return payloadCadastraUsuario;
    }

    /**
     * Método responsável por cadastrar dados inteiros no payload.
     * @return : Retorna o payload com dados de cadastro do usuário.
     */
    public JSONObject jsonCadastraUsuarioComDadosInteiros() {
        JSONObject payloadCadastraUsuario = new JSONObject();
        
        payloadCadastraUsuario.put("name", cadastroDeUsuario.getNameUsuarioInteiro());
        payloadCadastraUsuario.put("job", cadastroDeUsuario.getJobUsuarioInteiro());

        return payloadCadastraUsuario;
    }

    /**
     * Método responsável por cadastrar dados vazios no payload.
     * @return : Retorna o payload com dados de cadastro do usuário.
     */
    public JSONObject jsonCadastraUsuarioComDadosVazios() {
        JSONObject payloadCadastraUsuario = new JSONObject();
        
        payloadCadastraUsuario.put("name", cadastroDeUsuario.getNameUsuarioVazio());
        payloadCadastraUsuario.put("job", cadastroDeUsuario.getJobUsuarioVazio());

        return payloadCadastraUsuario;
    }

    /**
     * Método responsável por cadastrar dados de nome no payload.
     * @return : Retorna o payload com dados de cadastro do usuário.
     */
    public JSONObject jsonCadastraUsuarioSomenteComDadosDeNome() {
        JSONObject payloadCadastraUsuario = new JSONObject();
        
        payloadCadastraUsuario.put("name", cadastroDeUsuario.getNameUsuario());

        return payloadCadastraUsuario;
    }

    /**
     * Método responsável por cadastrar dados de job no payload.
     * @return : Retorna o payload com dados de cadastro do usuário.
     */
    public JSONObject jsonCadastraUsuarioSomenteComDadosDeJob() {
        JSONObject payloadCadastraUsuario = new JSONObject();
        
        payloadCadastraUsuario.put("job", cadastroDeUsuario.getJobUsuario());

        return payloadCadastraUsuario;
    }

    /**
     * Método responsável por não informar dados no payload.
     * @return : Retorna o payload com dados de cadastro do usuário.
     */
    public JSONObject jsonCadastraUsuarioSemInformarPayload() {
        JSONObject payloadCadastraUsuario = new JSONObject();

        return payloadCadastraUsuario;
    }
}