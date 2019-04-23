public class ContractedEmployee extends Employee{
  private  String federalTaxId;
  private double numberOfHoursWorked;


  // TODO fix class declaration and declare variables here

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;

    // TODO fill in code here
  }

  public String getFederalTaxId() {
    // TODO fill in code here and replace the return statement
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
    // TODO fill in code here
  }

  public double getHourlyRate() {
    // TODO fill in code here and replace the return statement
    return 0;
  }
  @Override
  public double getAverageMonthlySalary() {
    // TODO fill in code here and replace the return statement
    return 0;//fixedMonthlyPayment;
  }

  public void setHourlyRate(double hourlyRate) {
    // TODO fill in code here
  }

  public double getNumberOfHoursWorked() {
    // TODO fill in code here and replace the return statement
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    // TODO fill in code here
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  // TODO fill in code here
}
