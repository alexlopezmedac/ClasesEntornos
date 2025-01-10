public class SavingsAccountMain {
    public static void main(String[] args) {

        SavingsAccount cuenta1 = new SavingsAccount(300);

        System.out.println(cuenta1.balance);

        cuenta1.retirarDinero(500);

        System.out.println(cuenta1.balance);

        cuenta1.ingresarDinero(800);

        System.out.println(cuenta1.balance);

    }
}
