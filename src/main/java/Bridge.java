import static java.lang.Thread.sleep;

public class Bridge {
    public boolean bridgeFree = true;

    public synchronized void toBridge(Car car) throws Exception {
        bridgeFree = false;



        while (true){
            bridgeFree = false;
            sleep(1000);
            car.y = 1;
            if (car.direction.equals("right")){
                if (car.x > 3){
                    car.y = 2;
                    bridgeFree = true;
                    break;
                }
                car.x++;
            }

            if (car.direction.equals("left")){
                if (car.x < 3){
                    car.y = 2;
                    bridgeFree = true;
                    break;
                }
                car.x--;
            }

            Drawer.draw();

        }
        //bridgeFree = false;
    }

    public synchronized void outBridge () throws Exception {
        //bridgeFree = true;
    }


}
