
public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	
	
	public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory,
			String operationSystem) {
		super();
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	void changeOperationSystem(String op){
		this.operationSystem = op;
	}
	
	void useMemory(int memory){
		if(memory > this.freeMemory){
			System.out.println("Not enough free memory!");
			return;
		}
		if(memory > 0)
			this.freeMemory -= memory;
	}
	
	void printStats(){
		System.out.println("Year: " + this.year);
		System.out.println(this.isNotebook ? "It's a notebook": "It isn't a notebook");
		System.out.println("Price: " + this.price);
		System.out.println("Hard Disk Memory: " + this.hardDiskMemory);
		System.out.println("Free Memory: " + this.freeMemory);
		System.out.println("Operation System: " + this.operationSystem);
	}
}
