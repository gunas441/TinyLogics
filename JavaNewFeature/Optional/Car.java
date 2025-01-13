package JavaNewFeature.Optional;

import java.util.Optional;

public class Car {
    private String carName;
    private Optional<Insurance> insurance;

    public Car(String carName,Insurance insurance) {
        super();
        this.carName = carName;
        this.insurance = Optional.ofNullable(insurance);
    }

    public String getCarName() {
        return carName;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }
}
