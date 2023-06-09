public class Zadanie22_wstep {
    public static void main(String[] args) {
        int purchasedStocks = 1000;
        double pricePerStock = 32.87;
        double stockPrice = purchasedStocks * pricePerStock;
        double purchaseComission = 0.02 * stockPrice;
        double totalPrice = stockPrice + purchaseComission;
        int soldStocks = 1000;
        double profitPerStock = 33.92;
        double stockProfit = soldStocks * profitPerStock;
        double sellComission = 0.02 * stockProfit;
        double totalProfit = stockProfit - sellComission;
        double finalBalance = totalProfit - totalPrice;
        System.out.print("Kwota zapłacona: " + stockPrice + ", prowizja przy zakupie: " + purchaseComission +
                ", kwota za sprzedaży: " + stockProfit + ", prowizja przy sprzedaży: " + sellComission +
                ", zysk ze sprzedaży akcji: " + finalBalance);
    }
}
