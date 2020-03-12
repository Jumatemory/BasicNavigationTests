package utilities;

public class Delayer {

    public static void waitTimeGenerator(int second){

        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
