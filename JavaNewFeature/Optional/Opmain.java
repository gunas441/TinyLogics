package JavaNewFeature.Optional;

public class Opmain {
    public static void main(String[] args) {
        Person person = new Person("Guna",new Car("Benz",new Insurance("Yes")));

        System.out.println(person.getAllDetails(person));

    }
}
