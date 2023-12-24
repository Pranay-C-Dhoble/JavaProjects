package bird_count_system;
import java.util.Scanner;


public class BirdCountSystemApp {
    public static void main(String[] args) {
        System.out.println("----------------Welcome to Bird Count System----------------");
        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter the operation you want to perform");
            Scanner sc = new Scanner(System.in);
            String action = sc.nextLine();

            //Splitting the string into an array of strings
            args = action.split(" ");
//            if (args.length < 2) {
//                System.out.println("Usage: java BirdCountSystem -action [getLastWeek|getToday|incrementTodaysCount|hasDayWithoutBirds|getCountForFirstDays|getBusyDays]");
//                return;
//            }
            //change string[] into int[] and skip the first element
//            int[] birds = new int[args.length - 1];
//            for(int i = 0; i < birds.length; i++) {
//                birds[i] = Integer.parseInt(args[i + 1]);
//            }
            BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 3, 4, 5, 6, 7 });

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
                default:
                    System.out.println("Invalid action");
                    break;
            }

        }
//        BirdWatcher birdWatcher = new BirdWatcher(new int[] { 1, 2, 3, 4, 5, 6, 7 });
//        System.out.println("Birds last week: " + birdWatcher.getLastWeek());
//        System.out.println("Birds today: " + birdWatcher.getToday());
//        birdWatcher.incrementTodaysCount();
//        System.out.println("Birds today: " + birdWatcher.getToday());
//        System.out.println("Has day without birds: " + birdWatcher.hasDayWithoutBirds());
//        System.out.println("Count for first 3 days: " + birdWatcher.getCountForFirstDays(3));
//        System.out.println("Busy days: " + birdWatcher.getBusyDays());
    }
}
