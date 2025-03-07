public class Challenge3 {
    public static void main(String[] args) {
        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke";
        Sasuke.idade = 19;
        Sasuke.missao = "Matar Itachi";
        Sasuke.statusMissao = "Longe de ser concluída";
        Sasuke.habilidadeEspecial = "Sharingan";
        Sasuke.mostrarInformacoes();
    }
}
class Ninj{
    String name;
    int idade;
    String missao;
    String statusMissao;
    void mostrarInformacoes(){
        System.out.println(
                "\nNOME: " + name +
                        "\nIDADE: " + idade +
                        "\nMISSÃO: " + missao +
                        "\nSTATUS: " + statusMissao
        );
    }
}
class Uchiha extends Ninj{
    String habilidadeEspecial;
    @Override
    void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println(
                "HABILIDADE ESPECIAL: " + habilidadeEspecial
        );
    }
}
