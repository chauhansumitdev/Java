package CoreJava;

// Define an enum type called Day
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

// A class that uses the Day enum
class Schedule {
    private String activity;
    private Day day;

    public Schedule(String activity, Day day) {
        this.activity = activity;
        this.day = day;
    }

    public void displaySchedule() {
        System.out.println("Activity: " + activity);
        System.out.println("Day: " + day);
    }
}

public class EnumExample {
    public static void main(String[] args) {
        // Using the Day enum in the Schedule class
        Schedule mondaySchedule = new Schedule("Team Meeting", Day.MONDAY);
        mondaySchedule.displaySchedule();

        Schedule fridaySchedule = new Schedule("Casual Friday", Day.FRIDAY);
        fridaySchedule.displaySchedule();
    }
}
