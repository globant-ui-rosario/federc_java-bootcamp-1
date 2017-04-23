package keyPoint7;

public class User implements Observer {

	private Observable observable = null;
	public Observable getObservable() {
		return observable;
	}
	public void setObservable(Observable observable) {
		this.observable = observable;
	}
	@Override
	public void update(String event) {
		System.out.println(event+" notification recived");

	}

}
