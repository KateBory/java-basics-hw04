public abstract class Employee implements Payable {
  private String name;
  private String employeeId;
  protected double averageMonthlySalary = 0.00;

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

  public double getAverageMonthlySalary(){
    return averageMonthlySalary;
  }

  @Override
  public String toString() {
    return name + String.format("%.2f", getAverageMonthlySalary());
  }

  @Override
  public void calculatePay() {

  }
}
