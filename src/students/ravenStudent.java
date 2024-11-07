package students;

public class ravenStudent extends hogwartsStudent{

    private final int smart;
    private final int wise;
    private final int witty;
    private final int creative;

    public ravenStudent(String name, int powerOfMagic, int transgressionDistance, int smart, int wise, int witty, int creative) {
        super(name, powerOfMagic, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    @Override
    public String toString() {
        return "ravenStudent{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
