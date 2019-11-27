package day1.classroom;

public class Mobile {
	
      public void call (String name) {
		System.out.println("name is "+ name);
	}
	public String getsms() {
		System.out.println("get sms");
		return "hi";
	}
	 public Boolean shutdown() {
		 System.out.println("browser closed");
		 return true;
	 }
	
	 public static void main(String[] args) {
		 Mobile phone=new Mobile();
		 phone.call("gayathri");
		 String getsms = phone.getsms();
		 System.out.println(getsms);
		 phone.shutdown();
		 
		 
	 }

}
