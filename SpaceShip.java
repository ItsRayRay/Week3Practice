public class SpaceShip {
    // Class attributes
    private String name;
    private int maxCrew;
    private int currentCrew;
    private double fuelLevel;

    // Constructor
    public SpaceShip(String name, int maxCrew) {
        setName(name);
        this.maxCrew = maxCrew;
        this.currentCrew = 0;  // initializing with default values
        this.fuelLevel = 0.0;  // initializing with default values
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCurrentCrew() {
        return currentCrew;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentCrew(int currentCrew) {
        this.currentCrew = currentCrew;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    // Method to display spaceship details
    public void displayDetails() {
        System.out.println("Name: " + getName() + ", Max Crew: " + maxCrew + ", Current Crew: " + getCurrentCrew() + ", Fuel Level: " + getFuelLevel());
    }

    // Corrected method to display crew role
    public void displayDetailsCrew(CrewMember member) {
        System.out.println("Crew Name: " + member.getCrewName());
        System.out.println("Crew Role: " + member.getCrewRole());
    }

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip("Pointy", 500);

        ship.setCurrentCrew(150);

        ship.setFuelLevel(75.5);


        CrewMember Captain = new CrewMember("Raymond", "Captain");

        CrewMember Copilot  = new CrewMember("Junior", "Co-pilot");


        // pass the member to print details
        ship.displayDetailsCrew(Captain);

        ship.displayDetails();// Correctly displays crew member details
    }
}
