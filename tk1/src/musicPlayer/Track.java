package musicPlayer;

public class Track implements State{
	private String songName,Album,Artist;
	private double duration;
	
	State state;
	

	
	
	
	public State getState() {
		return state;
	}



	public void setState(State state) {
		this.state = state;
	}
	
	public void play(){
		state=new Playing();
		this.showState(this);
	}
	public void stop(){
		state=new Stopped();
		this.showState(this);
	}
	public void pause(){
		state=new Paused();
		this.showState(this);
	}
	



	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getAlbum() {
		return Album;
	}
	public void setAlbum(String album) {
		Album = album;
	}
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	
	@Override
	public void showState(Track track) {
		this.state.showState(this);
		
	}
	
	
	

}
