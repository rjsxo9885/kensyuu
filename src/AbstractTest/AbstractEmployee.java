package AbstractTest;

public abstract class AbstractEmployee {

    private String employeeName;

    public abstract void greeting() ;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
