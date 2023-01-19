public class TestandoValores {
    public static void main(String[] args) {

        Conta conta1 = new Conta(1212, 56784);
        Conta conta2 = new Conta(3434, 43245);
        Conta conta3 = new Conta(5656, 15655);
        Conta conta4 = new Conta(7878, 76456);

        System.out.println(Conta.getTotalContas());
    }
}
