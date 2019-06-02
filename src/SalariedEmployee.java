import java.util.Locale;

public class SalariedEmployee extends Employee {
  private String socialSecurityNumber;
  private double fixedMonthlyPayment;
  // TODO fix class declaration and declare variables here

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    // TODO fill in code here and replace the return statement
    return socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment(){
    return fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
    // TODO fill in code here
  }

  // TODO fill in code here

  public String toString() {
    return super.toString() + String.format(Locale.ENGLISH, "%.2f",fixedMonthlyPayment);
  }

  @Override
  public void calculatePay(){
    averageMonthlySalary = fixedMonthlyPayment;
  }
}
