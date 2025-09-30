
public class intro_1 {
    public static void main(String[] args) {
        World world = new World();
        Thread thread = new Thread(world);
        thread.start();
        for (;;) // this is called infinite loop
        {
            System.out.println("Hello");
        }

    }

}
// Their are total two ways to create a new thread in java.
// 1.) Through extend the thread class ---> Make run method (override wala) -->
// Make object of thread class in main file --> And run start method.
// 2.) Through implement Runnable Interface ---> same step --> But noew in main
// class we have to create the object of class which we made and object of
// thread class also to run the program --> Then using start method run the
// program