import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma posicao para saber o valor em fibonacci: ");
        int numero = scanner.nextInt();
        System.out.println("O termo de numero " + numero + " em fibonacci sera: " + Fibonacci(numero));
        scanner.close();
    }

    public static int Fibonacci(int elemento){
        if (elemento == 0 || elemento == 1){return 1;}
        else {return Fibonacci(elemento - 1) + Fibonacci(elemento - 2);}
    }
}