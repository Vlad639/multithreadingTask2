import java.util.Deque;
import java.util.LinkedList;

public class CarThread2 extends Thread{

    public static Deque<Car> dequeCars = new LinkedList<>();



    public void move(Car car) throws Exception {

        if (car.x < 6){
            Main.bridge.toBridge(car);
        }


        if (car.x > 5 || car.x < 3){
            car.x--;
        }



    }




    public void run(){
        dequeCars.addLast(new Car("left", 7, 3));
        dequeCars.addLast(new Car("left", 8, 4));

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
