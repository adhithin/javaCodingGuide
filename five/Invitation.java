import java.util.Scanner; 

public class Invitation {

  Scanner sc = new Scanner(System.in); 

	public void Invitation(String n, String a) {
		String hostName = n;
		String address = a;

		System.out.println(n);

		System.out.println(a);
	}

	public String getHostName(String hostName) {
		System.out.println(hostName);
		return hostName;
	}

	public String getAddress(String address) {
		System.out.println(address);
		return address;
	}

	public String changeAddress() {

		System.out.println("What is the new address?");

		String newAddress = sc.nextLine();

		System.out.println(newAddress);
		return newAddress;
	}

	public String sendInvite(String name, String address, String hostName) {
		String invite = "Dear " + name + "," + " please attend my event at " + address + "." + " See you then, " + hostName + ".";

		System.out.println(invite);

		return invite;
	}


    
}




