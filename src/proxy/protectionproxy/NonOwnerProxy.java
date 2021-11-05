package proxy.protectionproxy;

public class NonOwnerProxy implements PersonBean{

    PersonBean person;

    public NonOwnerProxy(PersonBean person) {
        this.person = person;
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public String getGender() {
        return person.getGender();
    }

    @Override
    public String getInterests() {
        return person.getInterests();
    }

    @Override
    public int getHotOrNotRating(){
        return person.getHotOrNotRating();
    }

    @Override
    public void setName(String name) {
        try {
            throw new IllegalAccessException();
        } catch (Exception e){
            System.out.println("Can't set Name from non owner proxy");
        }
    }

    @Override
    public void setGender(String gender){
        try {
            throw new IllegalAccessException();
        } catch (Exception e){
            System.out.println("Can't set Gender from non owner proxy");
        }
    }

    @Override
    public void setInterests(String interests){
        try {
            throw new IllegalAccessException();
        } catch (Exception e){
            System.out.println("Can't set Interests from non owner proxy");
        }
    }

    @Override
    public void setHotOrNotRating(int rating){
        person.setHotOrNotRating(rating);
    }

}
