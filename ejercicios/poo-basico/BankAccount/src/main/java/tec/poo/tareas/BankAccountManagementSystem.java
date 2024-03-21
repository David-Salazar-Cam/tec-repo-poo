package tec.poo.tareas;

class BankAccountManagementSystem{
public static void main(String[] args) {
    System.out.print("Creacion de los objetos: ");
    ImmutableBankAccount immutable = new ImmutableBankAccount("C111111111", 10000.2);
    MutableBankAccount mutable = new MutableBankAccount("C111111111",10000.2);
    System.out.println("\nCuenta Inmutable: \nNumero de cuenta:"+immutable.getAccountNumber()+"\nDinero: "+immutable.getBalance());
    System.out.println("\nCuenta Mutable: \nNumero de cuenta:"+mutable.getAccountNumber()+"\nDinero: "+mutable.getBalance());
    mutable.deposit(10000);
    System.out.println("\nDepositar 10000 en la cuenta Mutable: \nDinero: "+mutable.getBalance());
    mutable.withdraw(10000.2);
    System.out.println("\nSacar 10000.2 de la Mutable: \nDinero: "+mutable.getBalance());
    immutable=immutable.deposit(10000, "C111111111");
    System.out.println("\nDepositar 10000 en la cuenta Inutable: \nDinero: "+immutable.getBalance());
    immutable=immutable.withdraw(10000.2, "C111111111");
    System.out.println("\nSacar 10000.2 de la cuenta Inmutable: \nDinero: "+immutable.getBalance());
}
}

