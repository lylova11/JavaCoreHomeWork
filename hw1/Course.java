package hw1;

public class Course {
    String result;
    private int run;
    private int swim;


    public Course(int run, int swim) {
        this.run = run;
        this.swim = swim;

    }

    public String doIt(Team team){
        result = "Название команды: "+ team.getName()+ " " + '\n';
        for(Player player : team.getPeoples()){
            result += "Имя игрока: " + player.getName()+ " " + '\n';
            int value = player.getRun();
            run(value);

            int Value = player.getSwim();
            swim(Value);

        }

        return result;
    }

    private Course run(int value){
        if(value<run) result += "Бег - пробежал "+ '\n';
        return this;

    }


    private Course swim(int Value){
        if(Value<swim) result += "Плавание - проплыл "+ '\n';
        return this;
    }



}
