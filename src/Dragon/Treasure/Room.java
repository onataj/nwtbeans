package Dragon.Treasure;


public class Room {
    private String name, description; //skapar instansvariabler för name och description
    private boolean locked;//skapar instansvariabel för locked(true eller false)
    
//skapar getters och setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
    //konstruktor initialiserar parameterar med respektive variabel
    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.locked = false;

    }

    @Override
    public String toString() { //String som skriver ut rummets description
        return ""+ description;
    }

}