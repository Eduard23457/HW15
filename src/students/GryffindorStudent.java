package students;

public class GryffindorStudent extends hogwartsStudent {

    private final int nobility;
    private final int honor;
    private final int bravery;


    public GryffindorStudent(String name, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "GryffindorStudent{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public void compare(GryffindorStudent gryffindorStudent) {
        int sum1 = this.nobility + this.honor + this.bravery;
        int sum2 = gryffindorStudent.getNobility() + gryffindorStudent.getHonor() + gryffindorStudent.getBravery();

        if(sum1 > sum2) {
            System.out.println(name + " лучший Грифиндоровец, чем " + gryffindorStudent.getName());
        }else if (sum1 < sum2) {
            System.out.println(gryffindorStudent.getName() + " лучший Грифиндоровец, чем " + name);
        }else {
            System.out.println(name + " и " + gryffindorStudent.getName() + " оба крутые");
        }
    }
}

