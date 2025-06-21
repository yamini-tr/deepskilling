public class SingletonExample {

    private static SingletonExample instance;


    private SingletonExample() {
        System.out.println("Singleton instance created");
    }


    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }


    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {

        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();

        s1.showMessage();


        if (s1 == s2) {
            System.out.println("Both instances are the same!");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
