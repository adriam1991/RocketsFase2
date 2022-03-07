public class Main {

    public static void main(String[] args) throws Exception {

        Rocket rocket1 = createRocket1();
        Rocket rocket2 = createRocket2();
        printResult(rocket1);
        printResult(rocket2);
    }

    private static Rocket createRocket2() throws Exception {
        Rocket rocket2 = new Rocket("LDSFJA32");
        assignPowerRocket2(rocket2);
        return rocket2;
    }

    private static Rocket createRocket1() throws Exception {
        Rocket rocket1 = new Rocket("32WESSDS");
        assignPowerRocket1(rocket1);
        return rocket1;
    }

    private static void assignPowerRocket1(Rocket rocket1) {
        rocket1.createPropeller(10);
        rocket1.createPropeller(30);
        rocket1.createPropeller(80);
    }

    private static void assignPowerRocket2(Rocket rocket2) {
        rocket2.createPropeller(30);
        rocket2.createPropeller(40);
        rocket2.createPropeller(50);
        rocket2.createPropeller(50);
        rocket2.createPropeller(30);
        rocket2.createPropeller(10);
    }

    private static void printResult(Rocket rocket) {
        System.out.println("El coet es: " + rocket.getCode());
        System.out.println(rocket.printStatus());
    }
}
