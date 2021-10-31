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

//@RunWith(MockitoJUnitRunner.class)
public class FelineUnitsTest {
    private String animalKind = "Хищник";
    Feline feline = new Feline();
    //private String sex = "Самка";


    //@Mock
    //Feline feline;
    //Lion lion;

    @Test
    public void getKittensTest() throws Exception {

       // Feline feline = new Feline();

        //Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(2);
        int expected = feline.getKittens();//(Mockito.anyInt());

        assertEquals(expected, 1);
    }
    @RunWith(Parameterized.class)
    public static class getKittensParameterizedTest {
        private final int kittensCount;
        private final int actual;


        public getKittensParameterizedTest(int kittensCount, int actual) {
            this.kittensCount = kittensCount;
            this.actual = actual;
        }

        @Parameterized.Parameters // добавили аннотацию
        public static Object[][] getKittensCount() {
            return new Object[][]{
                    {10, 10},
            };
        }

        @Test
        public void getKittensParameterizedTest() throws Exception {
            Feline feline = new Feline();

            int expected = feline.getKittens(kittensCount);
            assertEquals(expected, actual);
        }
    }


    @Test
    public void eatMeatTest() throws Exception {
        //Feline feline = new Feline();

        //Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(Collections.singletonList("веган"));
        List<String> expected = feline.getFood(animalKind);

        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() throws Exception {
        //Feline feline = new Feline();


        String expected = feline.getFamily();

        String actual = "Кошачьи";
        assertEquals(expected, actual);
    }

}
