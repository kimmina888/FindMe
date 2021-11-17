package FindMe_Pack;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		findMeLogin lg = null;
		int choose = lg.LoginPage();
	}

}
class User{
	private String Id;
	private String Password;
	private String Name;
	private String Email;
	void setPassword() {
		
	}
	void setId() {
		
	}
	String getPassword() {
		return Password;
	}
	String getId() {
		return Id;
	}
}
class Login extends User{
//	int LoginCheck(String Id, String Password) {
//		
//	}
}
class Poisoning{
	String PName;
	double Achieve;
	String startDate;//Æò±Õ ´Þ¼º·ü
	String day;
}
class PoisoningList{
	Poisoning plist[];
	PoisoningList(){
		
	}
	void gettList(){
		
	}
}
