public class OrderCalculator {
    public static int calculate(int price, int quantity) {
        if (quantity<=0){
            return 0;
        }
        else{
            return price*quantity;
        }
    }
}