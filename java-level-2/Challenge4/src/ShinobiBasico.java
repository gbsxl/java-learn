class ShinobiBasico extends Shinobi {
    public ShinobiBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        super(nome, idade, habilidade, tipoHabilidade);
    }
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("NÍVEL DE HABILIDADE: BÁSICO");
    }
}
