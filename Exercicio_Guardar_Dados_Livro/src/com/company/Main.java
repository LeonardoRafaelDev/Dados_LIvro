
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String Nome_livro, Nome_livro2, Nome_livro3,Nome_livro4, Nome_Autor, Assunto_Livro, ISBN_Livro,ISBN_Livro2,ISBN_Livro3,ISBN_Livro4;

        int Sequencia_Livro1, Sequencia_Livro2 , Sequencia_Livro3,Sequencia_Livro4, Ano_Lancamento,Ano_Lancamento2,Ano_Lancamento3,Ano_Lancamento4;
        //setando aqui pra minha ide nao reclamar q n foi iniciado talvez ai passe to usando a (Intellij ultimate)
        Nome_livro2 = "algum livro";
        Nome_livro3 = "algum livro";
        Nome_livro4 = "algum livro";

        Ano_Lancamento2 = 2020;
        Ano_Lancamento3 = 2020;
        Ano_Lancamento4 = 2020;

        ISBN_Livro2 = null;
        ISBN_Livro3 = null;
        ISBN_Livro4 = null;



        //pedindo nome do livro
        System.out.println("Digite o nome do Livro.");
        Scanner Livro = new Scanner(System.in);
        Nome_livro = Livro.nextLine();

        //pedindo nome autor
        System.out.println("Digite o nome do Autor do Livro.");
        Scanner Autor = new Scanner(System.in);
        Nome_Autor = Autor.nextLine();


        //Pedindo Numero sequencia
        System.out.println("Digite o Numero da Sequencia do livro, caso seja unico digite apenas 1. max 3");
        Scanner Sequencia = new Scanner(System.in);
        Sequencia_Livro1 = Sequencia.nextInt();

        switch (Sequencia_Livro1) {

            case 2 :
                //pedindo nome
                System.out.println("Digite o nome da primeira sequencia do Livro.");
                Scanner Livro2 = new Scanner(System.in);
                Nome_livro2 = Livro2.nextLine();

                //Pedindo ISBN do Livro.
                System.out.println("Digite o ISBN da primeira sequencia do livro sem espaço ou algo parecido, apenas numeros.");
                Scanner ISBN2 = new Scanner(System.in);
                ISBN_Livro2 = ISBN2.nextLine();

                //pedindo ano de publicacao
                System.out.println("Digite o ano de publicacao da primeira sequencia do livro");
                Scanner Ano_Livro2 = new Scanner(System.in);
                Ano_Lancamento2 = Ano_Livro2.nextInt();
                break;

            case 3 :
                //pedindo nome
                System.out.println("Digite o nome da Segunda sequencia do Livro.");
                Scanner Livro3 = new Scanner(System.in);
                Nome_livro3 = Livro3.nextLine();

                //Pedindo ISBN do Livro.
                System.out.println("Digite o ISBN da Segunda sequencia do livro sem espaço ou algo parecido, apenas numeros.");
                Scanner ISBN3 = new Scanner(System.in);
                ISBN_Livro3 = ISBN3.nextLine();

                //pedindo ano de publicacao
                System.out.println("Digite o ano de publicacao da Segunda sequencia do livro");
                Scanner Ano_Livro3 = new Scanner(System.in);
                Ano_Lancamento3 = Ano_Livro3.nextInt();

                System.out.println("Digite o nome da primeira sequencia do Livro.");
                Scanner Livro4 = new Scanner(System.in);
                Nome_livro4 = Livro4.nextLine();

                //Pedindo ISBN do Livro.
                System.out.println("Digite o ISBN da primeira sequencia do livro sem espaço ou algo parecido, apenas numeros.");
                Scanner ISBN4 = new Scanner(System.in);
                ISBN_Livro4 = ISBN4.nextLine();

                //pedindo ano de publicacao
                System.out.println("Digite o ano de publicacao da primeira sequencia do livro");
                Scanner Ano_Livro4 = new Scanner(System.in);
                Ano_Lancamento2 = Ano_Livro4.nextInt();
                break;
        }


        //pedindo assunto
        System.out.println("Digite o Assunto do Livro.");
        Scanner Assunto = new Scanner(System.in);
        Assunto_Livro = Assunto.nextLine();

        //Pedindo ISBN do Livro.
        System.out.println("Digite o ISBN do livro sem espaço ou algo parecido, apenas numeros.");
        Scanner ISBN = new Scanner(System.in);
        ISBN_Livro = ISBN.nextLine();

        //pedindo ano de publicacao
        System.out.println("Digite o ano de publicacao");
        Scanner Ano_Livro = new Scanner(System.in);
        Ano_Lancamento = Ano_Livro.nextInt();

        //mostrando o livrao
        System.out.println("Os Dado dos Livro sao" + "\n" +
                "Nome: " + Nome_livro2  + "\n" +
                "Nome Autor:"  + Nome_Autor  + "\n" +
                "Sequencia: " + Sequencia_Livro1 + "\n" +
                "Assunto: " + Assunto_Livro  + "\n" +
                "ano lancamento: " + Ano_Lancamento  + "\n" +
                "ISBN: " + ISBN_Livro );

        //mostrando outro livrao a sequencia seja 2
        if (Sequencia_Livro1 == 2){
            System.out.println(
                    "===================================" + "\n" +
                    "Os Dado do primeiro Livro sao" + "\n" +
                    "Nome: " + Nome_livro2  + "\n" +
                    "Nome Autor:"  + Nome_Autor  + "\n" +
                    "Sequencia: 1"  + "\n" +
                    "ano lancamento: " + Ano_Lancamento2  + "\n" +
                    "ISBN: " + ISBN_Livro2 +
                    "===================================" + "\n" );
        }
        else if (Sequencia_Livro1 == 3){
            System.out.println(
                    "===================================" + "\n" +
                    "Os Dado do primeiro Livro sao" + "\n" +
                    "Nome: " + Nome_livro4  + "\n" +
                    "Nome Autor:"  + Nome_Autor  + "\n" +
                    "Sequencia: 1"  + "\n" +
                    "ano lancamento: " + Ano_Lancamento4  + "\n" +
                    "ISBN: " + ISBN_Livro4 + "\n" +
                    "===================================" + "\n" +
                            "e os dados do segundo sao" + "\n" +
                            "Nome: " + Nome_livro3  + "\n" +
                            "Nome Autor:"  + Nome_Autor  + "\n" +
                            "Sequencia: 2"  + "\n" +
                            "ano lancamento: " + Ano_Lancamento3  + "\n" +
                            "ISBN: " + ISBN_Livro3 + "\n" +
                    "===================================" + "\n"
            );

        }
    }
}

/*
*
* nome do livro = string
* nome do autor = string
* numero da sequencia caso n tenha 1 = int
* assunto = string
* ISBN = int = porem ele nao aguenta o tamanho do isbn entao melhor string
* ano da publicacao = int
* 8381238
* 9780132350884
*
* caso n seja o primeiro digite os outros ou seja
* caso seja o 2 digite apenas o primeiro 0 4 o 1 2 3
* array fica mais limpo e pratico porem n ensinado
* switch case seria o modo mmenos avancado certo porem n ensinado tambem
* */
