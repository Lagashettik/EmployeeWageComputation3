
public class EmployeeWageBuilder3 {

	int WagePerHour=20;
	int NoOfHours;
	int TotalHours=100;	// Max working Hours is 100 in One Month
	int TotalDays=20;	// Max Days in Month is 20 Days
	int day=1;

	EmployeeWageBuilder3() {
		System.out.println("Welcome to Employee Wage Computation");

		}

	void EmployeeWage(){

	while(day<=TotalDays) {
		int empCheck=(int) Math.floor(Math.random() * 10) % 3;

		switch (empCheck) {
		case 1:
			NoOfHours+=8;
			break;
		case 2:
			NoOfHours+=4;
			break;
			}

			day++;

		if( TotalHours<= NoOfHours) 
				break;

		}
	int Payment= WagePerHour * NoOfHours;
		System.out.println("Payment is "+Payment);
		}
	public static void main(String args[]) {
		EmployeeWageBuilder3 employee = new EmployeeWageBuilder3();
		employee.EmployeeWage();

		}
}
