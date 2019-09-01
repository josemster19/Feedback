package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import model.Feedback;
import model.FeedbackDataBase;


@ManagedBean
public class FeedbackBackingBean {
	
	@EJB
	private FeedbackDataBase feedbackDataBase;

	private Feedback newFeedback;
	
	// index.xhtml
	
	public FeedbackBackingBean() {
		newFeedback = new Feedback();
	}
	
	public String addFeedback() {
		System.out.println("Añadiendo feedback a la BD");
		feedbackDataBase.addFeedback(newFeedback);
		return "thanks.xhtml"; //TO CHANGE 
	}	
	
	public void clearFeedback() {
		newFeedback = new Feedback();		
	}
	
	public Feedback getNewFeedback() {
		return newFeedback;
	}

	
	public List<Feedback> getFeedbackList() {
	    // The following ArrayList<E> constructor might be of use:
	    // public ArrayList​(Collection<? extends E> c)
	    // Constructs a list containing the elements of the specified collection, in the  
	    // order they are returned by the collection's iterator.
	    // Parameters:
	    // c - the collection whose elements are to be placed into this list
	    // Throws:
	    // NullPointerException - if the specified collection is null
	    // ...
		Collection<Feedback> feedbackValues = feedbackDataBase.getFeedbackDictionary().values();
		ArrayList<Feedback> listOfValues = new ArrayList<Feedback>(feedbackValues);
	    System.out.println("listOfValues");
	    System.out.println(listOfValues.size());
	    
	    
	    
	    return listOfValues; //TO CHANGE
		
	}
	
	public String deleteFeedback(Feedback feedback) {
	
	    //...
		System.out.println("voy a borrar");
		System.out.println(feedback);
	    
		feedbackDataBase.deleteFeedback(feedback);
	    
	    
	    
	    
	    
	    
	    return "list.xhtml"; //TO CHANGE
	    
	}

}
