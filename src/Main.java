import students.GryffindorStudent;

public class Main {
    public static void main(String[] args) {
        GryffindorStudent harryPotter = new GryffindorStudent("Harry", 100, 100,100, 100, 100);
       GryffindorStudent hermioneGranger = new GryffindorStudent("Гермиона", 99, 99,99,99, 99);
       harryPotter.compare(hermioneGranger);

    }
}