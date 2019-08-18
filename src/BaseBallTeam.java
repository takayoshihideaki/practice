
public class BaseBallTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;

    BaseBallTeam(String name, int win, int lose, int draw){
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;

    }
    public String getName(){
        return this.name;
    }
    public int getWin(){
        return  this.win;
    }
    public int getLose(){
        return  this.lose;
    }
    public int getDraw(){
        return this.draw;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setWin(int win){
        this.win = win;
    }
    public void setLose(int lose){
        this.lose = lose;
    }
    public void setDraw(int draw){
        this.draw = draw;
    }
    public double getRate(){
        return (double)getWin() / (getWin() + getLose());
    }
    public void report(){
        System.out.println(getName()+ "  " + "の2017年の成績は" + "  " + getWin() + "勝" + "  " + getLose() + "敗" + "  " + getDraw() + "分、" + "  " + "勝率は" + "  "  + getRate() + "です。");
    }
}
