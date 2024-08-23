public class Banco {
    private int conta;
    private float saldo;

    public Banco(int conta, float saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public void extratoCliente() {
        System.out.println("Conta = " + conta);
        System.out.println("Saldo = " + saldo);
    }
    //RODOLFOO
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
