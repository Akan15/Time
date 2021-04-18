import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTime = 0;
        int biggestTime = 0;
        int smalllestTime = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Сколько дней потребуется на выполнение?");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько часов потребуется на выполнение?");
            int hours = Integer.parseInt(scanner.nextLine());
            System.out.println("Сколько минут потребуется на выполнение?");
            int minutes = Integer.parseInt(scanner.nextLine());

            int currentTimeTask = convertToSecond(days, hours, minutes);
            totalTime += currentTimeTask;

            if(currentTimeTask > biggestTime) {
                biggestTime = currentTimeTask;
            } else if(currentTimeTask < smalllestTime){
                smalllestTime = currentTimeTask;
            }else {
                System.out.println("Для завершение работы программы введите 'end' для продалжения нажмите enter");
            }
            scanner.nextLine();
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }
        }
        System.out.println("Всего требуется: " + totalTime+ " секунд");
        System.out.println("Самая продолжительная задача: " + biggestTime + " секунд");
        System.out.println("Самая короткая задача: " + smalllestTime + " секунд");
    }

    public static int convertToSecond(int days, int hours, int minutes) {
        int second = (days * 24) * 3600 + hours * 3600 + minutes * 60;
        return second;
    }
}