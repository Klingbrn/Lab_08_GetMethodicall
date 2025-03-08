import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String MID="";
        String menuChoice = "";
        SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        MID = SafeInput.getRegExString(in, "Enter your M number", "^(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in,"Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
    }

}
