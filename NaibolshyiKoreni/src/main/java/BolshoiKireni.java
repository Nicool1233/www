public class BolshoiKireni
{
    public double root(SquareEqual tripleChlen)
    {
        double[] roots = tripleChlen.getRoots();
        if(roots.length == 0)
        {
            throw new IllegalArgumentException("No roots");
        }
        if(roots.length == 1)
        return roots[0];
        double max = roots[0];
            if (Double.compare(max, roots[1]) < 0)
                max = roots[1];

        return max;
    }
}
