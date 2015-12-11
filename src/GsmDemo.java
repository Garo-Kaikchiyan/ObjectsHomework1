
public class GsmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gsm phone1 = new Gsm();
		phone1.insertSimCard("0887142213");
		Gsm phone2 = new Gsm();
		phone2.insertSimCard("0887132357");
		
		phone1.call(phone2, 4);
		phone1.printInfoForTheLastIncomingCall();
		System.out.println();
		phone1.printInfoForTheLastOutgoingCall();
		System.out.println();
		phone2.printInfoForTheLastIncomingCall();
		System.out.println();
		phone2.printInfoForTheLastOutgoingCall();
		
	}

}
