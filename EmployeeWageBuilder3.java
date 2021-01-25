
public class EmployeeWageBuilder3 {

	int isFullTime=1;
	int isPartTime=2;
	int WagePerHour=20;
	int NoOfHours;

	EmployeeWageBuilder3() {
		System.out.println("Welcome to Employee Wage Computation");

		}

	void EmployeeWage(){

		double empCheck= Math.floor(Math.random() * 10) % 3;

		if(empCheck == isFullTime){
			System.out.println("Employee is Present");
			NoOfHours=8;
			}
		else if (empCheck == isPartTime){
			System.out.println("Employee is Part Time");
			NoOfHours=4;
			}
		else{
			System.out.println("Employee is absent");
			NoOfHours=0;
			}

		int Payment= WagePerHour * NoOfHours;
		System.out.println("Payment is "+Payment);
		}

	public static void main(String args[]) {
		EmployeeWageBuilder3 employee = new EmployeeWageBuilder3();
		employee.EmployeeWage();

		}
}
