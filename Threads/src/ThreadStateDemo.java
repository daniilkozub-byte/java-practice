public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()-> {
            for (int i = 5; i >= 1; i--){
                System.out.println("Залишилось: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Час вийшов!");
        });

        thread.start();


    }
}

