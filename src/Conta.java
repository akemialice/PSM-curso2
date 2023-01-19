public class Conta {

    private int agencia;
    private int numero;
    private static int totalContas;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta criada: " + this.numero);
        Conta.totalContas++;
    }

    public static int getTotalContas() {
        return Conta.totalContas;
    }
}