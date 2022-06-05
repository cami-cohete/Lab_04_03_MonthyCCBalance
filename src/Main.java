public class Main {

    public static void main(String[] args) {
	double cardBalance = 5000.00;
    double intrerestRate = 0.17;
    double cardInterest = 0;
    cardInterest = cardBalance * intrerestRate;
    System.out.println("If your card balance is $" + cardBalance);
    System.out.printf("Then after one month your interest rate is $%.2f\n" ,cardInterest);
    cardBalance = cardInterest + cardBalance;
    cardInterest = cardBalance * intrerestRate;
    System.out.printf("Your interest rate after two months is $%.2f\n" ,cardInterest);
    }
}
