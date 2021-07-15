import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main{

public static Bridge bridge = new Bridge();

    public static void main(String[] args) {

        Drawer drawer = new Drawer();
       CarThread1 carThread1 = new CarThread1();
       CarThread2 carThread2 = new CarThread2();

       carThread1.start();
        carThread2.start();



        Drawer.draw();
    }
}