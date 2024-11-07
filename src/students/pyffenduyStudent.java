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

    @Override
    public int calculatedSpecialAbilitiesSum() {
        return hardworking + loyal + honest;
    }
    public void compare(pyffenduyStudent pyffenduyStudent) {
        int sum1 = calculatedSpecialAbilitiesSum();
        int sum2 =  pyffenduyStudent.calculatedSpecialAbilitiesSum();

        if(sum1 > sum2) {
            System.out.println(name + " лучший Пуфендуец, чем " + pyffenduyStudent);
        }else if (sum1 < sum2) {
            System.out.println(pyffenduyStudent.getName() + " лучший Пуфедуец, чем " + name);
        }else {
            System.out.println(name + " и " + pyffenduyStudent.getName() + " оба крутые Пуфендуйцы");
        }
    }
}
