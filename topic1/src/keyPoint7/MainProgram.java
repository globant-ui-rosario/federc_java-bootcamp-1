package keyPoint7;


public class MainProgram {
	
	public static void main(String[] args) {
		
		
		ControllerAudioPlayer controllerAudioPlayer = new ControllerAudioPlayer();
			
		// let's play some music! 
			AudioPlayer audioPlayer = controllerAudioPlayer.audioPlayerStarts();  // metodos en AudioPlayer class
			
		// in any moment, the client press some audio player buttoms
			String userAction = "user action(buttom pressed)";
			switch (userAction){			
			case "play":
				PlayingState playingState = new PlayingState();
				audioPlayer.setState(playingState);
			case "stop":
				StopedState stopedState = new StopedState();
				audioPlayer.setState(stopedState);
			case "pause":
				PausedState pausedState = new PausedState();
				audioPlayer.setState(pausedState);
			}
					
				
		
		
    }

}
