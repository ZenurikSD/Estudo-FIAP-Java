package org.zenu;

public class TestesContas {
    public static void main(String[] args) {
        
        SupConta conta1 = new SupConta();
        conta1.depositar(1000);
        conta1.retirar(100);

        SubCCorrente conta2 = new SubCCorrente();
        conta2.depositar(1000);
        conta2.retirar(100);

        /* O VSCode exibe errado...
         * O método retirar() realmente é da subclasse, e a saída do saldo
         *  mostra que a taxa foi cobrada.
         * Mas aqui quando eu passo o mouse ele mostra que é da SUPERCLASSE!!
         * MEU DEUS
         */
        SupConta conta3 = new SubCCorrente();
        conta3.depositar(1000);
        conta3.retirar(100);

        System.out.println("Conta1: "+conta1.getSaldo());
        System.out.println("Conta2: "+conta2.getSaldo());
        System.out.println("Conta3: "+conta3.getSaldo());

    }
}
