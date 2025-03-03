import java.util.Scanner;
public class Challenge2 {
    public static void main(String[] args) throws InterruptedException {
        boolean programafuncionando = true;
        Scanner escolha = new Scanner(System.in);
        String[] nomeNinjas = new String[10];
        int quantidadeNinjas = 0;
        while(programafuncionando) {
            System.out.println(
                    "\n-----CADASTRO-DE-NINJAS-----" +
                    "\n------------MENU-------------\n" +
                    "1 - CADASTRAR NINJA\n" +
                    "2 - MOSTRAR NINJAS\n" +
                    "3 - ELIMINAR NINJA(execute mostrar ninjas antes...)\n" +
                    "4 - SAIR");
            int opcao = escolha.nextInt();
            escolha.nextLine();
            switch (opcao){
                case 1:
                    if (quantidadeNinjas<nomeNinjas.length){
                    System.out.println("Digite o nome do ninja: ");
                    String nomeNinja = escolha.nextLine();
                    nomeNinjas[quantidadeNinjas] = nomeNinja;
                    quantidadeNinjas++;
                    }
                    else {
                        System.out.println("Número de cadastros execedido, não é possível inserir nenhum ninja!");
                    }
                    break;

                case 2:
                    for (int i = 0; i < nomeNinjas.length; i++) {
                        if (nomeNinjas[i] != null) {
                            System.out.println("NINJA: " + nomeNinjas[i] +
                                    " || INDICE: " + i);
                        }
                    }
                    Thread.sleep(3000);
                    break;

                case 3:
                    System.out.println("Insira o índice do Ninja");
                    int indice = escolha.nextInt();
                    escolha.nextLine();
                    nomeNinjas[indice] = null;
                    break;
                case 4:
                    programafuncionando = false;
                    break;
                default:
                    break;
            }
        }
    }
}