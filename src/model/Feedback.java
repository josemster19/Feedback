package model;

import java.time.LocalDateTime;


public class Feedback {
	private long id;
	private String subject;
	private String msg;
	private LocalDateTime timeStamp;
	
	static long nextId = 0;

	public Feedback() {
		synchronized(Feedback.class) {
			this.id = nextId++;
		}

		this.timeStamp = LocalDateTime.now();	
	}

	
	public long getId() {
	    return id;
	}
	
	
	public String getSubject() {
	    return subject;
	}


	public String getMsg() {
	    return msg;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

	public String toString() {
		return timeStamp + " "+ subject + ": " + msg;
	}

}
