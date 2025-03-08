import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        int birthYear = 0;
        birthYear = SafeInput.getRangeInt(in, "Please enter your birth month ", 1, 12 );
        int birthDay = 0;
        birthDay = SafeInput.getRangeInt(in, "Please enter you birth day ", 1, 31);
        int birthMin = 0;
        birthMin = SafeInput.getRangeInt(in,"Please Enter your birth minute ", 1, 59);
        int birthHour = 0;
        birthHour = SafeInput.getRangeInt(in, "Enter you brith hour: ", 1, 24);
        System.out.println("\nYour birth date and time: ");
        System.out.printf("Year: %d\nMonth: %d\nHour: %d\nMinute: %d\n", birthYear, birthMonth, birthDay, birthHour, birthMin);
    }
}