public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 5; i >= 1; i--){
            System.out.println("Залишилось: " + i);
            Thread.sleep(1000);
        }


    }
}

