import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Qual é a sua idade ? ");
        sc.nextInt();
        p1.novaidade();
        System.out.println("Você vai completar " + p1.idade);
    }
}