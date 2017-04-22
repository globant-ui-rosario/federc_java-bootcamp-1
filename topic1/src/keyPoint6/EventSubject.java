package keyPoint6;

public interface EventSubject {
	
	public void addObserver(Employer employer);

	public void removeObserver(Employer employer);

	public void doNotify();

}
