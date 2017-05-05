package musicPlayer;

public class Stopped implements State{

	@Override
	public void showState(Track track) {
		System.out.println("the song "+track.getSongName() +" is stopped");
		
	}

}
