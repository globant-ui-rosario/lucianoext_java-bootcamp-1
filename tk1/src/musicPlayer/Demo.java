package musicPlayer;

public class Demo {

	public static void main(String[] args) {
		Track song1 = new Track();
		song1.setSongName("Radioactive");
		song1.setArtist("ImagineDragons");
		song1.setAlbum("Night Visions");
		song1.setDuration(3.05);
		
		song1.play();
		song1.pause();
		song1.stop();
		
		
		
		

	}

}
