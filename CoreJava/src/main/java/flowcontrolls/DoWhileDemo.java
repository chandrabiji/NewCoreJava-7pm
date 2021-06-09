package flowcontrolls;

public class DoWhileDemo {

	public static void main(String[] args) {
		int i = 1,sum = 0;
		do {
			if(i%2==0){
			System.out.println(i);
			sum +=i;//sum = sum +i;
			}
			//i = i+1;
			//i +=1;
			++i;
		}while(i<=10);
		System.out.println("Sum = "+sum);

	}

}
