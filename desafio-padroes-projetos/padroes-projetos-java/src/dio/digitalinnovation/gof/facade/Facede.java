package dio.digitalinnovation.gof.facade;

import dio.digitalinnovation.gof.subsistema1.crm.CrmService;
import dio.digitalinnovation.gof.subsistema2.cep.CepAPI;

public class Facede {
    public  void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
