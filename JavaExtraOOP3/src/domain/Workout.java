package domain;

public class Workout {
    // attributes
    private int ID;
    private String name;
    private int runtime;
    private Level difficulty;
    private String description;
    
    // constructors
    public Workout() {
    }

    public Workout(int ID, String name, int runtime, Level difficulty, String description) {
        this.ID = ID;
        this.name = name;
        this.runtime = runtime;
        this.difficulty = difficulty;
        this.description = description;
    }

    
    // getters & setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public Level getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Level difficulty) {
        this.difficulty = difficulty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
