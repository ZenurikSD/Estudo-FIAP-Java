package org.zenu;                                   //Pasta

public class Testes{                                //Arquivo
    public static void main(String[] args) {        //Execução principal

    //1. Instância vazia. É uma conta genérica ou corrente?
        SupConta corrente = new SubCCorrente();

        //Vamos descobrir Se é uma instância da super ou subclasse
        if (corrente instanceof SupConta){
            System.out.println("\nvar 'corrente' faz referência à objeto do tipo Conta");
        } else {
            System.out.println("\nvar 'corrente' NÃO É do tipo Conta");
        }

        
    //2. Implemente uma conta corrente e utilize o método de retirar específico à ela
        //Instância da subclasse com var do mesmo tipo
        SubCCorrente cc = new SubCCorrente();
        
        //Definição da conta (2 métodos da superclasse e 2 da sub)
        cc.setAgencia((byte) 101);
        cc.setNumero(3521);
        cc.setTipo("Básica");
        cc.setChequeEsp(1000);

        //1200 - (300+10) = 890 saldo final
        cc.depositar(200);
        cc.retirar(300);  

        System.out.println("\nSaldo conta corrente: R$ "+cc.getSaldoDisponivel());
    

    // 3. Exercício Animais
        //Instância da classe animal
        Animal animal = new Animal();
        animal.setAlimenta("Todo animal come algo");
        animal.setLocomove("Todo animal se locomove");

        //Objeto cachorro controlado por var. do mesmo tipo
        Cachorro dog = new Cachorro();
        dog.setAlimenta("Cachorro come ração");
        dog.setLocomove("Cachorro usa 4 patas");
        dog.setLatido("Cachorro faz Au Au");            // kkkkk

        //Variável animal recebe um objeto cachorro
        Animal poodle = new Cachorro();
        poodle.setAlimenta("Poodle come ração");
        poodle.setLocomove("Poodle usa 4 patas");
        // Poodle não tem acesso ao latido

        // Mas se ele for uma instância do objeto cachorro, é possível
        // fazer Downcast para que ele tenha acesso.
        if(poodle instanceof Cachorro){
            Cachorro nvPoodle = (Cachorro) poodle;
            nvPoodle.setLatido("Poodle faz Au Au");
        }
        
        
        

    }
    
}
