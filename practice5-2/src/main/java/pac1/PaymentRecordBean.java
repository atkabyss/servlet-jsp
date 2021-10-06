package pac1;

import java.io.Serializable;

public class PaymentRecordBean implements Serializable{
	private int payment;		//入金額
	private String comment;	//コメント

	//Constructor
	public PaymentRecordBean(){
	}

	public int getPayment() {
		return this.payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
