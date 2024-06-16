public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música" + musica + "selecionada");
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando a música" + musica);
    }

    @Override
    public void pausarMusica(String musica) {
        System.out.println("Música" + musica + "Pausada") ;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo o site" + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página está atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para" + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo o seu Correio de Voz");
    }
    
}
