package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter What You can do");
		System.out.println("\n 1 = Insert Data  2 = Read Data  3 = Update Data  4 = Delete Data");
		
		int choice = sc.nextInt();
		
		if (choice<1 || choice>4) {
			System.out.println("Invalid Input please enter Valid input...");
		}
		
		switch (choice) {
		case 1: {
			System.out.println("You are in Insert Operation...\nEnter");
			System.out.println("\nEmployee Id \nEmployee Name \nEmployee Salary \nEmployee Present or not(1 or 0)");
			
			int eid = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			double salary = sc.nextDouble();
			boolean isPresent = false;
			int ispresent = sc.nextInt();
			if (ispresent==1) {
				boolean present=true;
				 isPresent = present;	
			}else if(ispresent==0) {
				boolean present=false;
				 isPresent = present;
			}else {
				System.out.println("Invalid Input");
			}
			
			Employee e1 = new Employee(eid,name,salary,isPresent);
			EmployeeDao.createEmployee(e1);

		}
		break;
		case 2: {
			System.out.println("You are in Read Operation...\n");
			
			EmployeeDao.ReadData();
		}
		break;
		case 3: {
			System.out.println("You are in Update Operation...\nEnter what You Can Update");
			System.out.println("1 = Employee Name  2 = Employee Salary  3 = Employee Present or not");
			
			int innerChoice = sc.nextInt();
			switch (innerChoice) {
			case 1: {
				System.out.println("Enter ID And Name Of Employee");
				
				int eid = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				
				EmployeeDao.updateEmployeeName(eid,name);
			}
			break;
			case 2: {
				System.out.println("Enter ID And Salary Of Employee");
				
				int eid = sc.nextInt();
				double salary = sc.nextDouble();
				
				EmployeeDao.updateEmployeeSalary(eid,salary);
				
			}
			break;
			case 3: {
	
				System.out.println("Enter ID And Employee Present or Not(1 or 0)");
				
				int eid = sc.nextInt();
				
				boolean isPresent = false;
				int ispresent = sc.nextInt();
				if (ispresent==1) {
					boolean present=true;
					 isPresent = present;	
				}else if(ispresent==0) {
					boolean present=false;
					 isPresent = present;
				}else {
					System.out.println("Invalid Input");
				}

				
				EmployeeDao.updateEmployeePresent(eid,isPresent);
	
			}
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + innerChoice);
			}
			
		}
		break;
		case 4: {
			System.out.println("You are in Delete Operation...\n");
			System.out.println("Enter Id which Employee Record You Want To Delete...");
			
			int eid = sc.nextInt();

			EmployeeDao.deleteEmployee(eid);

		}
		break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}

}
