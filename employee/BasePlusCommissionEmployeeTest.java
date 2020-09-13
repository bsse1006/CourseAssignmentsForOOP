// Fig. 9.7: BasePlusCommissionEmployeeTest.java
// BasePlusCommissionEmployee test program.
public class BasePlusCommissionEmployeeTest
{
public static void main( String[] args )
{
// instantiate BasePlusCommissionEmployee object
BasePlusCommissionEmployee employee =
new BasePlusCommissionEmployee(
"Bob", "Lewis", "333-33-3333", 5000, .04, 300 );
// get base-salaried commission employee data
System.out.println(
"Employee information obtained by get methods: \n" );
System.out.println( "%s %s\n"+ "First name is"+
employee.getFirstName() );
System.out.println( "%s %s\n"+ "Last name is"+
employee.getLastName() );
System.out.println( "%s %s\n"+ "Social security number is"+
employee.getSocialSecurityNumber() );
System.out.println( "%s %.2f\n"+ "Gross sales is"+
employee.getGrossSales() );
System.out.println( "%s %.2f\n"+ "Commission rate is"+
employee.getCommissionRate() );
System.out.println( "%s %.2f\n"+ "Base salary is"+
employee.getBaseSalary() );
employee.setBaseSalary( 1000 ); // set base salary
System.out.println( "\n%s:\n\n%s\n"+
"Updated employee information obtained by toString"+
employee.toString() );
} // end main
} // end class BasePlusCommissionEmployeeTest