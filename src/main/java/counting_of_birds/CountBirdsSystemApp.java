package counting_of_birds;

import java.util.Arrays;

public class CountBirdsSystemApp {
    public static void main(String[] args) {
        int[] birdsPerDay = {1, 2, 3, 4, 5, 6, 7};
        WatchBirds watchBirds = new WatchBirds(birdsPerDay);
        System.out.println("Last week birds count: ");
        System.out.println("Birds last week: " + Arrays.toString(watchBirds.getLastWeek()));
//        for(int i = 0; i < watchBirds.getLastWeek().length; i++) {
//            System.out.print(watchBirds.getLastWeek()[i] + " ");
//        }
        System.out.println();
        System.out.println("Today's birds count: " + watchBirds.getToday());
        watchBirds.incrementTodaysCount();
        System.out.println("Today's birds count after increment: " + watchBirds.getToday());
        System.out.println("Has day without birds: " + watchBirds.hasDayWithoutBirds());
        System.out.println("Count for first 3 days: " + watchBirds.getCountForFirstDays(3));
        System.out.println("Busy days: " + watchBirds.getBusyDays());
    }
}