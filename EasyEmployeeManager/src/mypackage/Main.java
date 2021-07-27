package mypackage;
import java.io.*;
import java.util.*;

public class Main {
	
	static String employeeDbFile = "EmployeeDB.txt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to our non DB Employee management program!");
		Main mainObj = new Main();
		mainObj.insertData();
		mainObj.displayEmployees();
	}
	
	public void displayEmployees() 
	{
		System.out.printf("%-25s%-25s%-25s%-25s%-25s%-25s","ID " ," First Name  " , " Last Name " , " Department " , " Position " , " Salary");
		System.out.println();
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(employeeDbFile));
			String s = "";
			while ((s = br.readLine()) !=null) 
			{
				String data[] = new String[5];
				data = s.split(",");
				for(int i = 0; i < 5; i++) {
					System.out.printf("%-25s", data[i]);
				}
				System.out.println();
			}
		}catch(Exception e) 
		{
		}
		
	}
	
	public void insertData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		String epmployeeID = sc.nextLine();
		
		System.out.println("Enter Employee First Name: ");
		String epmployeeFN = sc.nextLine();
		
		System.out.println("Enter Employee Last Name: ");
		String epmployeeLN = sc.nextLine();
		
		System.out.println("Enter Employee Department: ");
		String epmployeeDepartment = sc.nextLine();
		
		System.out.println("Enter Employee Position: ");
		String epmployeePosition = sc.nextLine();
		
		System.out.println("Enter Employee Salary: ");
		String epmployeeSalary = sc.nextLine();
		
		try 
		{
			File fileObj = new File(employeeDbFile);
			PrintWriter pw = new PrintWriter(new FileOutputStream(fileObj,true));
			pw.append(epmployeeID + "," + epmployeeFN + "," +epmployeeLN + "," + epmployeeDepartment+ "," +epmployeePosition + "," + epmployeeSalary + "\n");
			pw.close();
		}catch(Exception e) 
		{
			
		}
	}

}
