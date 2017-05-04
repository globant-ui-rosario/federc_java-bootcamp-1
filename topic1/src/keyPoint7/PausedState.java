package keyPoint7;

public class PausedState implements State {

	@Override
	public void pressPlay(AudioPlayer context) {
		context.setState(new PlayingState());

	}

	@Override
	public void pressStop(AudioPlayer context) {
		context.setState(new StopedState());

	}

	@Override
	public void pressPause(AudioPlayer context) {
		// do nothing

	}

}
