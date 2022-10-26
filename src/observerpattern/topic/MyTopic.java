package observerpattern.topic;

import java.util.ArrayList;
import java.util.List;

//Publisher = Subject
public class MyTopic implements Subject {

    List<Observer> observers;
    private String message;
    private boolean changed;
    private final Object MUTEX = new Object();

    public MyTopic() {
        this.observers = new ArrayList<>();
    }


    /**
     * Basitçe, aynı anda çalışan birden fazla thread veya process
     * sıralı olmasını ve birbiri ile iletişim halinde çalışmasını sağlar.
     * @param o
     * Bir metodun eşlemeli olması durumunda metottaki bütün işlemler,
     * bu metodu çağıran threads tarafından sırayla yapılır.
     * Yani bir thread bu metodu çalıştırırken bir diğeri beklemek zorundadır.
     */
    @Override
    public void register(Observer o) {
        if (o == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(o)) observers.add(o);
        }
    }

    @Override
    public void unregister(Observer o) {
        synchronized (MUTEX) {
            observers.remove(o);
        }

    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        //synchronization is used to make sure any observer registered after message is received is not notified
        /*
        * senkronizasyon, mesaj alındıktan sonra kaydedilen
         herhangi bir gözlemcinin bilgilendirilmemesini sağlamak için kullanılır.
        * */
        synchronized (MUTEX) {
            if (!changed)
                return;
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }
        for (Observer o : observersLocal) {
            o.update();
        }

    }

    @Override
    public Object getUpdate(Observer o) {
        return this.message;
    }

    //method to post message to the topic
    public void postMessage(String message) {
        System.out.println("Message Posted to Topic:" + message);
        this.message = message;
        this.changed = true;
        notifyObservers();
    }

}
