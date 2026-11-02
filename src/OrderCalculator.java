public class OrderCalculator {
    public static int calculate(int price, int quantity) {
        if (quantity<=0){
            return 0;
        }
        else if (quantity>=10){
            double discountPrice = price*quantity*0.9; //10% 할인
            return (int) discountPrice;
        }
        else{
            return price*quantity;
        }
    }
}