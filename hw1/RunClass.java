package hw1;

import hw1.Course;
import hw1.Player;

public class RunClass {

    public static void main(String[] args) {
        Player[] players = new Player[4];
        players[0] = new Player("Борис", 100, 50);
        players[1] = new Player("Иван", 200, 100);
        players[2] = new Player("Алексей", 300, 300);
        players[3] = new Player("Олег", 400, 10);
        Team team = new Team("Спортсмены", players);

        Course course = new Course(200, 100);
        String result = course.doIt(team);
        System.out.println(result);


    }
}