class ShinobiAvancado extends Shinobi {
    String especialidade;

    public ShinobiAvancado(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade, String especialidade) {
        super(nome, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("NÍVEL DE HABILIDADE: AVANÇADO");
        System.out.println("ESPECIALIDADE: " + especialidade.toUpperCase());
    }
}