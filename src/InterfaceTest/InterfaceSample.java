package InterfaceTest;

public class InterfaceSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        EmployeeSalesInterface emp01 = new EmployeeSalesInterface();
        EmployeeSystemInterface emp02 = new EmployeeSystemInterface();

        emp01.greeting();
        emp02.greeting();

    }

    static void newGreeting(InterfaceEmployee employee) {
        System.out.println("폴리모피즘입니다");
        employee.greeting();
    }

}
