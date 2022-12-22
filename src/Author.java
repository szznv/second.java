public class Author{
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g){
        name=n;
        email=e;
        gender=g;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        if (gender == 'F'){
            return this.name+" (ms) at "+this.email;
        }
        else if (gender == 'M'){
            return this.name+" (mr) at "+this.email;
        }
        else
            return this.name+" (unknown) at "+this.email;
    }
}