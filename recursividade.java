import java.util.Scanner;

public class recursividade {
    //função fatorial não recursiva
    public static int fatorial(int n) {
        int total = 1;
        
        for(int i = n;i>1;i--)
            total *= i;
        
        return total;
    }
    //--------------------------------------

    //Função fatorial recursiva
    public static int fatorialRec(int n) {
        if (n == 0)
            return 1;
        
        return n * fatorialRec(n-1);
    }
    //--------------------------------------

    //função fibonacci recursiva
    public static int fibonacci(int n){

        //Indicação de quanto a função deve terminar
        if (n < 2)
            return 1;
        
        //recursividade
        return fibonacci(n-1) + fibonacci(n-2);
    }
    //--------------------------------------

    //função calcula somatoria de uma sequencia utilizando recursividade
    
    //somatorio(5)
    // somatorio(5) = 5 + somatorio(4)
    // somatorio(4) = 4 + somatorio(3)
    // somatorio(3) = 3 + somatorio(2)
    // somatorio(2) = 2 + somatorio(1)
    // somatorio(1) = 1 + somatorio(0)

    public static int somatorio(int n){
        if(n == 1)
            return 1;

        return n + somatorio(n-1); 
    }

    //----------------------------------------------------------------------
    //saidas
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        //saída função recursiva fatorial
        System.out.printf("%d! = %d\n", n ,fatorialRec(n));
        
        //saída função recursiva fibonacci com estrutura for
        for(int i = 0; i<20; i++){
            System.out.println(fibonacci(i));
        }

        //saída função recursiva somatorio
        System.out.printf("Somatório de %d = %d", n ,somatorio(n));
    }

}
