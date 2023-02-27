import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.newposter.services.Manager;


public class ManagerTest {


    @Test
    public void test() {
        Manager manager = new Manager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");


        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5", "Film6"};
        String[] actual = manager.allFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void secondTest() {

        Manager manager = new Manager(6);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");

        String[] expected = {"Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void thirdTest() {

        Manager manager = new Manager(10);
        manager.setResultLength(5);
        int expected = 5;
        int actual = manager.getResultLength();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void newTest() {

        Manager manager = new Manager();
        manager.setResultLength(11);

        int expected = 10;
        int actual = manager.getResultLength();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Test() {

        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");
        manager.add("Film6");
        manager.add("Film7");
        manager.add("Film8");
        manager.add("Film9");
        manager.add("Film10");


        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}




