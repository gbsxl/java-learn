public class ContaNinja extends BancoKonoha{
    String nome;
    int idade;
    String aldeia;

    public ContaNinja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    @Override
    public void depositar(double valor, TipoConta tipoConta) {
        super.depositar(valor, tipoConta);
        System.out.println(arruma.format(valor) + " adicionados conta de " + nome);
    }

    void printDetails(){
        System.out.println(
                "\nNOME: "   + nome   +
                "\nIDADE: "  + idade  +
                "\nALDEIA: " + aldeia +
                "\nSALDO CORRENTE: " + arruma.format(saldoBancario[1])+
                "\nSALDO POUPANÇA: " + arruma.format(saldoBancario[0])
        );
    }
    void tranferencia(TipoConta tipoDeConta,ContaNinja destino, double valor){
        if (tipoDeConta == TipoConta.POUPANCA && saldoBancario[0] >= valor){
            saldoBancario[0] -= valor;
            destino.saldoBancario[0] += valor;
        }
        else if (tipoDeConta == TipoConta.CORRENTE && saldoBancario[1] >= valor) {
            saldoBancario[1] -= valor;
            destino.saldoBancario[1] += valor;
        }
        else{
            System.out.println("Solicitação de transferência negada, saldo de origem insuficiente");
        }

        System.out.println("Valor de "+ valor + " transferido da conta de " + nome +
                " para a conta de " + destino.nome);
    }

    void saque(TipoConta tipoConta, double valor){
        if (tipoConta == TipoConta.POUPANCA){
            saldoBancario[0] -= valor;
        }
        else {
            saldoBancario[1] -= valor;
        }
        System.out.println("Sacado: " + valor + " da conta " + tipoConta.name() + " de " + nome);
    }
}
