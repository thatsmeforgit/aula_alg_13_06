import java.util.Scanner;
public class divisor {
    
    static Scanner sc = new Scanner(System.in);

    //função para ler um valor
    public static int getInt(){
        int valor;
        valor = sc.nextInt();
        
        return valor;
    }

    //procedimento para fechar o Scanner
    public static void fechaScanner(){
        sc.close();
    }

    //função para calcular os divisores de um número
    public static int div(int n){
        for (int i=1;i<=n;i++){
            if(n%i==0){
            System.out.println(i);
            }
        }
        return n;
    }

    public static void main(String[] args){
        //entrada 
        System.out.println("Informe um valor: ");
        int n = getInt();

        //saída
        div(n);

        fechaScanner();
    }
}
