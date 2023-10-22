package dio.digitalinnovation.gof.subsistema2.cep;

import dio.digitalinnovation.gof.singleton.SingletonEager;

public class CepAPI {
    private static CepAPI instancia = new CepAPI();

    private CepAPI(){
        super();
    }

    public static CepAPI getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Sao Paulo";
    }
    public String recuperarEstado(String cep){
        return "Sao Paulo";
    }
}
