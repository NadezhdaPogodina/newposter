import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.newposter.services.Manager;


public class ManagerTest {


    @Test
    public void firstTest() {

        Manager manager = new Manager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void secondTest() {

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
    public void newTest() {

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

    @Test
    public void Test() {

        Manager manager = new Manager(5);

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moreTest() {

        Manager manager = new Manager();

        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        manager.add("Film4");
        manager.add("Film5");

        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void oneMoreTest() {

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
        manager.add("Film11");
        manager.add("Film12");


        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}