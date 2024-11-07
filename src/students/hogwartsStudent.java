package students;

public class hogwartsStudent {
    protected final String name;
    protected final int powerOfMagic;
    protected final int transgressionDistance;

    public String getName() {
        return name;
    }

    public hogwartsStudent(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }
}
