
public class Review03 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ", 67, 45, 8);
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース", 60, 53, 7);
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ", 60, 55, 5);
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ", 56, 58, 6);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ", 52, 56, 12);
        BaseBallTeam swallows = new BaseBallTeam("東京ヤクルトスワローズ", 41, 69, 10);

        giants.report();
        tigers.report();
        dragons.report();
        baystars.report();
        carp.report();
        swallows.report();
    }

}
