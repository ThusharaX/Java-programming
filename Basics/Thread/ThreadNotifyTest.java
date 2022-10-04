public class ThreadNotifyTest {

    public static void main (String args[]) {

        ThreadNotifyTest threadnotifytest = new ThreadNotifyTest();

        Thread t1 = new Thread1(threadnotifytest, "New Thread1");
        Thread t2 = new Thread2(threadnotifytest, "New Thread2");
        Thread t3 = new Thread3(threadnotifytest, "New Thread3");

        t1.start();
        t2.start();
        t3.start();





    }




}