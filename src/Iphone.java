public class Iphone implements NavegadorDeInternet, AparelhoTelefonico, ReprodutorMusical {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando música: "+musica);
    }

    // AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para o Correio de voz!");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando "+url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }

}
