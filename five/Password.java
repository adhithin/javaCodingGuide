import java.util.Scanner;

class Password {
  
    String pass = "";

		public String newPass(String str, int passLen){
			

		for (int i = 0; i < passLen; i++) {
			
			int num = (int)(Math.random()*10);
			num = Math.round(num);
			String number = String.valueOf(num);
			pass = str + number;
			str = pass;	
		}

		System.out.print("Your new password is: " + str);

		return str; 

		}
  
}