package bird_count_system;

public class BirdWatcher {
    //getLastWeek()
    //getToday()
    //incrementTodaysCount()
    //hasDayWithoutBirds()
    //getCountForFirstDays()
    //getBusyDays()
    private static int[] birdsPerDay = new int[0];
    public BirdWatcher(int[] birdsPerDay) { // constructor
        BirdWatcher.birdsPerDay = birdsPerDay.clone();
    }
    public static void getLastWeek() {
        for(int i = 0; i < birdsPerDay.length; i++) {
            System.out.print(birdsPerDay[i] + " ");
        }
        System.out.println();
    }
    public static void getToday() {
        if(birdsPerDay.length < 1) {
            System.out.println("There is no day");
        }else {
            System.out.println(birdsPerDay[birdsPerDay.length - 1]);
        }
    }
    public static void incrementTodaysCount() {

        BirdCountSystemApp.birds[birdsPerDay.length - 1]= ++birdsPerDay[birdsPerDay.length - 1]; // another way to do
        // birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;

        System.out.println(BirdCountSystemApp.birds[birdsPerDay.length - 1]);
    }
    public static void hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] == 0) {
                System.out.println("There is a day without birds");
                return;
            }
            else {
                System.out.println("There is no day without birds");
                return;
            }
        }
    }
    public static void getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        System.out.println("The total count of Birds is : "+sum);
    }
    public static void getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5) {
                System.out.println("The day " + (i + 1) + " is a busy day");
            }
        }
    }
}
