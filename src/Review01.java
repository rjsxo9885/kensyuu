public class Review01 {

    public static void main(String[] args) {

        int price = 1500;
        double tax = tax(price);
        int tax1 = (int)tax;
        int totalPrice = price + tax1;
        System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + (int)tax1 + "円）です。");
    }

    public static double tax(int price) {
        double taxRate = 0.1;
        double tax = price * taxRate;
        return (int) tax;
    }
}
