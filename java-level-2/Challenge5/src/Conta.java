public interface Conta{
    void consultarSaldo();
    void consultarSaldo(TipoConta tipoConta);

    void depositar(double valor);
    void depositar(double valor, TipoConta tipoConta);
}
