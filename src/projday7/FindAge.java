package projday7;

public class FindAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int current_date = 18;
		int current_mon = 10;
		int current_year = 2023;
		
		int bdd_date = 30;
		int bdd_mon = 9;
		int bdd_year = 1999;
		
		if(current_date<bdd_date) {
			current_mon=current_mon-1;
			current_year=current_year-1;
			
			current_date=current_date+30;
			current_mon=current_mon+12;
			current_date=current_date-bdd_date;
			
			
			current_mon=current_mon-bdd_mon;
			
//			System.out.println(current_year);
			current_year=current_year-bdd_year;
			
			
		}
		System.out.println(current_date);
		
		System.out.println(current_mon);
		System.out.println(current_year);
	}

}
