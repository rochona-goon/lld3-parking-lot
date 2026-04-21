package Models;

public class Operator{
    private int employeeId;
    private String operatorName;

//    public Operator(String operatorName) {
//        this.operatorName = operatorName;
//    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
