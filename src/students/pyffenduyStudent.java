package students;

public class pyffenduyStudent extends hogwartsStudent{

    private final int hardworking;
    private final int loyal;
    private final int honest;

    public pyffenduyStudent(String name, int powerOfMagic, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, powerOfMagic, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "pyffenduyStudent{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", transgressionDistance=" + transgressionDistance +
                ", powerOfMagic=" + powerOfMagic +
                '}';
    }
}
