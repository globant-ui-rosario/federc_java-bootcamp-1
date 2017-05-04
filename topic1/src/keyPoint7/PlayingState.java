package keyPoint7;

public class PlayingState implements State {
	
	

	@Override
	public void pressPlay(AudioPlayer context) {
		// do nothing

	}

	@Override
	public void pressStop(AudioPlayer context) {
		context.setState(new StopedState());

	}

	@Override
	public void pressPause(AudioPlayer context) {
		context.setState(new PausedState());

	}

}
