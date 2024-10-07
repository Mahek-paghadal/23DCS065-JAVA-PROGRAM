class Mythread extends Thread
{
    int count=0;
    public void run() {

        while (true)
        {
            count++;
            System.out.println(count);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();

            }


        }
    }
}


public class Practical_35 {
    public static void main(String[] args) {

        Mythread t = new Mythread();
        t.start();
    }
}
