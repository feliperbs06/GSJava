package classstuff;

// look up java.util.Date (old, don't use it)
// and java.time... (LocalDate, LocalDateTime, ZonedDateTime
public class Date {

    // private means accessible only between the enclosing TOP-LEVEL curlies
    // including any "nested" or "inner" classes
    private int day;
    private int month;
    private int year;

    // called a "constructor" but it's not, it's an initializer
    // in a constructor "this" is implicit (cannot be explicit)
    public /* NO RETURN TYPE!!! */ Date(int day, int month, int year) {
        // reject illegal values!!!
        // clearly 31 is wrong!!!
        if (day < 1 || day > 31 /* day >= daysInMonth(month, year)  */ || month < 1 || month > 12) {
            throw new IllegalArgumentException("Bad date values");
        }
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        // check validity!!!
        if (day < 1 || day > 31) throw new IllegalArgumentException("Bad Day value");
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        // check validity!!!
        if (month < 1 || month > 12) throw new IllegalArgumentException("Bad Month!");
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private static String[] names = {
            "Jan", "Feb", "Mar", "Apr", // ...
    };

    public static String monthName(int month) {
        if (month > 0 && month <= 12) return names[month - 1];
        throw new IllegalArgumentException("Bad Month number");
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static String asText(int day, int month, int year) {
        return "Date day=" + day + " month=" + month + ", year=" + year;
    }

//    public static String asText(Date d) {
//    public String asText(Date this) {
    public String asText() { // "this" is IMPLICIT HERE
//        return asText(d.day, d.month, d.year);
        return asText(this.day, this.month, this.year);
    }


    public String toString() {
        return asText();
    }
}

// unspecified access (usually) means "within the same package"
class Holiday extends Date {
    private String name;
    // if ZERO constructors in code, you get the "default" constructor
    // which looks like this:
//    Holiday() {
//        super();
//    }
    Holiday(int day, int month, int year, String name) {
        super(day, month, year); // today super, if present, MUST COME FIRST
        this.name = name;
    }

    Holiday() {
//        super(1, 1, 2024);
//        this.name = "New Year's Day";
        this(1, 1, 2024, "New Year's Day"); // use this(...) OR super(...)
    }

    public String getName() {
        return name;
    }

    @Override // "annotation" -- this one reports error if mistyped method name ")
    public String toString() {
        return "Holiday called " + name + " " + super.toString();
    }


}


// test??? use JUNIT or TestNG (or others)
class UseDate {
    public static void main(String[] args) {
//        Date d = new Date(); // make one
//        d.day = 12;
//        d.month = 9;
//        d.year = 2023;

        // new creates the storage, "constructor" simply inicializes that object
//        Date d = new Date(12, 19, 2023); // exception :)
        Date d = new Date(12, 9, 2023);
        System.out.println("date is " + d);
        System.out.println("date is " + d.asText());

//        d.month = -32;
//        d.setMonth(-32);
//        System.out.println("date is " + d.asText());

        Date /* or Holiday??? */ h = new Holiday(1, 1, 2024, "New Year's Day");
//        System.out.println(h);
        // behaviors available are determined by type of reference,
        // implementation is determined by the type of the object
        System.out.println(h.toString());
//        System.out.println(h.getName());

    }
}
