
import java.util.*;
import java.time.LocalDateTime;

public class shopkeeper {
	public void price(double total){
		if(total>500) {
			total=(total-total*0.1);
			System.out.println("Total amount after discout will be " +total +"\n" 
			+LocalDateTime.now());
		}else {
			System.out.println(LocalDateTime.now());
		}
	}
	
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 shopkeeper last = new shopkeeper();
		 int total=0;
		
		 String[] items= {"Rice", "Sugar", "Oil", "Soap", "Milk"};
		 int[] prices ={50, 40, 100, 25, 30};
		 System.out.println("AVAILABLE ITEMS ARE : " + Arrays.toString(items));
		 
		 try {
			for (int i=0;i<5;i++) {
				System.out.println("enter quantity for "+items[i] + " : ");
				int quantity = sc.nextInt();
				int price=quantity*prices[i];
				total +=price;
		 }
		sc.close();
		 }catch(Exception e) {
			 System.out.println(e);
		 }
         
		 System.out.println("Total Cost : " + total);
		 last.price(total);
		 
		 
		 
	}

}
