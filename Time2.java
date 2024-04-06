public class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Constructors...

    public Time2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    public Time2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }
    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to increment seconds
    public void incrementSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            incrementMinute();
        }
    }

    // Method to increment minutes
    public void incrementMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            incrementHour();
        }
    }

    // Method to increment hours
    public void incrementHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
    }

    // Other methods...

    // Get Methods
    // get hour value
    public int getHour() {
        return hour;
    }

    // get minute value
    public int getMinute() {
        return minute;
    }

    // get second value
    public int getSecond() {
        return second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

    // Test program
    public static void main(String[] args) {
        // Test incrementing seconds
        Time2 time = new Time2(10, 30, 55);
        System.out.println("Original Time: " + time.toUniversalString());
        time.incrementSecond();
        System.out.println("After incrementing seconds: " + time.toUniversalString());

        // Test incrementing minutes
        time = new Time2(10, 59, 55);
        System.out.println("\nOriginal Time: " + time.toUniversalString());
        time.incrementMinute();
        System.out.println("After incrementing minutes: " + time.toUniversalString());

        // Test incrementing hours
        time = new Time2(23, 59, 55);
        System.out.println("\nOriginal Time: " + time.toUniversalString());
        time.incrementHour();
        System.out.println("After incrementing hours: " + time.toUniversalString());
    }
}
