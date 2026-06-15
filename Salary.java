class Salary {
	public static void main(String args[]) {
               //program to print the salaries from the given tables
		String gender="male";
		int service=12;
		String qualification="Post Graduate";
		int salary=0;
		if(gender=="male") {
			if(service>=10) {
				if(qualification=="Post Graduate") {
					salary=15000;
					System.out.println(salary);
				} else {
					salary=10000;
					System.out.println(salary);
				}
			}else {
				if(qualification=="Post Graduate") {
					salary=10000;
					System.out.println(salary);
				} else {
					salary=7000;
					System.out.println(salary);
				}
			}
		}else {
            		if (service > 10) {
                		if (qualification == "Post Graduate") {
                    			salary = 12000;
					System.out.println(salary);

                		} else {
                   			 salary = 9000;
					 System.out.println(salary);

                		}
            		} else {
                		if (qualification == "Post Graduate") {
                   			 salary = 8000;
					 System.out.println(salary);

               			 } else {
                    			salary = 6000;
					System.out.println(salary);

                		 }
           		 }
		}
		




	}
}
