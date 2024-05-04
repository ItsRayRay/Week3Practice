public class CrewMember {

    private String name;
    private String role;


    // constructor

    public CrewMember(String name, String role) {
        setName(name);
        setRole(role);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getCrewName(){
        return name;
    }

    public String getCrewRole() {
        return role;
    }

}
