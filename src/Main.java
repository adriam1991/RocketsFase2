public class Main {

    public static void main(String[] args) throws Exception {

        Rocket rocket1 = new Rocket("32WESSDS");
        Rocket rocket2 = new Rocket("LDSFJA32");
        assignPowerRocket1(rocket1);
        assignPowerRocket2(rocket2);
        printResult(rocket1, rocket2);
    }

    private static void assignPowerRocket1(Rocket rocket1) throws Exception {
        rocket1.addPower(10);
        rocket1.addPower(30);
        rocket1.addPower(80);
    }

    private static void assignPowerRocket2(Rocket rocket2) throws Exception {
        rocket2.addPower(30);
        rocket2.addPower(40);
        rocket2.addPower(50);
        rocket2.addPower(50);
        rocket2.addPower(30);
        rocket2.addPower(10);
    }

    private static void printResult(Rocket rocket1, Rocket rocket2) {
        System.out.println("El primer coet es: " + rocket1.getCode());
        System.out.println(rocket1.printStatus());
        System.out.println("El segon coet es: " + rocket2.getCode());
        System.out.println(rocket2.printStatus());
    }
}
