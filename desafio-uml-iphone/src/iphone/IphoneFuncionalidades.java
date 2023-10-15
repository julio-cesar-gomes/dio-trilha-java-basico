package iphone;

public class IphoneFuncionalidades {
    public static void main(String[] args) {
        Iphone iphoneMetodos = new Iphone();

        System.out.println("TESTANDO REPRODUTOR MUSICAL");

        //Testanto o Reprodutor Musical
        iphoneMetodos.tocar("Legião Urbana");
        iphoneMetodos.pausar("");
        iphoneMetodos.selecionarMusica("Cazuza");

        System.out.println("\nTESTANDO APARELHO TELEFONICO");

        //Testanto o Aparelho Telefonico
        iphoneMetodos.ligar(1236547890);
        iphoneMetodos.atender("");
        iphoneMetodos.iniciarCorreioVoz("Enviando para Caixa Postal");

        System.out.println("\nTESTANDO NAVEGAÇÃO NA INTERNET");

        //Testanto o Navegador Internet
        iphoneMetodos.exibirPagina("www.google.com.br");
        iphoneMetodos.adicionarNovaAba("Nova aba aberta, carregando www.youtube.com.br");
        iphoneMetodos.atualizarPagina("");
    }
}