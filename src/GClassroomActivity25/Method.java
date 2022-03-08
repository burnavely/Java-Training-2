package GClassroomActivity25;


public class Method {

	public void choose() {
		int ball_no, previous;
		boolean unique;
		long[] jball = new long[6];
		
		for (ball_no = 0; ball_no < 6; ball_no++)
		{
			unique = false;
			
			while(unique == false)
			{
				jball[ball_no] = Math.round(Math.random() * 49) +1;
				unique = true;
				
				for (previous = 0; previous < ball_no; previous++) {
					if(jball[previous] == jball[ball_no]) unique=false;
				}
			}
		}
	}
}
