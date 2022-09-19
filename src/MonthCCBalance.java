public class MonthCCBalance {
    public static void main(String[] args){
        double creditBalance = 5000;
        double firstMonth ;
        double secondMonth;

        firstMonth = creditBalance * .17;
        secondMonth = (firstMonth + creditBalance) * .17;

        System.out.println("interest after first month is: " + firstMonth);
        System.out.println("interest after second Month is: " + secondMonth);
    }
}
