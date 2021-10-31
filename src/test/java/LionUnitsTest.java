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
public class LionUnitsTest {
    private String animalKind = "Хищник";


    //@Mock
    //Feline feline;
    //Lion lion;

    @Test
    public void getKittensTest() throws Exception {

        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        //Mockito.when(lion.getKittens(Mockito.anyInt())).thenReturn(2);
        int expected = lion.getKittens();//(Mockito.anyInt());

        assertEquals(expected, 1);
    }
    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        //List<String> data = Arrays.asList("Животные", "Птицы", "Рыба");
        //Mockito.when(lion.getFood(Mockito.anyString())).thenReturn(data);
        List<String> expected = lion.getFood(animalKind);//(Mockito.anyString());

        List<String> actual = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @RunWith(Parameterized.class)
    public static class sexPositiveTest {
        private final String sex;
        //private final boolean expected;
        private final Boolean actual;

        public sexPositiveTest(String sex, Boolean actual) {
            this.sex = sex;
            this.actual = actual;
        }

        @Parameterized.Parameters // добавили аннотацию
        public static Object[][] getSex() {
            return new Object[][]{
                    {"Самка", false},
                    {"Самец", true},
                    {"Девушка", true},
            };
        }

        @Test
        public void doesHaveManeTest() throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            boolean expected = lion.doesHaveMane(sex);
            assertEquals(expected, actual);
        }
    }
    @RunWith(Parameterized.class)
    public static class sexNegativeTest {
        private final String sex;
        //private final boolean expected;
        private final Boolean actual;

        public sexNegativeTest(String sex, Boolean actual) {
            this.sex = sex;
            this.actual = actual;
        }

        @Parameterized.Parameters // добавили аннотацию
        public static Object[][] getSex() {
            return new Object[][]{
                    {"Девушка", true},
            };
        }

        @Test(expected = java.lang.Exception.class)
        public void doesHaveManeTest() throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            boolean expected = lion.doesHaveMane(sex);
            assertEquals(expected, actual);
        }
    }
}

