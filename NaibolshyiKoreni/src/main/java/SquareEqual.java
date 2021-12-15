public class SquareEqual
{
    private double[] multipliers = new double[3];
    public SquareEqual(double a, double b, double c)
    {
        multipliers[0] = c;
        multipliers[1] = b;
        multipliers[2] = a;
    }
    public double[] getRoots()
    {
        double discriminant = multipliers[1]*multipliers[1] - 4*multipliers[0]*multipliers[2];
        if (Double.compare(discriminant, 0) < 0)
        {
            throw new IllegalArgumentException("No rootss");
        }
        if(Double.compare(discriminant, 0) == 0)
        {
            double[] arr = new double[1];
            arr[0] = (-multipliers[1] + Math.sqrt(discriminant))/(2*multipliers[2]);
            return arr;
        }
            double[] arr = new double[2];
            arr[0] = (-multipliers[1] + Math.sqrt(discriminant))/(2*multipliers[2]);
            arr[1] = (-multipliers[1] - Math.sqrt(discriminant))/(2*multipliers[2]);
            return arr;
    }
}
