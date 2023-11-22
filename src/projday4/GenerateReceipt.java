package projday4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TransactionParty{
	private String seller;
	private String buyer;
	
	public TransactionParty(String seller, String buyer) {
		this.seller=seller;
		this.buyer=buyer;
	}
	
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller=seller;
	}
	
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer=buyer;
	}
}

class Receipt{
	private TransactionParty transactionParty;
	private String productQR;
	
	public Receipt(TransactionParty transactionParty, String productQR) {
		this.transactionParty=transactionParty;
		this.productQR=productQR;
	}
	
	public TransactionParty gettransactionparty() {
		return transactionParty;
	}
	public void settransactionparty(TransactionParty transactionParty) {
		this.transactionParty=transactionParty;
	}
	
	public String getProductQR() {
		return productQR;
	}
	public void setProductQR(String productQR) {
		this.productQR=productQR;
	}
}

public class GenerateReceipt {
	int count=0;
	String GST;
	public int verifyParty(Receipt r) {
		
		Pattern p = Pattern.compile("^[a-zA-Z]+\s[a-zA-Z'-]+[a-zA-Z]+$");
		Matcher m = p.matcher(r.gettransactionparty().getBuyer());
		Matcher m1 = p.matcher(r.gettransactionparty().getSeller());
		if(m.matches()) {
			count++;
		}if(m1.matches()) {
			count++;
		}
		return count;
	}
	public String calcGST(Receipt r) {
		int gst;
		Pattern p = Pattern.compile("^[0-9]+,[0-9]+@[0-9]+,[0-9]+@[0-9]+,[0-9]+$");
		Matcher m = p.matcher(r.getProductQR());
		gst = (int) ((250*10+100*3+50*7)*0.12);
		GST = gst+"";
		return GST;
	}
	
	public String toString() {
		return ("GST: "+ this.GST) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TransactionParty tr = new TransactionParty("nick nn","abhi nn");
		Receipt r = new Receipt(tr,"250,10@100,3@50,7");
		GenerateReceipt gr = new GenerateReceipt();
		int verify = gr.verifyParty(r);
		if(verify==2) {
			gr.calcGST(r);
			System.out.println(gr);
		}
		
	}

}
