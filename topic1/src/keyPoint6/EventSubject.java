package keyPoint6;

public interface EventSubject {
	
	public void addObserver(EventObserver eventObserver); // this could be the market manager

	public void removeObserver(EventObserver eventObserver);

	public void doNotify();

}
