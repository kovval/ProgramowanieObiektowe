package Wielowatkowy.MyRun;

public class MyRun extends Runner {
    private int id;
    public MyRun(int id) {this.id = id;}
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            {
                System.out.println("Watek " + id);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}