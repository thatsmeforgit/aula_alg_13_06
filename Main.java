import java.util.Scanner;

public class Main{

    static Scanner sc = new Scanner(System.in);

    public static void cabecalho(){
        System.out.println("********************");
    }

    //metódo do tipo String, retorna String0
    public static String getString(){
        String st;
        st = sc.next();
        
        return st;
    }

    public static void fechaScanner(){
        sc.close();
    }

    public static void main(String[] args){
        //variáveis
        String nome, sobrenome;

        //entrada e saída
        cabecalho();
        System.out.println("Digite seu nome: ");
        nome = getString();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = getString();
        System.out.printf("Boa noite, %s %s\n", nome, sobrenome);
        cabecalho();

        fechaScanner();
    }
}