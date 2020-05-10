package exercises.technology.main;

public class AbstractEntity {
    private int id = 1;
    private static int nextId = 1;

    public AbstractEntity() {
        this.id = id + nextId;
        nextId ++;
    }

    public int getId() {
        return id;
    }
}
