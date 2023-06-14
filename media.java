import java.util.Scanner;

public class media {
    static Scanner sc = new Scanner(System.in);

    //procedimento cabeçalho
    public static void cabecalho(){
        System.out.println("********************");
    }

    //metódo do tipo inteiro, le um valor com Scanner.
    public static int getInt(){
        int valor;
        valor = sc.nextInt();
        
        return valor;
    }

    //procedimento p/ fechar o Scanner
    public static void fechaScanner(){
        sc.close();
    }

    //função p/ calcular média
    public static float calcularMedia(int a, int b, int c){
        float media;

        media = (a+b+c)/3;
        return media;
    }

    public static void main(String[] args){
        //variáveis
        int v1, v2, v3;
        float media;

        //entrada e saída
        cabecalho();
        System.out.println("Digite três valores: ");
        v1 = getInt();
        v2 = getInt();
        v3 = getInt();

        media = calcularMedia(v1, v2, v3);

        System.out.printf("A média das respectivas notas %d , %d , %d , é: %.2f\n", v1, v2, v3, media);

        cabecalho();

        fechaScanner();
    }
}
