package one.digitalinnovation.basecamp.OperadoresAritmeticos;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /*
        Tipos de Operadores Arimteticos

        Primeiro usa a expressão e depois realiza a operação
       Pós fixado = exp++: Soma uma unidade
       Pós fixado = exp--: Subtrai uma unidade

        Primeiro realiza a operação e depois usa a expressão
       Pré fixado = ++exp:
       Pré fixado = --exp

       Aritiméticos:
       + (soma)
       - (subtração)
       * (multiplicação)
       / (divisão)

       Atribuição:
       = (atribuição simples)
       += (atribuição com soma)
       -= (atribuição com subtração)
       *= (atribuição com multiplicação)
       /= (atribuição com divisão)
       %= (atribuição com divisão)

       Exemplos:

       int i = ++k significa i = k+1; (é um atalho para escrever menos)
       int j = k-- significa j = k e depois k = k-1; (o pós fixado é melhor que o pré porque ele primeiro usa a
       expressão e depois altera ela)

       float f = 1.5f + 4.5f;
       long l = 10398L * 5L;
       double d = 45d / 4d;
       int k = 15%4;

       double d = f;
       i += 5 significa i = i + 5;
       j -= 3 significa j = j - 3;
       d /= 2.7d significa d = d / 2.7d;
       l *= 3 significa l = l * 3;
       k %= 2 significa k = k % 2;

        REGRAS:

        Primeiro o java executa tudo que é:

        Pós fixado (primeiro soma depois subtração)

        depois:

        Prefixado (primeiro soma depois subtração)
        Multiplicativo (primeiro * depois / e depois %)
        Aditivo (primeiro soma depois subtração)
        Atribuição (primeiro simples, depois +, depois -, depois *, depois / e por último %)



         */

        //Início do Exercício 3

        int k = 15%4;
        int i = ++k;
        int j = k--;
        float f = 1.5f + 4.5f;
        long l = 10398L * 5L;
        double d = 45d / 4d;


        i += 5;
        j -= 3;
        d /= 2.7d;
        l *= 3;
        k %= 2;

        System.out.println("MOD: " + k);
        System.out.println("Prefixado: " + i);
        System.out.println("Pós-fixado: " + j);
        System.out.println("Float: " + f);
        System.out.println("Long: " + f);
        System.out.println("Double: " + f);

    }

}
