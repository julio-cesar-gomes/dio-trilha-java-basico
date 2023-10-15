package iphone;

import iphone.Apps.ReprodutorMusical;
import iphone.Apps.AparelhoTelefonico;
import iphone.Apps.NavegadorInternet;

    // Classe iPhone que implementa as interfaces
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

        //Métodos do Reprodutor Musical
        @Override
    public void tocar(String musica) {
        System.out.println("Tocando: " + musica);
    }
    @Override
    public void pausar(String pausarMusica) {
        System.out.println("Música " + pausarMusica + "pausada");
    }
    @Override
    public void selecionarMusica(String novaMusica) {
        System.out.println("Mudando para " + novaMusica);
    }

        //Métodos do Aparelho Telefonico
    @Override
    public void ligar(int numero) {
        System.out.println("Efetuando ligação para: " + numero);
    }
        @Override
    public void atender(String naoAtendeu) {
        System.out.println("Não atendeu");
    }

    @Override
    public void iniciarCorreioVoz(String correioVoz) {
        System.out.println(correioVoz);
    }
        //Métodos do Navegador Internet
    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exibindo a página 1, " + pagina);
    }
        @Override
    public void adicionarNovaAba(String novaAba) {
        System.out.println(novaAba);
    }
        @Override
    public void atualizarPagina(String pagina) {
        System.out.println(pagina + "Página 1 atualizada, agora é www.facebook.com.br");
    }
}