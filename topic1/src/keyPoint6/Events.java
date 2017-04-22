package keyPoint6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Events implements EventSubject {
	
	
	Set<EventObserver> eventObservers;
	String event;
	
	public Events() {
		eventObservers = new HashSet<EventObserver>();
		
	}

	@Override
	public void addObserver(EventObserver eventObserver) {
		eventObservers.add(eventObserver);

	}

	@Override
	public void removeObserver(EventObserver eventObserver) {
		eventObservers.remove(eventObserver);

	}

	@Override
	public void doNotify() {
		Iterator<EventObserver> eo = eventObservers.iterator();
		while (eo.hasNext()) {
			EventObserver eventObserver = eo.next();
			eventObserver.doEvent();
		

	}

}
}
