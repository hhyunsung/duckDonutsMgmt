public class ShiftLead extends Employee {
  public double pennyCount;
  public double nickelCount;
  public double dimeCount;
  public double quarterCount;
  public double centCount;
  
  public double oneCount;
  public double fiveCount;
  public double tenCount;
  public double twentyCount;
  public double fiftyCount;
  public double hundredCount;
  public double otherCount;
  public double dollarCount;
  
  public double totalCount;
  
  public void moneyCount() {
    centCount = pennyCount + nickelCount + dimeCount + quarterCount;
    dollarCount = oneCount + fiveCount + tenCount + twentyCount + fiftyCount + hundredCount;
    totalCount = centCount + dollarCount + otherCount;
  }
}
