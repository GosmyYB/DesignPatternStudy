package observer;

/**
 * Created by wyb on 17/2/13.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
