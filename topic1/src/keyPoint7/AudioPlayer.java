package keyPoint7;

public class AudioPlayer {  // State Pattern Design used
	private State state;
	
	public AudioPlayer(){ // first state --> playing
		PlayingState playingState = new PlayingState();
		this.setState(playingState);
	}
	
	
	  public void play() {
	    state.pressPlay(this);
	  }
	  
	  public void stop() {
		    state.pressStop(this);
		  }
	  
	  public void pause() {
		    state.pressPause(this);
		  }

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	

}
