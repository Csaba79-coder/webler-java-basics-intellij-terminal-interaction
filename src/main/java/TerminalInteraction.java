import java.util.Scanner;

public class TerminalInteraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // bekérjük a számot terminálon keresztül
        /*int number;
        number = scanner.nextInt();*/
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        // System.out.println("You entered: " + scanner.nextInt()); // kizárólag akkor, ha nem kell eltárolni!

        // Feltétel, hogy páros vagy páratlan a szám
        System.out.println("Lehet nem a legjobb logika :)");
        if (number % 2 == 0) {
            System.out.println("A szám páros.");
        } else if (number % 3 == 0) {
            System.out.println("A szám osztható hárommal.");
        } else {
            System.out.println("A szám nem páros, vagy nem osztható hárommal.");
        }
        System.out.println("-----------------");
        System.out.println("Talán jobb a logika");
        if (number == 0) {
            System.out.println("A szám nulla.");
        } else if (number % 2 == 0) {
            System.out.println("A szám páros.");
        } else {
            System.out.println("A szám páratlan.");
        }

        System.out.println("-----------------");
        int sum = 0;
        // 0-tól a bekért számokat összeadjuk! a szám amit megadunk, az legyen benne az összegzésben!
        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println("Az összeg: " + sum);

        System.out.println("-----------------");
        // 0-tól a bekért pozitiv számokat összeadjuk! a szám amit megadunk, az legyen benne az összegzésben!
        sum = 0; // újra inicializáljuk a sum változót, de típus már meg lett adva! itt felül írjuk az értékét és tudjuk
        // használni, azonban a korábbi összeg már nem lesz akkor innen elérhető
        // vagy másik megoldás, hogy egy új változót vezetünk be
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Az összeg: " + sum);

        scanner.close(); // de ha lezárom, ezt már nem tudom használni! (viszont a projekt amúgy is kilép)
    }
}
