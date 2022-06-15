public class Main {
    public static void main(String[] args) {

        double ticketCost = 5754.45; // стоимость билета
        int step = 20; // количество рублей для одной бонусной мили
        int bonus = (int) ticketCost / step;

        System.out.println("количество бонусных рублей = " + bonus);
    }
}
