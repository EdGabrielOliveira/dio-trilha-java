public class Operadores {

public static void main(String[] args) {


    String nomeUm= "Gabriel";
    String nomeDois = "Lary";

    System.out.println(nomeUm.equals(nomeDois));

//---------------------------------------------------------------------------
    int numero1 = 1;
    int numero2 = 2;

    boolean simNao = numero1 == numero2;

    if(numero1 == numero2){
        System.out.println("A nossa condição é verdadeira?    "+ simNao);
    }
    System.out.println("numeroUm é igual a numeroDois?        "+ simNao);

    simNao = numero1 != numero2;

    System.out.println("numeroUm é diferente de numeroDois?   "+ simNao);

    simNao = numero1 > numero2;

    System.out.println("numeroUm é maior que numeroDois?      "+ simNao);

// --------------------------------------------------------------------------
        boolean cond1 = true;
        boolean cond2 = false;

        if(cond1 && cond2){

            System.out.println("as duas condiçoes são verdadeiras");
        }
        if(cond1 || cond2){

            System.out.println("uma das condiçoes são verdadeiras");
        }
    }   
}