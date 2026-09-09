/*
package wrapper;

public class Customer {
	String userName,password;
	long mobileNo;
	String emailId;
	Customer(String userName,String password,long mobileNo,String emailId){
		this.userName=userName;
		this.password=password;
		this.mobileNo=mobileNo;
		this.emailId=emailId;
	}
	public String toString() {
		return "UserName :"+userName+", Password :"+password+" ,MobileNumber :"+mobileNo+" ,EmailId :"+emailId+"\n";
		
	}
	
}
*/
//package wrapper;

import java.util.Arrays;

public class UsageofArraysToStoreHeterogenousData {
	public static void main(String[] args) {
		Customer[] c=new Customer[15];
		Customer c1=new Customer("Balu","Balu@342",9988776655L,"balu33@gmail.com");
		Customer c2 = new Customer("Rani", "Rani@123", 987543210L, "rani12");
		Customer c3 = new Customer("Raja", "Raja@", 8123456780L, "raja45@gmail.com");
		Customer c4 = new Customer("Sana", "Sana@789", 9012345678L, "sana78@gmail.com");
		Customer c5 = new Customer("Chitti", "Chitti@", 9988001122L, "chitti11@gmail.com");
		Customer c6 = new Customer("Sampu", "sampu@222", 9977123456L, "sampu22@gmail.com");
		Customer c7 = new Customer("Chimtu", "Chimtu@333", 9966234567L, "chimtu33@gmail.com");
		Customer c8 = new Customer("Roja", "Roja@444", 8955345678L, "roja");
		Customer c9 = new Customer("Vikram", "Vikram@555", 9944456789L, "vikram55@gmail.com");
		Customer c10 = new Customer("Kavya", "Kavya@666", 99567890L, "kavya66@gmail.com");
		Customer c11 = new Customer("Arjun", "Arjun777", 8922678901L, "arjun77@gmail.com");
		Customer c12 = new Customer("Divya", "Divya@888", 9911789012L, "divya88@gmail.com");
		Customer c13 = new Customer("Karthik", "Karthik@999", 9900890123L, "karthik99@gmail.com");
		Customer c14 = new Customer("Meena", "Meena000", 98901234L, "meena00@gmail.com");
		Customer c15 = new Customer("Suresh", "Suresh@101", 9788012345L, "suresh01");
		c[0]=c1; 
		c[1]=c2; 
		c[2]=c3; 
		c[3]=c4; 
		c[4]=c5;
		c[5]=c6; 
		c[6]=c7; 
		c[7]=c8; 
		c[8]=c9; 
		c[9]=c10;
		c[10]=c11; 
		c[11]=c12; 
		c[12]=c13; 
		c[13]=c14; 
		c[14]=c15;
		System.out.println(Arrays.toString(c));
		System.out.println("--------------------------------------------------------------------------------------------------------");
		for(int i=0 ; i<c.length ; i++) {
			Customer temp=c[i];
			if(temp.emailId.endsWith("@gmail.com"))
				System.out.println(temp);	
		}
		System.out.println("--------------------------------------------------------------------------------------------------------");
		int strongCount = 0;
		for(int i=0 ; i<c.length ; i++) {
		    Customer temp = c[i];
		    String pwd = temp.password;
		    int upper = 0;
		    int number = 0;
		    int special = 0;
		    for(int j=0 ; j<pwd.length() ; j++) {
		        char ch = pwd.charAt(j);
		        if(Character.isUpperCase(ch)) {
		            upper++;
		        } else if(Character.isDigit(ch)) {
		            number++;
		        } else if(!Character.isLetterOrDigit(ch)) {
		            special++;
		        }
		    }
		    if(upper>=1 && number>=3 && pwd.length()>=8 && pwd.length() <= 12 &&special >= 1 ) {
		    	System.out.println(temp);
		    }
		}
		System.out.println("--------------------------------------------------------------------------------------------------------");
		for(int i=0 ; i<c.length ; i++) {
		    Customer temp = c[i];
		    String mobileStr = String.valueOf(temp.mobileNo);
		    if(mobileStr.startsWith("8")) {
		        System.out.println(temp);
		    }
		}
		System.out.println("---------------------------------------------------------------------------------------------------------");
		for(int i=0 ; i<c.length ; i++) {
			Customer temp=c[i];
			String mobileStr = String.valueOf(temp.mobileNo);
		    if(mobileStr.length() != 10) {
		        temp.mobileNo = 0;
		    }
		    System.out.println(temp);		
		}
	}
}

