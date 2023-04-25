import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class classes_Test {
    classes.Planet testing = new classes.Planet("Earth",3958.8,93.497);

    @Test
    public void getName_wrong() {
        Assertions.assertEquals("Eart", testing.getName());
    }
    @Test
    public void getSizeRadius_wrong(){
        Assertions.assertEquals(4100.4, testing.getSizeRadius());
    }
    @Test
    public void getName() {
        Assertions.assertEquals("Earth", testing.getName());
    }
    @Test
    public void getSizeRadius(){
        Assertions.assertEquals(3958.8, testing.getSizeRadius());
    }
}