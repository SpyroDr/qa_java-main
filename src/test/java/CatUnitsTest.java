import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatUnitsTest {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void eatMeatTest() throws Exception {


        //Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(Collections.singletonList("веган"));
        List<String> expected = cat.getFood();

        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() throws Exception {
        //Feline feline = new Feline();


        String expected = cat.getSound();

        String actual = "Мяу";
        assertEquals(expected, actual);
    }
}
