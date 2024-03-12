package ta.lab;

public class Allowance {
    public double calcCL(int BP) {
        double amt = BP * 1.2375;
        amt = amt < 2000 ? 2000 : amt;
        amt = amt > 5000 ? 5000 : amt;
        return amt;
    }

    public double calcTA(int BP) {
        double amt = BP * 0.575;
        amt = amt < 300 ? 300 : amt;
        return amt;
    }

    public double calcMA(int BP) {
        double amt = BP * 0.735;
        amt = amt > 2000 ? 2000 : amt;
        return amt;
    }
}
