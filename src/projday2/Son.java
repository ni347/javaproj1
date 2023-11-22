package projday2;

class Father{
	private int money;
	
	Father(int money){
		this.money=money;
	}
	
	public void setMother(int money) {
		this.money=money;
	}
	public int getMoney() {
		return this.money;
	}
}

public class Son {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father(1000);
//		f.setMother(5000);
		System.out.println(f.getMoney());
	}

}
