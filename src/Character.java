import java.util.ArrayList;
import java.util.Random;

public class Character {

    // atrebuts
    int hunger = 0;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<>();
    private boolean isAlive;
    public String name;
    Random ran = new Random();

    public Character() {
        isAlive = true;
        words.add("Hello");
        words.add("World");
        words.add("Foo");
        words.add("Bar");
    }

    public void tick() {
        hunger++;
        boredom++;
        if (hunger > 10 || boredom > 10) {
            isAlive = false;
        }
    }

    public void hi() {
        int alSize = words.size();
        int index = ran.nextInt(alSize);
        System.out.println(words.get(index));

    }

    public void teach(String words) {
        System.out.println(name + " learnd " + words);
        this.words.add(words);
        ReduceBoredom();
    }

    public void feed() {
        hunger--;
        tick();
    }

    public void PrintStats() {
        System.out.println("Name:" + name + "|| Hunger: " + hunger + "|| Boredom " + boredom);
    }

    public void ReduceBoredom() {
        boredom--;
    }


}
