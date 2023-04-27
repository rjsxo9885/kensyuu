
public class BaseBallTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public int getWin() {
        return win;
    }

    public int getLose() {
        return lose;
    }

    public int getDraw() {
        return draw;
    }

    public double getRate() {
        return (double) win / (win + lose);
    }

    public void report() {
        System.out.printf("%s の2020年の成績は %d勝 %d敗 %d分、勝率は %.15fです。\n", name, win, lose, draw, getRate());
    }
}
