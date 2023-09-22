package myClass;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/**
 *
 * @author thiagoabguiar
 */

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
    
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
        
    }
    
}
