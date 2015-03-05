import javax.swing.JOptionPane;

public class Boolean {
	public static void main (String [] args) {
		
		boolean groupsize1, groupsize2, teamsize;
		int NumPeople, NumPlayer, GroupSize, TeamSize;
		String Resultgroupsize;
		String Resultteamsize;
		
		NumPeople = Integer.parseInt(JOptionPane.showInputDialog("What is the number of people?"));
		NumPlayer = Integer.parseInt(JOptionPane.showInputDialog("What is the number of player?")); 
		
		groupsize1 = NumPeople>10;
		groupsize2 = NumPeople<3;
		teamsize = 11<NumPlayer&&NumPlayer<55;
		
		if(groupsize1) {
			GroupSize = NumPeople/2;
			Resultgroupsize = String.format(" and the group size is " + GroupSize);
			
			} else if(groupsize2) {
				Resultgroupsize = String.format(" . The number of people has to be at least 3.");
			
			} else {
				GroupSize = NumPeople/3;
				Resultgroupsize = String.format(" and the group size is " + GroupSize);
				} 
		
		if(teamsize) {
			TeamSize = NumPlayer/11;
			Resultteamsize = String.format(" and the team size is " + TeamSize);
			
		  	} else {
		  		TeamSize = 1;			
				Resultteamsize = String.format(" and the team size is " + TeamSize);
				}
			
			JOptionPane.showMessageDialog(null,  "The number of people is " +  NumPeople
  			  + Resultgroupsize
  			  + "\nThe number of player is " + NumPlayer
  			  + Resultteamsize);
		}		
	}


