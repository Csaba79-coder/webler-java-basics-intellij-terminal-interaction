import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

import static java.lang.Thread.sleep;

public class TerminalInteractionWithArray {

    public static void main(String[] args) throws InterruptedException { // ez a throws a sleep miatt kellett
        Scanner scanner = new Scanner(System.in);
        // Kérjük be a tömb méretét
        System.out.println("Enter the size of the array: ");
        int number = scanner.nextInt();

        // Hozzuk létre a tömböt
        int[] numbers = new int[number];
        System.out.println("The size of the array is: " + numbers.length);

        // Töltsük fel a tömböt
        int length = numbers.length;
        for (int i = 0; i < length; i++) { // 0. indextől indul
            System.out.println((i + 1) + ". number: ");
            numbers[i] = scanner.nextInt();
        }

        // Kiiratjuk a tömb elemeit
        for (int num: numbers) {
            System.out.println(num);
        }

        // Kiiratjuk a tömb elemeit fordított sorrendben
        System.out.println("A tömb elemei: " + Arrays.toString(numbers));

        // Sorbarendezés (egyszerű cserével)
        for (int i = 0; i < length - 1; i++) {             // 0  1  2 -> length -1 (hatékonyoabb)
            for (int j =  i + 1; j < length; j++) {        // 1  2  ?
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("A tömb elemei: " + Arrays.toString(numbers));

        int[] numbers2 = new int[10];
        for (int i = 0; i < 5; i++) {
            numbers2[i] = i;
        }
        System.out.println("A tömb elemei: " + Arrays.toString(numbers2));

        double[] numbers3 = new double[10];
        System.out.println("A tömb elemei: " + Arrays.toString(numbers3));
        List<String> words = new ArrayList<>(List.of("1", "2", "3"));
        String text = null;
        words.add(text);
        System.out.println(Arrays.toString(words.toArray()));
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3));
        Integer num = null;
        nums.add(num);
        System.out.println(Arrays.toString(nums.toArray()));

        int[] test = new int[10];
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            counter++;
            test[i] = i;
        }
        int[] test2 = new int[counter];
        for (int i = 0; i < counter; i++) {
            test2[i] = test[i];
        }
        /*
        int[] test2 = new int[counter];
        System.arraycopy(test, 0, test2, 0, counter);
         */
        System.out.println("A tömb elemei: " + Arrays.toString(test2));

        nums.remove(3); // eltávolítottam a harmadik indexen álló null értékkel rendelkező elemet
        Collections.sort(nums);
        System.out.println(Arrays.toString(nums.toArray()));

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        sleep(1000); // itt vagy try catch, vagy nem a legjobban, de eldobtam a metódusban ...
        LocalTime time2 = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        sleep(1000);
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(time2);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
    }
}
