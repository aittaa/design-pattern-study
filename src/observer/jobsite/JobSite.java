package observer.jobsite;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class JobSite implements Subject {

    private final ArrayList<Job> jobs;
    private final ArrayList<Observer> subscribers;


    public JobSite() {
        this.jobs = new ArrayList<Job>();
        this.subscribers = new ArrayList<Observer>();
    }

    public void notifyObservers() {
        for(Observer o : subscribers){
            o.update(jobs);
        }
    }

    public void registerObserver(Observer o) {
        subscribers.add(o);
    }

    public void removeObserver(Observer o) {
        subscribers.remove(o);
    }

    public void appendJob(Job j){
        jobs.add(j);

        notifyObservers();
    }

    public void deleteJob(int idx){
        jobs.remove(idx);

        notifyObservers();
    }

}