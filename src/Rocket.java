import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String code;
    public List<Propeller> powerPropellants = new ArrayList<>();


    public Rocket(String code) {
        this.code = code;
    }

    public String printStatus() {
        String result = "";
        int i = 1;
        for (Propeller propeller : powerPropellants) {
            result += "Propulsor " + i + " :" + propeller.getPower() + " potencia\n";
            i++;
        }
        return result;
    }

    public void addPower(int i) throws Exception {
        powerPropellants.add(createPropeller(i));
    }

    private Propeller createPropeller(int power) throws Exception {
        Propeller propeller = new Propeller();
        propeller.addPower(power);
        return propeller;
    }

    public String getCode() {
        return code;
    }

}
