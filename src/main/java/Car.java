public class Car extends Thread{
    public int number;
    public int x;
    public int y = 2;
    public String direction;

    Car(){}


    Car(String direction, int x, int number){
        this.direction = direction;
        this.x = x;
        this.number = number;
        Drawer.cars.add(this);
    }

    public void  run() {
        try {
            while (true){

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
