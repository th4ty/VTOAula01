package one.digitalinnovation.basecamp.Casting;

public class Casting {
    public static void main(String[] args) {
        /*

        **O QUE É CASTING?
        Conceito de casting
        "A transformação de uma determinada variável de tipo menos específico para um tipo mais específico."
        Ex: promover uma variável de byte para short ou rebaixar uma variável de string para char.

        ** TIPOS DE CASTING
            *Upcasting: Promoção variável para um tipo maior
            *Downcasting: Rebaixar variável para um tipo menor

        ** COMO E QUANDO USAR CASTING
            Upcast - Implícito = Pode ser feito tranquilamente sem explicar ao Java

            Downcast - Explícito = Precisa ser explicado ao Java essa conversão

            Casting com perda de informação:
            Conversão de uma variável float (decimal) em int (inteira)
            Terá perca da informação após o ponto.
            Fazer esse tipo de conversão é perigoso em um desenvolvimento para uma aplicação financeira.

         */

        //Início Exercício 4 - Criar um simples projeto no IntelliJ para realizar alguns Castings diversos

        long l;
        int i = 10;
        l = i;
        //Upcast implícito

        int i_2;
        long l_2 = 100;
        i_2 = (int) l_2;
        //Downcast explícito, precisei explicar ao Java que a variável l deixará de ser long e passará ser int
        //Obs: não haverá perca de dados no exemplo acima pois com certeza o valor 100 cabe dentro de uma var int

        double d;
        float f = 10.5f;
        d = f;

        float f_2;
        double d_2 = 10.5d;
        f_2 = (float) d_2;

        int i_3;
        float f_3 = 10.5f;
        i_3 = (int) f_3;

        System.out.println(i);
        System.out.println(l_2);
        System.out.println(d);
        System.out.println(f_2);
        System.out.println(i_3);







    }
}
