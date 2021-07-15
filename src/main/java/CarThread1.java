import java.util.Deque;
import java.util.LinkedList;

public class CarThread1 extends Thread{

    public static Deque<Car> dequeCars = new LinkedList<>();



    public void move(Car car) throws Exception {

        if (car.x > 0){
            Main.bridge.toBridge(car);
        }

        if (car.x < 1 || car.x > 3){
            car.x++;
        }


    }


    public void run(){
        dequeCars.addLast(new Car("right", 1, 0));
        dequeCars.addLast(new Car("right", 0, 1));
        dequeCars.addLast(new Car("right", -1, 2));

        for (Car elem: dequeCars){
            elem.start();
        }

        try{
            while (true){
                sleep(1000);
                if (!dequeCars.isEmpty())
                for (Car elem: dequeCars){
                    move(elem);
                }

                Drawer.draw();
                
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
