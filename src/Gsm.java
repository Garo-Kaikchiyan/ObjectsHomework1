
public class Gsm {
	String model;
	boolean hasSimCard = false;
	String simMobileNumber;
	double outgoingCallsDuration = 0;
	Call lastIncomingCall, lastOutgoingCall;
	
	void insertSimCard(String simMobileNumber){
		boolean isNum = true;
		if(simMobileNumber.startsWith("08")
				&& simMobileNumber.length() == 10){
				for(int i = 2; i < simMobileNumber.length(); i++){
					if(simMobileNumber.charAt(i) < '0' || simMobileNumber.charAt(i) > '9'){
						isNum = false;
						break;
					}
				}
				if(isNum){
					this.simMobileNumber = simMobileNumber;
					this.hasSimCard = true;
				}
		}
		
	}
	
	void removeSimCard(){
		this.hasSimCard = false;
	}
	
	void call(Gsm reciver, double duration){
		if(duration < 0 || !this.hasSimCard || !reciver.hasSimCard) return;
		if(reciver.simMobileNumber.equals(this.simMobileNumber)) return;
		if(!reciver.hasSimCard || !this.hasSimCard) return;
		Call call = new Call(this, reciver, duration);
		this.lastOutgoingCall = call;
		this.outgoingCallsDuration += call.duration;
		reciver.lastIncomingCall = call;
	}
	
	double getSumForCall(){
		if(this.lastIncomingCall != null)
			return this.outgoingCallsDuration * this.lastIncomingCall.priceForAMinute;
		return 0;
	}
	
	void printInfoForTheLastOutgoingCall(){
		if(this.lastOutgoingCall == null){
			System.out.println("No outgoing calls");
			return;
		}
		System.out.println("Last outgoing call:");
		this.lastOutgoingCall.printCallInfo();
	}
	void printInfoForTheLastIncomingCall(){
		if(this.lastIncomingCall == null){
			System.out.println("No incoming calls");
			return;
		}
		System.out.println("Last incoming call:");
		this.lastIncomingCall.printCallInfo();
	}
	
}
