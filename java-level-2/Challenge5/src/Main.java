public class Main {
    public static void main(String[] args) {
        ContaNinja sasuke = new ContaNinja("Sasuke", 19, "Aldeia da Folha");
        ContaNinja naruto = new ContaNinja("Naruto", 18, "Aldeia da Folha");
        ContaNinja sakura = new ContaNinja("Sakura", 18, "Aldeia da Folha");

        //Naruto deve 240 reais pra sakura e vai pedir emprestado para Sasuke que acabou de ganhar 7000 na NinjaBET
        System.out.println("Sasuke aposta na NinjaBET no jogo dos Chuunin's da Folha contra os Chuuni's da Areia" +
                "\nobviamente contra... e acertou o resultado exato!" +
                "\nele opta por Poupança já que rende juros e não tem taxas de transferência\n" +
                "\nLOG BANKING: "); sasuke.depositar(7000, TipoConta.POUPANCA);

        System.out.println("\nSakura fica feliz com a notiícia mas lamenta por não ter tido a mesma sorte já que Naruto pediu 240 emprestado a ela prometendo voltar com o dobro, mas ele apostou na vila da Folha... e decide verificar seu saldo atual"); sakura.saldoBancario[1] = 1000;

        System.out.println("\nLOG BANKING: "); sakura.consultarSaldo(TipoConta.CORRENTE);

        System.out.println("\nNaruto se sentindo mal por ter perdido o dinheiro tem a brilhante ideia de pedir a Sasuke um dinheiro emprestado já que ele tava rachando agora e Sasuke aceita para receber mensalmente com Juros");

        System.out.println("\nLOG BANKING: "); sasuke.tranferencia(TipoConta.POUPANCA, naruto, 240);

        System.out.println("\nLOG BANKING: "); naruto.consultarSaldo(TipoConta.POUPANCA);

        System.out.println("\nNaruto então por fim, chega a Sakura e entrega o dinheiro que pediu emprestado para apostar, mas ele se lembra que recebeu na poupança e precisa sacar pra entregar fisicamente para Sakura");

        System.out.println("\nLOG BANKING: "); naruto.saque(TipoConta.POUPANCA, 240);

        System.out.println("\nE então finalmente Sakura recebe o dinheiro em mãos e pode depositar no Banco de Konoha");

        System.out.println("\nLOG BANKING: "); sakura.depositar(240, TipoConta.CORRENTE);

        System.out.println("\nE a lição que fica é, não pegue dinheiro emprestado sem saber se ele realmente voltará...");
    }
}
