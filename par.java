import java.util.Scanner;

public class par {
    static Scanner sc = new Scanner(System.in);

    //procedimento
    public static void cabecalho(){
        System.out.println("********************");
    }

    //metódo/função do tipo inteiro p/ ler valor com Scanner.
    public static int getInt(){
        int valor;
        valor = sc.nextInt();
        
        return valor;
    }

    //procedimento
    public static void fechaScanner(){
        sc.close();
    }

    //método/função do tipo float para calcular média
    public static float calcularMedia(int a, int b, int c){
        float media;

        media = (a+b+c)/3;
        return media;
    }

    //função booleana para verificar se um número é par.
    public static boolean ehPar(int a){
        boolean par;

        if(a%2==0){
            par = true;
        } else {
            par = false;
        }

        return par;
    }

    //Função booleana verificando se um número é impar, o processamento dessa função é a negação da função que verifica se um número é par.
    public static boolean ehImpar(int a){
        boolean impar;

        impar = !ehPar(a);

        return impar;
    }

    public static void main(String[] args){
        //variáveis
        int n;
        boolean impar;

        //entrada ehImpar
        cabecalho();
        System.out.println("Digite um valor inteiro: ");
        n = getInt();
        impar = ehImpar(n);

        //saída ehImpar
        if(impar){
            System.out.printf("%d é par\n", n);
        } else {
            System.out.printf("%d não é par\n", n);
        }

        //procedimento cabeçalho
        cabecalho();

        //procedimento fechar Scanner
        fechaScanner();

        //entrada ehPar
        // cabecalho();
        // System.out.println("Digite um valor inteiro: ");
        // n = getInt();
        // par = ehPar(n);

        //saída ehImpar
        // if(par){
        //     System.out.printf("%d é par\n", n);
        // } else {
        //     System.out.printf("%d não é par", n);
        // }

        // cabecalho();

        // fechaScanner();
    }
    
}
