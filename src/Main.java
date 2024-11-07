import students.GryffindorStudent;
import students.slytherin;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Harry", 100, 100,100, 100, 100);
        System.out.println(harryPotter);
       GryffindorStudent hermioneGranger = new GryffindorStudent("Гермиона", 99, 99,99,99, 99);
       harryPotter.compare(hermioneGranger);

        slytherin drakoMalfoi = new slytherin("Драко", 67, 80, 66, 56, 56, 67, 45);
        drakoMalfoi.compare(harryPotter);
    }
}