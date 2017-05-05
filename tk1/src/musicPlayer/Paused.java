package musicPlayer;

public class Paused implements State{

	@Override
	public void showState(Track track) {
		System.out.println("the song "+track.getSongName()+" is paused");
		
	}

}
