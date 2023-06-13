import java.util.Scanner;

public class par {
    static Scanner sc = new Scanner(System.in);

    public static void cabecalho(){
        System.out.println("********************");
    }

    //metódo do tipo String, retorna String0
    public static int getInt(){
        int valor;
        valor = sc.nextInt();
        
        return valor;
    }

    public static void fechaScanner(){
        sc.close();
    }

    public static float calcularMedia(int a, int b, int c){
        float media;

        media = (a+b+c)/3;
        return media;
    }

    public static boolean ehPar(int a){
        boolean par;

        if(a%2==0){
            par = true;
        } else {
            par = false;
        }

        return par;
    }

    public static boolean ehImpar(int a){
        boolean impar;

        impar = !ehPar(a);

        return impar;
    }

    public static void main(String[] args){
        //variáveis
        int n;
        boolean impar;

        //entrada e saída ehImpar
        cabecalho();
        System.out.println("Digite um valor inteiro: ");
        n = getInt();
        impar = ehImpar(n);

        if(impar){
            System.out.printf("%d é par\n", n);
        } else {
            System.out.printf("%d não é par", n);
        }

        cabecalho();

        fechaScanner();

        //entrada e saída ehPar
        // cabecalho();
        // System.out.println("Digite um valor inteiro: ");
        // n = getInt();
        // par = ehPar(n);

        // if(par){
        //     System.out.printf("%d é par\n", n);
        // } else {
        //     System.out.printf("%d não é par", n);
        // }

        // cabecalho();

        // fechaScanner();
    }
    
}
