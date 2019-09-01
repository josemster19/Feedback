package model;

import java.util.HashMap;

import javax.ejb.Singleton;
import javax.ejb.Startup;


@Singleton
public class FeedbackDataBase {
	private HashMap<Long, Feedback>feedbackDictionary = new HashMap<>();

	public FeedbackDataBase(){
	    //...
	    System.out.println("hola desde la database");
	    System.out.println(feedbackDictionary);
	    
	    
	}
	
	
	
	
	public HashMap<Long, Feedback> getFeedbackDictionary() {
		System.out.println("Devolviendo el dicionario");
		return feedbackDictionary;
	}


	public void addFeedback(Feedback feedback) {
	    //...
	    System.out.println("añadiendo entrada al diccionario");
	    feedbackDictionary.put(feedback.getId(), feedback);
	    System.out.println(feedbackDictionary);
	}

	public void deleteFeedback(Feedback feedback) {
	    //...
		System.out.println("borrando entrada");
	    feedbackDictionary.remove(feedback.getId());
	    
	    
	    
	    
	}
	
	
	
}
