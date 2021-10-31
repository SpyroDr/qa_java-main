import com.example.Alex;
import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexUnitsTest {
    Feline feline = new Feline();
    Alex alex;

    {
        try {
            alex = new Alex("Самец", feline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expected = alex.getFood();

        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }
    @Test
    public void getFamilyTest() throws Exception {

        int expected = alex.getKittens();

        int actual = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveMane() throws Exception {
        boolean expected = alex.doesHaveMane();
        assertEquals(expected, true);
    }
}
