
public class ReverseFactorial {
	
	int divider = 2;
	public void reverse(double num) {
	
		while(num !=1 && num >1) {
			num = num/divider;
			divider++;
			System.out.println(num);
			
			if(num <1) {
				System.out.println("NONE");
			}else{
				System.out.println(divider+"!");
			}
		}
		
		
	}

}
