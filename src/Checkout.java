import java.util.Scanner;
public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double totalCost = 0;
        boolean done = false;

        do {
            itemCost = SafeInput.getRangeDouble(in, "Enter the price of the item: ",.50, 10.00);
            totalCost += itemCost;
            done = SafeInput.getYNConfirm(in, "Do you have anymore items? (Y/N): ");
        } while (done);
        System.out.printf("\nYour total is: $%.2f\n", totalCost);
    }
}
