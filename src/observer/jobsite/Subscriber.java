package observer.jobsite;


import java.util.ArrayList;

public class Subscriber implements Observer {

    private final ArrayList<Job> jobs = new ArrayList<Job>();

    private final Subject jobSite;

    public Subscriber(Subject jobSite) {
        this.jobSite = jobSite;
        jobSite.registerObserver(this);
    }

    public void unSubscribe(){
        jobSite.removeObserver(this);
    }

    public void displayJobINF() {
        System.out.println("Subscriber : displayJobINF()");
        for(int i = 0 ; i < jobs.size(); i++){
            System.out.print("================ idx:" + i + " ================\n" + jobs.get(i).toString());
        }
        System.out.println();
    }

    public void update(ArrayList<Job> jobs) {
        System.out.println("Subscriber : update()");
        this.jobs.clear();
        this.jobs.addAll(jobs);
        displayJobINF();
    }

}