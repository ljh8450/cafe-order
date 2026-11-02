import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴: ");
        String menu = sc.nextLine();
        System.out.print("수량: ");
        int quantity = sc.nextInt();
        int price = Menu.getPrice(menu);
        int total = OrderCalculator.calculate(price, quantity);
        System.out.println("총금액: " + total + "원");
    }
}