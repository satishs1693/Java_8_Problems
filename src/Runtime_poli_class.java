class SBI implements Bank{
	int rateofinterest = 15 ;
	@Override
	public void interest() {
		System.out.println("This is SBI rate of Interest"+rateofinterest);	
	}
	public void Branches() {
		System.out.println("SBI having Many Branches");	
	}
	
}
class Employee12 {
	public void interest() {
		System.out.println("Thsi employee Instance");	
	}
}
class ICIC implements Bank{
	int rateofinterest = 12 ;
	@Override
	public void interest() {
		System.out.println("This is ICIC "+rateofinterest);	
	}
	public void Response() {
		System.out.println("Quic Response");
	}
}
class KOTAK implements Bank{
	int rateofinterest = 12 ;
	@Override
	public void interest() {
		System.out.println("This is KOTAK "+rateofinterest);	
	}
	public void Tomayoffers() {
		System.out.println("This is KOTAK "+rateofinterest);	
	}
}
public class Runtime_poli_class {
	public static void main(String[] args) {
		Bank [] b = new Bank[] {new ICIC() };
		for (Bank bank : b) {
			if (bank instanceof ICIC) {
				ICIC ic = (ICIC)bank;  // this Downcasting 
				ic.interest();
				ic.Response();
			}else if( bank instanceof KOTAK ){
				KOTAK kt = (KOTAK)bank;
				kt.interest();
				kt.Tomayoffers();
			}else if( bank instanceof SBI ) {
				SBI sbi = (SBI)bank;
				sbi.interest();
				sbi.Branches();
			}
		}
	}
}
