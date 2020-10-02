class Printer{
synchronized public void print(String msg){
	System.out.print("[");
	try{
		Thread.sleep(1000);
	}catch(Exception e){
		e.printStackTrace();
	}
	
	System.out.print(msg);
	System.out.print("]");
}
}

class User extends Thread{
	Printer p;
	String printJob;
  User(String printJob,Printer p){
	this.p = p;
	this.printJob = printJob;
	Thread t = new Thread(this);
	
  }
  
  public void run() {
	p.print(printJob);
  }

}
class PrettyPrinter{

	public static void main(String a[]){
		
		try{
		Printer p = new Printer();
		User u1 = new User("Hello ",p);
		
		User u2 = new User("How  ",p);
		User u3 = new User("are you ? ",p);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}