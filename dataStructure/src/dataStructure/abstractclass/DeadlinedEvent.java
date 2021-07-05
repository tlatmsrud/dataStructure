package dataStructure.abstractclass;

public class DeadlinedEvent extends Event{

	public MyDate deadline;
	
	public DeadlinedEvent(String title, MyDate deadline) {
		super(title);
		this.deadline = deadline;
	}

	public boolean isRelevant( MyDate date ) {
		return deadline.compareTo(date) >= 0;
	}
	
	@Override
	public String toString() {
		return "DeadlinedEvent [title=" + title + ", deadline=" + deadline + "]";
	}
	
	
}
