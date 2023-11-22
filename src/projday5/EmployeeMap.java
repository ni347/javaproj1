package projday5;

import java.util.*;
import java.util.Map.Entry;

 

class EmployeePersonal

{

	private String EmpName;

	private String EmpID;

	private String EmpGender;

	private int EmpSal;

	private long EmpMobile;

	EmployeePersonal(String EmpName, String EmpID, String EmpGender, int EmpSal, long EmpMobile)

	{

		this.EmpName = EmpName;

		this.EmpID = EmpID;

		this.EmpGender = EmpGender;

		this.EmpSal = EmpSal;

		this.EmpMobile= EmpMobile;

	}

	public void setEmpName(String EmpName)

	{

		this.EmpName = EmpName;

	}

	public void setEmpID(String EmpID)

	{

		this.EmpID = EmpID;

	}

	public void setEmpGender(String EmpGender)

	{

		this.EmpGender = EmpGender;

	}

	public void setEmpSal(int EmpSal)

	{

		this.EmpSal = EmpSal;

	}

	public void setEmpMobile(long EmpMobile)

	{

		this.EmpMobile = EmpMobile;

	}

	public String getEmpName()

	{

		return this.EmpName;

	}

	public String getEmpID()

	{

		return this.EmpID;

	}

	public String getEmpGender()

	{

		return this.EmpGender;

	}

	public int getEmpSal()

	{

		return this.EmpSal;

	}

	public long getEmpMobile()

	{

		return this.EmpMobile;

	}

}

	class EmployeeDetails extends EmployeePersonal

	{

		private String Dep_Name;

		private String Com_Name;
		
//		private String Dept_id;


		EmployeeDetails(String EmpName, String EmpID, String EmpGender, int EmpSal, long EmpMobile,String Dep_Name, String Com_Name)

		{

			super(EmpName, EmpID, EmpGender, EmpSal, EmpMobile);
			
//			this.Dept_id = Dept_id;

			this.Dep_Name = Dep_Name;

			this.Com_Name = Com_Name;

		}

		public void set(String Dep_Name)

		{

			this.Dep_Name = Dep_Name;

		}

		public void setCom_Name(String Com_Name)

		{

			this.Com_Name = Com_Name;

		}

		public String getDep_Name()

		{

			return this.Dep_Name;

		}

		public String getCom_Name()

		{

			return this.Com_Name;

		}

		public String toString()

		{

			return super.getEmpName()+"|"+super.getEmpID()+"|"+super.getEmpGender()

			+"|"+super.getEmpSal()+"|"+super.getEmpMobile()+"|"+this.Dep_Name+"|"

			+this.Com_Name;

		}

	}

public class EmployeeMap

{

	public static void main(String[] args) 

	{

		Scanner sc = new Scanner(System.in);

		EmployeeDetails ed [] = new EmployeeDetails[2];

		HashMap<String, EmployeeDetails> list = new HashMap<String, EmployeeDetails>();

		for(int i=0; i<2; i++)

		{

				System.out.println("Enter details for employee:"+(i+1));

				System.out.println("Enter Name:");

				String name = sc.next();

				System.out.println("Enter ID:");

				String ID = sc.next();

				System.out.println("Enter Gender:");

				String gender = sc.next();

				System.out.println("Enter salary:");

				int salary = sc.nextInt();

				System.out.println("Enter MobileNo:");

				long mobile = sc.nextLong();

				System.out.println("Enter Depatment name:");

				String dep_name = sc.next();

				sc.nextLine();

				System.out.println("Enter Company Name:");

				String comp_name = sc.nextLine();

				list.put(ID, new EmployeeDetails(name, ID, gender, salary, mobile, dep_name, comp_name));


		}
		System.out.println("Enter the id you want to search");
		String searchId=sc.next();
		for(Map.Entry<String, EmployeeDetails> ed1:list.entrySet()) {
			if(searchId.equalsIgnoreCase(ed1.getKey())) {
				System.out.println(ed1.getValue());
			}
		}

		

//		for(int i=0; i<2; i++)

//		{	

//			System.out.println("Employee Details:\n"+ed[i]);

//		}

	}

}
