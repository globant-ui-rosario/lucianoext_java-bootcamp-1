package musicPlayer;

public class Playing implements State{

	@Override
	public void showState(Track track) {
		System.out.println("You are now listening to "+track.getSongName()+ " by "+track.getArtist());
		
	}
	
						
}
