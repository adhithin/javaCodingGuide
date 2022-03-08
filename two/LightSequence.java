public class LightSequence

{

	public String LightSequence(String seq) {
		System.out.println("The new Light Sequence is " + seq);

		return seq;
	}

	

	public String insertSegment(String segment, int ind)

	{ 
		System.out.println("The new string is now: " + segment);
		return segment;
	}


	public void changeSequence(String seq)

	{ 

		System.out.println("The sequence has been changed to " + seq);
	}



	public void display(String disSeq)

	{ 
		
		System.out.println("Displaying the Lights... ");
		System.out.println(disSeq);
	}

}
