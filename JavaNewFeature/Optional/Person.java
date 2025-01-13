package JavaNewFeature.Optional;

import java.util.Optional;

public class Person {
    private String name;
    private Optional<Car> car;

    public Person(String name,Car car) {
        super();
        this.name = name;
        this.car = Optional.ofNullable(car);
    }
    public String getName() {
        return name;
    }
    public Optional<Car> getCar() {
        return car;
    }

    public String getAllDetails(Person person){
        Optional<Person> opp=Optional.of(person);
        return opp.flatMap(Person::getCar).flatMap(Car::getInsurance)
                .map(Insurance::getInsuranceName).orElse("Some is missing");
    }

}
