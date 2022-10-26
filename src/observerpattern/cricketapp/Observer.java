package observerpattern.cricketapp;

//Subscriber
public interface Observer {
    public void update(int runs, int wickets,float overs);
}
