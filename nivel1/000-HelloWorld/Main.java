import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String pal = scan.nextLine();
        StringBuilder stringReversa = new StringBuilder(pal);
        stringReversa.reverse();
        if (pal.equals(stringReversa.toString())){
            System.out.println("É um palíndromo");
            System.out.println(stringReversa);
        }
        else{
            System.out.println("Não é um palíndromo");
            System.out.println(stringReversa);
        }
    }
}
