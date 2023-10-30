import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        salutation();
        calcSomme();
    }

    public static void salutation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir votre nom: ");
        String nom = sc.nextLine();
        System.out.println("Bonjour, "+nom+" !");

    }
    public static void calcSomme(){
        int somme = 0;
        for (int i=1; i<=100; i++) {
            somme += i;
        }
        System.out.println("La somme des nombres de 1 à 100 est égale à : "+somme);
    }


}

