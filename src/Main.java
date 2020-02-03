import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int usersNumber;
        do{
            System.out.println("Podaj liczbę");
            usersNumber = sc.nextInt();
            if(usersNumber<100)
                System.out.println("Podana liczba jest za mała");
            else if(usersNumber>200)
                System.out.println("Podana liczba jest za duża");
            else if(usersNumber%3!=0)
                System.out.println("Liczba nie jest podzielna przez 3");
        } while(usersNumber<100 || usersNumber>200 || usersNumber%3!=0);
        System.out.println("Twoja liczba jest ok");

        sc.close();
    }
}
