package dataStructure.abstractclass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scheduler {
	public Event [] events = new Event[100];
	List<Event> list = new ArrayList<Event>();
	public int n = 0;
	
	private Scanner kb;
	
	public void processCommand() {
		try {
			kb = new Scanner(System.in);
			
			
			while(true) {
				System.out.println("$ ");
				String command = kb.next();
				if(command.equals("addevent")) {
					String type = kb.next();
					if(type.equalsIgnoreCase("oneday"))
						handleAddOneDayEvent();
					else if(type.equalsIgnoreCase("duration"))
						handleAddDurationEvent();
					else if(type.equalsIgnoreCase("deadline"))
						handleAddDeadlineDayEvent();
				}else if(command.equals("list")) {
					handleList();
				}else if(command.equals("show")) {
					handleShow();
				}else if(command.equals("exit")) {
					break;   
				}
			}
			kb.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public void handleShow() {
		String dateString = kb.next();
		MyDate theDate = parseDateString(dateString);
		
		for(Event event : list) {
			if(event.isRelevant(theDate)) { //abstract method
				System.out.println(event.toString()); //dynamic binding
			}
		}
		
	}
	private void handleList() {
		for(Event event : list) {
			System.out.println(event.toString()); // dynamic binding
		}
	}

	public void handleAddOneDayEvent() {
		System.out.println(" when : ");
		String dateString = kb.next();
		System.out.println(" title : ");
		String title = kb.next();
		
		MyDate date = parseDateString(dateString);
		
		OneDayEvent ev = new OneDayEvent(title,date);
		
		list.add(ev);
	}
	
	public void handleAddDurationEvent() {
		System.out.println(" start : ");
		String start = kb.next();
		MyDate startDate = parseDateString(start);
		System.out.println(" end : ");
		String end = kb.next();
		MyDate endDate = parseDateString(end);
		System.out.println(" title : ");
		String title = kb.next();
		

		DurationEvent ev = new DurationEvent(title,startDate,endDate);
		
		list.add(ev);
	}
	
	public void handleAddDeadlineDayEvent() {
		System.out.println(" deadline : ");
		String deadline = kb.next();
		MyDate deadlineDate = parseDateString(deadline);

		System.out.println(" title : ");
		String title = kb.next();
		
		DeadlinedEvent ev = new DeadlinedEvent(title,deadlineDate);
		
		list.add(ev);
	}
	
	public MyDate parseDateString(String dateString) {
		String[] tokens = dateString.split("/");
		return new MyDate(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
	}
	public static void main(String[] args) {

		Scheduler scheduler = new Scheduler();
		scheduler.processCommand();
	}
}
