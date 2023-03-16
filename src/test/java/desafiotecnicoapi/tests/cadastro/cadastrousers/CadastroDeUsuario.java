package desafiotecnicoapi.tests.cadastro.cadastrousers;

/*Classe responsável por armazenar dados cadastrais de todos os testes. */
public class CadastroDeUsuario {
    
    private String nameUsuario = "Rafael de Oliveira Quinteiro";
    private String jobUsuario = "Analista de Testes";
    private Integer nameUsuarioInteiro = 123456;
    private Integer jobUsuarioInteiro = 7891011;
    private String nameUsuarioVazio = "";
    private String jobUsuarioVazio = "";

    /*Método construtor da classe de CadastroDeUsuario. */
    public CadastroDeUsuario() {
    }

    /**
     * @return : Retorna o nome do usuário.
     */
    public String getNameUsuario() {
        return this.nameUsuario;
    }

    /**
     * @param nameUser : Retorna o nome do usuário.
     */
    public void setNameUsuario(String nameUser) {
        this.nameUsuario = nameUser;
    }

    /**
     * @return : Retorna o job do usuário.
     */
    public String getJobUsuario() {
        return jobUsuario;
    }

    /**
     * @param jobUsuario : Retorna o job do usuário.
     */
    public void setJobUsuario(String jobUsuario) {
        this.jobUsuario = jobUsuario;
    }

    /**
     * @return : Retorna o nome do usuário como inteiro.
     */
    public Integer getNameUsuarioInteiro() {
        return this.nameUsuarioInteiro;
    }

    /**
     * @param nameUserInteiro : Retorna o nome do usuário como inteiro.
     */
    public void setNameUsuarioInteiro(Integer nameUserInteiro) {
        this.nameUsuarioInteiro = nameUserInteiro;
    }

    /**
     * @return : Retorna o job do usuário como inteiro.
     */
    public Integer getJobUsuarioInteiro() {
        return jobUsuarioInteiro;
    }

    /**
     * @param jobUsuarioInteiro : Retorna o job do usuário como inteiro.
     */
    public void setJobUsuarioInteiro(Integer jobUsuarioInteiro) {
        this.jobUsuarioInteiro = jobUsuarioInteiro;
    }

    /**
     * @return : Retorna o nome do usuário como vazio.
     */
    public String getNameUsuarioVazio() {
        return this.nameUsuarioVazio;
    }

    /**
     * @param nameUserVazio : Retorna o nome do usuário como vazio.
     */
    public void setNameUsuarioVazio(String nameUserVazio) {
        this.nameUsuarioVazio = nameUserVazio;
    }

    /**
     * @return : Retorna o job do usuário como vazio.
     */
    public String getJobUsuarioVazio() {
        return this.jobUsuarioVazio;
    }

    /**
     * @param jobUsuarioVazio : Retorna o job do usuário como vazio.
     */
    public void setJobUsuarioVazio(String jobUsuarioVazio) {
        this.jobUsuarioVazio = jobUsuarioVazio;
    }
}
