import java.util.Scanner;

public class TeamPerformance {

    private String name;
    private int gamesPlayed;
    private int gamesWon;
    private int gamesDrawn;
    private int goalsScored;
    private int goalsConceded;

    //  Default Constructor
    public TeamPerformance() {
        this.name = "";
        this.gamesPlayed = 0;
        this.gamesWon = 0;
        this.gamesDrawn = 0;
        this.goalsScored = 0;
        this.goalsConceded = 0;
    }

    //  Parameterized Constructor
    public TeamPerformance(String name, int gamesPlayed, int gamesWon, int gamesDrawn,
                           int goalsScored, int goalsConceded) {
        this.name = name;
        this.gamesPlayed = gamesPlayed;

        if (gamesPlayed < gamesWon)
            throw new IllegalArgumentException("Games Won can't be more then Games Played");
        this.gamesWon = gamesWon;

        if (gamesPlayed - gamesWon < gamesDrawn)
            throw new IllegalArgumentException("Games Drawn can't be more than Games Played less Games Won");
        this.gamesDrawn = gamesDrawn;

        this.goalsScored = goalsScored;
        this.goalsConceded = goalsConceded;
    }

    //  ToString

    @Override
    public String toString() {
        return "TeamPerformance{\n" +
                "name='" + name + '\'' +
                "\n gamesPlayed=" + gamesPlayed +
                "\n gamesWon=" + gamesWon +
                "\n gamesDrawn=" + gamesDrawn +
                "\n goalsScored=" + goalsScored +
                "\n goalsConceded=" + goalsConceded +
                '}';
    }
}

class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name = ");
        String name = sc.nextLine();

        System.out.print("Enter Total no. of Games Played = ");
        int gamesPlayed = sc.nextInt();

        System.out.print("Enter Total no. of Games Won = ");
        int gamesWon = sc.nextInt();

        System.out.print("Enter Total no. of Games Drawn = ");
        int gamesDrawn = sc.nextInt();

        System.out.print("Enter Games Scored = ");
        int goalsScored = sc.nextInt();

        System.out.print("Enter Total no. of Games Conceded = ");
        int goalsConceded = sc.nextInt();

        try {
            TeamPerformance T = new TeamPerformance(name, gamesPlayed, gamesWon, gamesDrawn,
                    goalsScored, goalsConceded);
            System.out.println(T);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}