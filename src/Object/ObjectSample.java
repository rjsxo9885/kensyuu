package Object;

public class ObjectSample {

    public static void main(String[] args) {

       Employee emp = new Employee();

       emp.employeeName = "홍길동";
       emp.divisionName = "총무부";
       emp.vitality = 100;
       emp.introduce();
       emp.greeting();
       emp.showVitality();

       Employee emp01 = new Employee("방건태","전산부",200);

       emp01.introduce();
       emp01.greeting();
       emp01.showVitality();


    }
}
