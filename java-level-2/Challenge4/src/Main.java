public class Main {
    public static void main(String[] args) {
        Ninja naruto = new ShinobiBasico(
                "Naruto", 12, "Clone das sombras",
                TipoHabilidade.NINJUTSU);

        Ninja jiraya = new ShinobiAvancado(
                "Jiraya", 53, "Modo Sábio",
                TipoHabilidade.NINJUTSU, "Senjutsu");
        naruto.mostrarInformacoes();
        naruto.executarHabilidades();
        jiraya.mostrarInformacoes();
        jiraya.executarHabilidades();
    }
}
