package Thread;

public class DeadLockAssignment {

    static final Object PEN = new Object();
    static final Object PAPER = new Object();

    static final Object SAFE_PEN = new Object();
    static final Object SAFE_PAPER = new Object();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("----- PHASE 1 : DEADLOCK SCENARIO -----");

        Thread martinDeadlock = new Thread(() -> {
            synchronized (PEN) {
                System.out.println("Martin using Pen waiting for Paper");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (PAPER) {
                    System.out.println("Martin completed assignment");
                }
            }
        });

        Thread davidDeadlock = new Thread(() -> {
            synchronized (PAPER) {
                System.out.println("David using Paper waiting for Pen");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (PEN) {
                    System.out.println("David completed assignment");
                }
            }
        });

        martinDeadlock.start();
        davidDeadlock.start();

        Thread.sleep(2000);

        System.out.println("\n----- PHASE 2 : DEADLOCK RESOLUTION -----");

        Thread martinSafe = new Thread(() -> {
            synchronized (SAFE_PEN) {
                System.out.println("Martin picked Pen");
                synchronized (SAFE_PAPER) {
                    System.out.println("Martin picked Paper");
                }
            }
        });

        Thread davidSafe = new Thread(() -> {
            synchronized (SAFE_PEN) {
                System.out.println("David picked Pen");
                synchronized (SAFE_PAPER) {
                    System.out.println("David picked Paper");
                }
            }
        });

        martinSafe.start();
        davidSafe.start();
    }
}



