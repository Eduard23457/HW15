package students;

public abstract class hogwartsStudent {
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

    public abstract int calculatedSpecialAbilitiesSum();

    private int calculatedBasicAbilitiesSum() {
        return powerOfMagic + transgressionDistance;
    }

public void compare (hogwartsStudent hogwartsStudent) {
    int sum1 = calculatedBasicAbilitiesSum();
    int sum2 =  hogwartsStudent.calculatedBasicAbilitiesSum();

    if(sum1 > sum2) {
        System.out.println(name + " лучший студент, чем " + hogwartsStudent.getName());
    }else if (sum1 < sum2) {
        System.out.println(hogwartsStudent.getName() + " лучший студент, чем " + name);
    }else {
        System.out.println(name + " и " + hogwartsStudent.getName() + " оба крутые студента");
    }
}

}


