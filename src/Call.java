
public class Call {
	double priceForAMinute = 0.95;
	Gsm caller, reciver;
	double duration;
	
	public Call(Gsm caller, Gsm reciver, double duration) {
		super();
		this.caller = caller;
		this.reciver = reciver;
		this.duration = duration;
	}
	
	void printCallInfo(){
		System.out.println("Call Duration: " + duration);
		System.out.println("Caller: " + caller.simMobileNumber);
		System.out.println("Reciver: " + reciver.simMobileNumber);
	}
}
