//BusinessLogic Class
public class Inst {
	private String userName;
	private String password;
	public void setUserName(String userName) {
		this.userName=userName;
	}
	public String getUserName() {
		return userName;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public String getPassword() {
		return password;
	}
}
//UserLogic Class
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inst i=new Inst();
		// System.out.println(i.userName);
		// i.userName="hemanth";
		i.setUserName("Hemanth");
		System.out.println("UserName: "+i.getUserName());
		i.setPassword("hemanth@12");
		System.out.println("Password: "+i.getPassword());
	}
}
/*Expected Output:
UserName: Hemanth
Password: hemanth@12
*/
