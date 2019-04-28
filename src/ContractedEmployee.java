import java.util.Locale;

public class ContractedEmployee extends Employee{
  private  String federalTaxId;
  private double numberOfHoursWorked;
  private double hourlyRate;


  // TODO fix class declaration and declare variables here

  public ContractedEmployee(String employeeId, String name, String federalTaxId) {
    super(employeeId, name);
    this.federalTaxId = federalTaxId;
  }

  public String getFederalTaxId() {
    return federalTaxId;
  }

  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }

  public double getHourlyRate() {
    return hourlyRate;
  }
  @Override
  public double getAverageMonthlySalary() {
    return hourlyRate * numberOfHoursWorked;
  }

  public void setHourlyRate(double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  public double getNumberOfHoursWorked() {
    return numberOfHoursWorked;
  }

  public void setNumberOfHoursWorked(double numberOfHoursWorked) {
    this.numberOfHoursWorked = numberOfHoursWorked;
  }

  public String toString() {
    return super.toString() + String.format(Locale.ENGLISH, "%.2f", getAverageMonthlySalary());
  }
}
