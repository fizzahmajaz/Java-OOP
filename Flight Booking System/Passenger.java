public class Passenger{
    String name;
    String email;

    public Passenger(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String toString(){
        return "Passenger{" + "Name='" + name + '\'' + ", Email='" + email + '\'' + '}';
    }
}