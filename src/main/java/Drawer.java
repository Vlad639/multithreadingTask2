import java.util.ArrayList;

class Drawer{
    private static String[] upLine = new String[10];
    private static String[] middleLine = new String[10];
    private static String[] downLine = new String[10];
    public static ArrayList<Car> cars = new ArrayList<>();

    static synchronized void draw(){
        System.out.println("\n\n\n\n\n");
        for (int i = 0; i < 10; i++){
            upLine[i] = "--";
            middleLine[i] = "--";
            downLine[i] = "--";
        }

        upLine[2] = "ШШ";
        upLine[3] = "ШШ";
        upLine[4] = "ШШ";

        downLine[2] = "ШШ";
        downLine[3] = "ШШ";
        downLine[4] = "ШШ";

        //System.out.println("--------------------");
        for (Car car: cars) {
            if (car.x >= 0 && car.x < 10){
                if (car.direction.equals("right") && car.y == 2){
                    downLine[car.x] =  car.number + ">";
                }

                if (car.direction.equals("right") && car.y == 1){
                    middleLine[car.x] = car.number +">";
                }

                if (car.direction.equals("left") && car.y == 2){
                    upLine[car.x] =  "<" + car.number;
                }

                if (car.direction.equals("left") && car.y == 1){
                    middleLine[car.x] = "<" + car.number;
                }

            }
        }


        for (int i = 0; i < 10; i++)
            System.out.print(upLine[i]);
        System.out.println();

        for (int i = 0; i < 10; i++)
            System.out.print(middleLine[i]);
        System.out.println();

        for (int i = 0; i < 10; i++)
            System.out.print(downLine[i]);
        System.out.println();
        System.out.println(Main.bridge.bridgeFree);


    }

}
