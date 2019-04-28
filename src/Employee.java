import javax.print.DocFlavor;

public abstract class Employee implements Payable {
  private String name;
  private String employeeId;

  // TODO fix class declaration and declare variables here

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract double getAverageMonthlySalary();



  @Override
  public String toString() {
    // TODO fill in code here and replace the return statement, be sure to format double value
    return name ;
  }

  @Override
  public void calculatePay() {

  }
}
