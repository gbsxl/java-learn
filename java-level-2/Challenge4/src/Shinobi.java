class Shinobi implements Ninja{
    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoHabilidade;

    public Shinobi(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(
                "\nNOME: "             + nome       +
                "\nIDADE: "            + idade      +
                "\nHABILIDADE: "       + habilidade +
                "\nTIPO DE HABILIDADE: " + tipoHabilidade
        );
    }

    @Override
    public void executarHabilidades() {
        System.out.println("\nSou " + nome + " e estou fazendo minha habilidade " + habilidade);
    }
}