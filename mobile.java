package week1.day1;

public class mobile {
	String mobileModel= 'readmi';
	int mobileWeight = 200; 
	char isFullyCharge = 'y';
	double mobileCost = 1232.121; 
	
public void makeCall() {
	System.out.println("Hari prasad");
	
}
public void sendMessage() {
System.out.println("Merry Christmas");
} 

public static void main(String[] args) {
	
	mobile mymobile = new mobile();
	mymobile.makeCall();
	mymobile.sendMessage();
	
}

public static void main(String[] args) {
	
	mobile mymobile = new mobile();
	mymobile.makeCall();
	mymobile.sendMessage(); 
	System.out.println(mymobile.mobileWeight);
	System.out.println(mymobile.mobileCost);
	System.out.println(mymobile.isFullyCharge);
}

}
