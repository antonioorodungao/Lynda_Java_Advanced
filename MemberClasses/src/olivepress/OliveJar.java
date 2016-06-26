package olivepress;

import java.util.ArrayList;

/**
 * Created by Oro on 6/24/2016.
 */
public class OliveJar {

    public ArrayList<Olive> olives = new ArrayList<Olive>();

    {
        olives.add(new Olive("Golden Olive", 0x1233d));
    }

    public OliveJar(){
        System.out.println("Olive jar constructor.");
    }

    public void addOlive(String oliveName, long color){
        olives.add(new Olive(oliveName, color));
    }

    public void reportOlives(){
        class JarLid{
            public void open(){
                System.out.println("Twist Twist Pop.");
            }
        }
        new JarLid().open();

        new Object(){
            public void open(){
                System.out.println("Twist Twist Pop.");
            }
        }.open();
        for(Olive olive: olives){

            System.out.println(olive);

        }
    }

    @Override
    public String toString() {
        String val = "";
        for (Olive o: olives
             ) {
            val = val + " " + o.toString();

        }
        return  val;
    }

    class Olive {

        String name;
        long color;

        public Olive(String name, long color){
            this.name = name;
            this.color = color;

        }

        public Olive(){
            System.out.println("Olive constructor...");
        }

        @Override
        public String toString() {
            return name + " " + color;
        }
    }

}
