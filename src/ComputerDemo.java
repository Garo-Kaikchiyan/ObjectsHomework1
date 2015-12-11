
public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc1 = new Computer(1998, 2500, false, 500000, 500000, "Windows 98");
		Computer pc2 = new Computer(2003, 2000, true, 700000, 700000, "Lynux");
		
		pc1.useMemory(100);
		pc2.changeOperationSystem("Windows XP");
		System.out.println("Computer 1:");
		pc1.printStats();
		System.out.println();
		System.out.println("Computer 2:");
		pc2.printStats();
	}

}
