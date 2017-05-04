package keyPoint7;

public class StopedState implements State {

	@Override
	public void pressPlay(AudioPlayer context) {
		context.setState(new PlayingState());

	}

	@Override
	public void pressStop(AudioPlayer context) {
		// do nothing

	}

	@Override
	public void pressPause(AudioPlayer context) {
		// do nothing

	}

}
