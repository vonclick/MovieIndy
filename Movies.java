public class Movies {

	
	public static void main(String[] args) {
		// Array Of Titles
		String[] titles = {"Les Aventuriers de l'Arche perdue", "Indiana Jones et le Temple maudit", "Indiana Jones et la Dernière Croisade"};
                
                // Tab Of Actors
		String[][] actors = new String[][] {
		    {"Harrison Ford", "Karen Allen",  "Paul Freeman"},
		    {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"},
		    {"Harrison Ford", "Sean Connery", "Denholm Elliott"}
		};
		
                // Print Out
		for (int i = 0; i < titles.length; i++) {
		    System.out.println("Dans le film: " +titles[i] +", les principaux acteurs sont : " +actors[i][0] +", "  +actors[i][1] +", " +actors[i][2] );   
		}
	}

}
