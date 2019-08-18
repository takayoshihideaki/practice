
public class Syohai {

    public static void main(String[] args) {

        BaseBallTeam hiroshima = new BaseBallTeam("広島東洋カープ",88,51,4);
        BaseBallTeam hanshin = new BaseBallTeam("阪神タイガース",78,61,4);
        BaseBallTeam yokohama = new BaseBallTeam("横浜DeNAベイスターズ",73,65,5);
        BaseBallTeam yomiuri = new BaseBallTeam("読売ジャイアンツ",72,68,3);
        BaseBallTeam chunichi = new BaseBallTeam("中日ドラゴンズ",59,79,5);
        BaseBallTeam tokyo = new BaseBallTeam("東京ヤクルト",45,96,2);


        hiroshima.report();
        hanshin.report();
        yokohama.report();
        yomiuri.report();
        chunichi.report();
        tokyo.report();
    }

}
