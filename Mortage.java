import java.text.NumberFormat;
public class Mortgage {
    private static final byte MONTHS_IN_YEAR =12;
    private static final byte PERCENTAGE =100;
    private static int principal;
    private static double annualInterestRate;
    private static int periodYears;

    public static void constructorMethod(int principal1,int annualInterestRate,int periodYears){
        principal=principal1;
        setAnnualInterestRate(annualInterestRate);
        setPeriodYears(periodYears);
        calMortgage();
    }

    private static void calMortgage(){
        double result = (((Math.pow((1+annualInterestRate),periodYears))*annualInterestRate)/((Math.pow((1+annualInterestRate),periodYears))-1))*principal;
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + NumberFormat.getCurrencyInstance().format(result));

        double reduce = principal-result;
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        for (int i=1 ; i<=periodYears ;i++){

            System.out.println(NumberFormat.getCurrencyInstance().format(reduce));
            if(reduce==0)
                break;
            reduce-=result;
            if (reduce<0)
                reduce =0;
        }
    }
     private static void setAnnualInterestRate(int annualInterestRate1){
        annualInterestRate= (double) annualInterestRate1 / MONTHS_IN_YEAR / PERCENTAGE;
    }
    private static void setPeriodYears(int periodYears1){
        periodYears = periodYears1*MONTHS_IN_YEAR;
    }
}

