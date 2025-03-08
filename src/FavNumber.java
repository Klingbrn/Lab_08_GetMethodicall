import java.util.Scanner;
public class FavNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favdouble = 0;
        favInt = SafeInput.getInt(in, "Please enter your favorite integer: ");
        favdouble = SafeInput.getDouble(in, "Please enter your favorite double: ");
        System.out.println("\nYour favorite numbers are: " + favInt + " " + favdouble);
    }
}
