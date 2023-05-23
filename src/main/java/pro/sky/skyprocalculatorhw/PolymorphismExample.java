package pro.sky.skyprocalculatorhw;

public class PolymorphismExample {
    public static void main(String[] args) {
        Driver driver = new TruckDriver(
                "Макс",
                "Рокатански",
                "123",
                "2456",
                2);
        driver.setDriverLicenseNumber("1234");
        System.out.println("driver.getDriverLicenseNumber() = " + driver.getDriverLicenseNumber());
    }
}
