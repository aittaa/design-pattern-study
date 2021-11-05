package proxy.protectionproxy;

public class OwnerProxy implements PersonBean  {

    PersonBean person;

    public OwnerProxy(PersonBean person) {
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
        person.setName(name);
    }

    @Override
    public void setGender(String gender){
        person.setGender(gender);
    }

    @Override
    public void setInterests(String interests){
        person.setInterests(interests);
    }

    @Override
    public void setHotOrNotRating(int rating){
        try {
            throw new IllegalAccessException();
        }catch(Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
    }
}
