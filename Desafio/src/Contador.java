import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("diga o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Ola," + nome);
    }
}
