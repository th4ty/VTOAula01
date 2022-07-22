package one.digitalinnovation.basecamp.TipodeDados;

public class TipoDeDados {
    public static void main(String[] args) {

        /*
        Criar um simples projeto no IntelliJ e criar duas variáveis para cada tipo de dados apresentados, sendo eles:
        Primitivos:
        - textual: char (caracteres entre '') e String (texto com mais capacidade de armazenamento
        - numeral:
            - byte (numeros com 32bits de armazenamento);
            - short (numeros com 64bits de armazenamento);
            - int (numeros inteiros com 32bits de armazenamento);
            - long (numeros inteiros com 64bits de armazenamento);
            - float (numeros reais com 32bits de armazenamento);
            - double (numeros reais com 64bits de armazenamento);
        - lógico: boolean (true or false)
        - objeto (que somente será abordado no curso de orientação a objetos)
            String também é um tipo de variável objeto, porém, como é bastante utilizada hoje em dia se enquadra nas primitivas
         */

        //Textual
        char c = 'C';
        String nome = "Thaty";

        //Numeral
        byte b = 2;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.40282347853412254324f;
        double d  = 3.1445572258514112258412254;

        //Lógica (Boolean)
        boolean num1 = false;
        boolean num2 = true;

        System.out.println("Os tipos de dados textuais, numerais e lógicos, respectivamente são: ");
        System.out.println("char: " + c);
        System.out.println("String: " + s);

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("False: " + num1);
        System.out.println("True: "+ num2);


    }

}
