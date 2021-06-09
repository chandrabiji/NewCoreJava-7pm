package oops;

class CentralGovt {
	public void tax(){
		System.out.println("Central Govt Tax");
	}
}
class StateGovt extends CentralGovt{
	public void tax(){
		System.out.println("Central Govt Tax + State Govt Tax");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		CentralGovt cg = new CentralGovt();
		cg.tax();
		CentralGovt ts = new StateGovt();
		ts.tax();
		

	}

}
