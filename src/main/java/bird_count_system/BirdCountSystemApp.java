package bird_count_system;
import java.util.Scanner;
import bird_count_system.BirdWatcher;

public class BirdCountSystemApp {
    static int[] birds =new int[] { 1, 2, 3, 4, 5, 6, 7 };
    public static void main(String[] args) {
        System.out.println("----------------Welcome to Bird Count System----------------");
        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter the operation you want to perform");
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();

            //Splitting the string into an array of strings
            args = action.split(" ");

            BirdWatcher birdWatcher = new BirdWatcher(birds);
            if (args.length < 1) {
                System.out.println("Usage: java BirdCountSystem -action [getLastWeek|getToday|incrementTodaysCount|hasDayWithoutBirds|getCountForFirstDays|getBusyDays]");
                return;
            }
            switch (args[0]) {
                case "getLastWeek":
                    BirdWatcher.getLastWeek();
                    break;
                case "getToday":
                    BirdWatcher.getToday();
                    break;
                case "incrementTodaysCount":
                    BirdWatcher.incrementTodaysCount();
                    break;
                case "hasDayWithoutBirds":
                    BirdWatcher.hasDayWithoutBirds();
                    break;
                case "getCountForFirstDays":
                    BirdWatcher.getCountForFirstDays(Integer.parseInt(args[1]));
                    break;
                case "getBusyDays":
                    BirdWatcher.getBusyDays();
                    break;
                case "exit":
                    System.out.println("--------------------------------Exiting the application----------------------------------");
                    System.out.println("--------------------------Thank you for using the application----------------------------");
                    return;
                default:
                    System.out.println("Invalid action");
                    return;
            }

        }
    }
}
