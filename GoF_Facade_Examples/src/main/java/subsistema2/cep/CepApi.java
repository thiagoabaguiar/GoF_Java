package subsistema2.cep;

/**
 *
 * @author thiagoabaguiar
 */

public class CepApi {

    private static CepApi instance = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }

}
