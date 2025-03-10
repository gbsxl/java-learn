public class BancoKonoha extends ContaBancaria{
    @Override
    public void consultarSaldo(TipoConta tipoConta) {
        if (tipoConta == TipoConta.POUPANCA) {
            conta = 0;
        } else {
            conta = 1;
        }
        super.consultarSaldo();
    }

    @Override
    public void depositar(double valor, TipoConta tipoConta) {
        if (tipoConta == TipoConta.POUPANCA) {
            conta = 0;
            taxaDeTributo = 1.0;
        } else {
            conta = 1;
            taxaDeTributo = 0.99;
        }
        super.depositar(valor);
    }
}