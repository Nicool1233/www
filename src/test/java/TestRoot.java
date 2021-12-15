import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRoot {
    @Test
    public void testRootEquals() {
        BolshoiKireni bolshoiKireni = new BolshoiKireni();

        assertEquals(Double.compare(bolshoiKireni.root(new SquareEqual(1, 5, 6)), -2), 0);
    }
    @Test
    public void testBad()
    {
        BolshoiKireni bolshoiKireni = new BolshoiKireni();
        try
        {
            bolshoiKireni.root(new SquareEqual(1, 1, 1));
        } catch (IllegalArgumentException e)
        {
            System.err.println("No roots");
        };
    }
}
