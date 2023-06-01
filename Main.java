public class Main {
    public static void main(String[] arg) {

        int principal= Check.checkValidate("Enter Principal between 1K - 1M: ",1_000_000,1000);
        int annualInterestRate= Check.checkValidate("Enter Annual Interest Rate between 1% - 10%: ",10,1);
        int periodYears= Check.checkValidate("Period (Years): ",10,2);

        Mortgage.constructorMethod(principal,annualInterestRate,periodYears);
    }
}

