package olivepress;

/**
 * Created by Oro on 6/24/2016.
 */
public class Main {

    public static void main(String[] args) {

        OliveJar oliveJar = new OliveJar();

        oliveJar.addOlive("Kalamata", 0x0000000);
        oliveJar.addOlive("Kalamata", 0x0000000);
        oliveJar.addOlive("Kalamata", 0x0000000);
        oliveJar.addOlive("Kalamata", 0x0000000);
        oliveJar.reportOlives();
    }
}
