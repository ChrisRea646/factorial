
public class ReverseFactorial {
	
	
	public void reverse(double num) {
	int divider = 1;
		while(num !=1 && num >1) {
			divider++;
			num = num/divider;
			
			//System.out.println(num);
			
			if(num <1) {
				System.out.println("NONE");
				break;
			}
		}
			if(num == 1) {
				System.out.println(divider+"!");
			}
			
		}
		
		
	}


