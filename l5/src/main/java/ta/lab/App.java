package ta.lab;

/**
 * Hello world!
 *
 */
public class App 
{
    public static double calculateRenumeration(double sales, double fixedSalary) {
        // double commissionRate = 0.12;
        // double commission = 0.0;
        // if (sales > 5000) {
        //     commission = (sales - 5000) * commissionRate;
        // }
        // return commission + fixedSalary;
        return sales>5000 ? (sales - 5000) * 0.12 + fixedSalary : fixedSalary;
    }
    public static void main( String[] args )
    {
        System.out.println(App.calculateRenumeration(6000, 2000));
    }
}
