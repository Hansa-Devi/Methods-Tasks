import java.util.Calendar;

public class Method_15_CurrentDateTime {
    public static void currentDateTIme(){
        Calendar cal = Calendar.getInstance();
        System.out.println("Current datetime "+cal.getTime());
    }
    public static void main(String[] args) {
        currentDateTIme();
    }
}
