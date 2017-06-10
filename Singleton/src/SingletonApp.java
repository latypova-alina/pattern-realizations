/**
 * Created by alina on 11.06.17.
 */
public class SingletonApp {
    public static void main(String[] args) {
        //Singleton s = Singleton.getInstance();
        //Singleton s2 = Singleton.getInstance();
        final int SIZE = 1000;
        Thread t[] = new Thread[SIZE];

        for(int i=0; i<SIZE; i++){
            t[i] = new Thread(new R());
        }
    }
}

class R implements Runnable{

    @Override
    public void run() {
        Singleton.getInstance();
    }
}

class Singleton{
    public static int counter = 0;
    private static Singleton instance = new Singleton(); //для многопоточности
    private Singleton(){
        counter++; //просто чтоб проверить что синглтон создается один раз.
    }

    public static Singleton getInstance(){ //работает в многопоточности
        return instance;
    }
    /*public static Singleton getInstance(){ //не работает в многопоточности
        if (instance == null){
            instance = new Singleton();
        }
      return instance;
    }*/
}

