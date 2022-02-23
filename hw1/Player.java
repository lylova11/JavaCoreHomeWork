package hw1;

public class Player {

    private String name;
    private int run;
    private int swim;

    public Player(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim(){
        return swim;
    }
}
