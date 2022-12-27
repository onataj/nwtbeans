package Dragon.Treasure;


public class Room {
    private String name, description; //skapar instansvariabler f�r name och description
    private boolean locked;//skapar instansvariabel f�r locked(true eller false)
    private Item item;
    private Monster monster;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

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
    public Room(String name, String description, Monster monster) {
        this.name = name;
        this.description = description;
        this.monster = monster;
        this.locked = false;

    }
    public Room(String name, String description, Item items) {
        this.name = name;
        this.description = description;
        this.item = items;
        this.locked = false;

    }
    public Room(String name, String description, Item items, Monster monster) {
        this.name = name;
        this.description = description;
        this.item = items;
        this.monster = monster;
        this.locked = false;

    }

    @Override
    public String toString() { //String som skriver ut rummets description
        return ""+ description;
    }

    
    
}


