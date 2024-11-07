package students;

public class slytherin extends hogwartsStudent{

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;


    public slytherin(String name, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                ", powerOfMagic=" + powerOfMagic +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    @Override
    public int calculatedSpecialAbilitiesSum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compare(slytherin slytherin) {
        int sum1 = calculatedSpecialAbilitiesSum();
        int sum2 =  slytherin.calculatedSpecialAbilitiesSum();

        if(sum1 > sum2) {
            System.out.println(name + " лучший Слизеринец, чем " + slytherin);
        }else if (sum1 < sum2) {
            System.out.println(slytherin.getName() + " лучший Слизеринец, чем " + name);
        }else {
            System.out.println(name + " и " + slytherin.getName() + " оба крутые Слизеринца");
        }
    }
}
