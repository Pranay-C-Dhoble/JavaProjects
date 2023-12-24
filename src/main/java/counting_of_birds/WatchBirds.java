package counting_of_birds;

public class WatchBirds {
    //getLastWeek()
    //getToday()
    //incrementTodaysCount()
    //hasDayWithoutBirds()
    //getCountForFirstDays()
    //getBusyDays()
    private final int[] birdsPerDay;
    public WatchBirds(int[] birdsPerDay) { // constructor
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    public int getToday() {
        if(birdsPerDay.length < 1) {
            return 0;
        }else {
            return birdsPerDay[birdsPerDay.length - 1];
        }
    }
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++; // another way to do
        // birdsPerDay[birdsPerDay.length - 1] = birdsPerDay[birdsPerDay.length - 1] + 1;
    }
    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for(int i = 0; i < numberOfDays; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }
    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < birdsPerDay.length; i++) {
            if(birdsPerDay[i] >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
