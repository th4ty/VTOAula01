package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercício da Aula 1 de Variáveis, Tipos de dados e Operadores aritméticos.
 */

public class Main {
    public static void main(String[] args) {

        int i;
        //int 1; variável incorreta
        int I;
        //int 1a; variável incorreta
        int _1a; // não é uma variável incorreta, porém também não recomendada
        int $aq;  // não é uma variável incorreta, porém também não recomendada

        //variáveis dentro de métodos sempre tem que ter o seu valor inicial
        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;


        final int j = 10;
        //j = 15; se a variável j é uma variável FINAL, o último valor dela já foi decretado e não pode ser substituído
        int asrn24678md;
        //int asrn246 78md; Variáveis não podem conter espaços
        int asrn24678_md =10;
        //int asrn246%78_md =10; Variáveis não podem conter caracteres especiais utilizados para outros comandos

        asrn24678md = 100;
        asrn24678md = 10;

        int quantidadeProduto = 50;
        //int QuantidadeProduto; Não recomendado iniciar com letra maiúscula
        final int NUMERO_TENTATIVAS = 5;
        //final int numeroTentativas = 5; Não seguiu o padrão de síntaxe apropriado para variáveis final
        int QUANTIDADE_OPCOES = 25;
        //int qtdProd; Nenhuma expressão ou valor aplicado a variável para depois exibir

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn24678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
