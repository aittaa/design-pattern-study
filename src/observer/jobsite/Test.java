package observer.jobsite;


public class Test {

    public static void main(String[] args) {

        JobSite jobSite = new JobSite();
        Subscriber subs = new Subscriber(jobSite);

        System.out.println("jobSite.appendJob(job)");
        jobSite.appendJob(new Job("식기청소 아르바이트 모집합니다", "학생식당", "시급 많이드릴게요", 10));
        System.out.println("jobSite.appendJob(job)");
        jobSite.appendJob(new Job("ZS95 아르바이트 모집합니다", "학교앞", "시급 10만원", 1));

        System.out.println("jobSite.deleteJob(0)");
        jobSite.deleteJob(0);


    }

}