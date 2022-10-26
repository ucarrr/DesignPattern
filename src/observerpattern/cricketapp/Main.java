package observerpattern.cricketapp;

public class Main {
    public static void main(String[] args) {

        //Publisher OR Subject
        CricketData cricketData = new CricketData();

        //Observer OR Object
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        // register display(Observers) elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        //cricketData.dataChanged();
        cricketData.setData(85,5,8.5f);
    }
}
