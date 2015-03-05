import javax.swing.JOptionPane;

public class Boolean {
	public static void main (String [] args) {
		
		boolean GroupSizeOver, TeamSizeOver, BothOver, BothLess;
		int numPeople, numPlayer, groupSize, teamSize;
		
		numPeople = Integer.parseInt(JOptionPane.showInputDialog("What is the number of people?"));
		numPlayer = Integer.parseInt(JOptionPane.showInputDialog("What is the number of player?")); 
		
		GroupSizeOver = numPeople>10&&numPlayer<=11;
		TeamSizeOver = numPeople<=10&&numPlayer>11;
		BothOver = numPeople>10&&numPlayer>11;
		BothLess = numPeople<=10&&numPlayer<=11;
      
      if(GroupSizeOver){
    	  groupSize = numPeople/2;    	  
    	  teamSize = numPlayer;
    	  teamSize = teamSize/2;
    	
    	  JOptionPane.showMessageDialog(null, "The number of people is " + numPeople
    			  + " and the group size is " + groupSize
    			  + "\nThe number of player is " + numPlayer
    			  + " and the team size is " + teamSize);


      } else if(TeamSizeOver){
      	  groupSize = numPeople/3;
    	  numPeople = numPeople + 1;
    	  teamSize = 11;

    	  JOptionPane.showMessageDialog(null, "The number of people is " + numPeople
    			  + " and the group size is " + groupSize
    			  + "\nThe number of player is " + numPlayer
    			  + " and the team size is " + teamSize);


      } else if(BothOver) {
    	  groupSize = numPeople/2;    	  
    	  teamSize = 11;

    	  JOptionPane.showMessageDialog(null, "The number of people is " + numPeople
    			  + " and the group size is " + groupSize
    			  + "\nThe number of player is " + numPlayer
    			  + " and the team size is " + teamSize);


      } else if(BothLess) {
      	  groupSize = numPeople/3;
    	  numPeople = numPeople + 1;
      	  teamSize = numPlayer;
    	  teamSize = teamSize/2;

    	  JOptionPane.showMessageDialog(null, "The number of people is " + numPeople
    			  + " and the group size is " + groupSize
    			  + "\nThe number of player is " + numPlayer
    			  + " and the team size is " + teamSize);


    	  
      }
      
      
	}
}
