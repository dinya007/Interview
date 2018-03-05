public class WhileTrue {

    public static void main(String[] args) throws InterruptedException {
        Object object = null;
        boolean bool = true;
        while (bool) {
            Thread.currentThread().sleep(50L);
            System.out.println("...");
            object = new Object();
        }
        System.out.println(object);
    }

}
