package Object;

public class Employee {

    public String employeeName  ;    // 社員名
    public String divisionName  ; // 部署名
    public int vitality ;           // 体力

    public Employee() {
        System.out.println("インスタンス化時にコンストラクタが呼ばれました");
        employeeName = "未設定";
        divisionName = "営業部";
        vitality = 0;
    }
    public  Employee(String employeeName,String divisionName,int vitality) {
        System.out.println("인스턴스 시에 인수가 있는 생성자가 호출되었습니다");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;


    }
    public void introduce() {
        vitality= vitality -10;
        System.out.println("저의 이름은 "+employeeName+"입니다");
        System.out.println("소속 부서는"+divisionName+"입니다");

    }

 // 挨拶をするメソッド
    public void greeting() {
        vitality = vitality - 10;
        System.out.println("안녕하세요");
    }

    // 報告するメソッド
    public void report() {
        vitality = vitality - 10;
        System.out.println("오늘은 10포인트 벌었습니다");
    }

    // 残り体力を知らせるメソッド
    public void showVitality() {
        vitality = vitality - 10;
        System.out.println("남은 체력은:" + vitality);
    }

    // 出勤するメソッド
    public void goToWork() {

    }

    // 退勤するメソッド
    public void leaveWork() {

    }
}
