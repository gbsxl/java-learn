import java.text.DecimalFormat;

abstract class ContaBancaria implements Conta{
    double[] saldoBancario = new double[2];
    double taxaDeTributo;
    int conta; // 0 = Poupança e 1 = Corrente
    DecimalFormat arruma = new DecimalFormat("000.00");

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + arruma.format(saldoBancario[conta])+ "");
    }

    @Override
    public void depositar(double valor) {
        valor = valor * taxaDeTributo;
        saldoBancario[conta] = saldoBancario[conta] + valor;
    }
}