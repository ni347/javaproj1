package projday9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TransactionParty{
	String seller, buyer;
	
	public TransactionParty(String seller, String buyer) {
		this.seller=seller;
		this.buyer=buyer;
	}
}

class Receipt{
	TransactionParty transactionParty;
	String productQR;
	
	public Receipt(TransactionParty transactionParty, String productQR) {
		this.transactionParty=transactionParty;
		this.productQR=productQR;
	}
}

public class GenerateReceipt {
	
	public int verifyParty(Receipt r) {
		int count=0;
		Pattern p = Pattern.compile("^[a-zA-Z-']+\s{1}[a-zA-Z-']+[a-zA-Z]$");
		Matcher m = p.matcher(r.transactionParty.seller);
		Matcher m1 = p.matcher(r.transactionParty.buyer);
		if(m.matches()&&m1.matches()) {
			count++;
		}if(m.matches()|| m1.matches()) {
			count++;
		}
		return count;
	}
	
	public String calcGST(Receipt r) {
		int total = 0;
		double GST_rate = 0.12;
		String[] str = r.productQR.split("@");
		for(String p:str) {
			String[] rateQuan = p.split(",");
			int rate = Integer.parseInt(rateQuan[0]);
			int quan  = Integer.parseInt(rateQuan[1]);
			total=total+rate*quan;
			
		}
		Integer GST = (int)(total*GST_rate);
		return GST.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenerateReceipt gr = new GenerateReceipt();
		TransactionParty tr = new TransactionParty("Daniel D'Cruz","Giselle Dawn-Wright");
		Receipt re = new Receipt(tr, "250,10@100,3@50,7");
		System.out.println(gr.verifyParty(re));
		System.out.println(gr.calcGST(re));
		
	}

}
