package SuperSample;

public class UseEmployeeSales {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        EmployeeSales sales = new EmployeeSales(10,"방",200);

        //자식 클라스의 필드에 세트
        sales.setAppointment("도쿄해상일동주식회사");

        //부모클래스도 사용가능
        sales.introduce();

        sales.greeting();

        sales.report();

        sales.showVitality();

    }

}
