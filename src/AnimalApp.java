import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> list = new ArrayList<>();
        String str = "yes";
        while (str.equalsIgnoreCase("yes")) {
            Animal animal = new Animal();
            System.out.println("Enter the name of the animal");
            animal.setName(scanner.nextLine());
            System.out.println("Type of animal");
            animal.setType(scanner.nextLine());
            System.out.println("Enter the description");
            animal.setDescription(scanner.nextLine());
            System.out.println("Enter price");
            animal.setPrice(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Is the pet in stock.. true/false");
            animal.setInStock(scanner.nextBoolean());
            scanner.nextLine();
            list.add(animal);
            System.out.println("Do you want to enter more animal");
            str = scanner.nextLine();

        }
        System.out.println();

        for (Animal an:list) {
            System.out.println(an.getPet());
            System.out.println();

        }
    }

}
