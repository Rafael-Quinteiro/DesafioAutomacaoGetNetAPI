package desafiotecnicoapi.tests.cadastro.utils;

/*Classe Utils para validar teste de contrato. */
public class Utils {

    /*Método responsável por validar os dados de testes de contrato. */
    public static String getSchemaBasePath(String pack, String nameSchema) {
        return System.getProperty("user.dir")
                + "/src/test/java/desafiotecnicoapi/tests/"
                + pack
                + "/schema/"
                + nameSchema
                +".json";
    }
}
