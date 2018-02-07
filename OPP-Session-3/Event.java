 
/**
 * 
 * @author Vinod Patel
 * This class depicts the occurring event for a particular candidate
 */
public class Event {
	
	//variable to check if the event is positive 
	boolean ok = false;
	 
	//variable to check if the event is negative
	boolean reject = false;
	
	//name of the event
	String eventName;
	
	/**
	 * constructor initializing the 
	 * @param eventName name of the event
	 */
	Event(String eventName){
		this.eventName = eventName;
	}
	
	/**
	 * method to return the value of ok variable
	 * @return boolean value of ok
	 */
	public boolean isOk() {
		return ok;
	}

   /**
    * method to set value of ok variable
    * @param ok value of ok variable
    */
	public void setOk(boolean ok) {
		this.ok = ok;
	}


	/**
	 * method to return the value of reject variable
	 * @return boolean value of reject
	 */
	public boolean isReject() {
		return reject;
	}

    /**
    * method to set value of reject variable
    * @param ok value of reject variable
    */
	public void setReject(boolean reject) {
		this.reject = reject;
	}

     
	/**
	 * method to return the name of the event
	 * @return eventName the event name
	 */
	public String getEventName() {
		return eventName;
	}


	/**
	 * method to set value of eventname variable
	 * @param eventName contains the name of the event
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


    /**
     * this method changes the status of boolean variable either for ok or for reject
     * according to the event name
     * @param eventStatus name of the event
     */
	public void changeStatus(String eventStatus) {
		
		//converts the event name to lower case
		eventStatus = eventStatus.toLowerCase();
		
		//checks for reject sub string in event name
		if(eventStatus.contains("reject")) {
			this.setReject(true);
		} 
		//sets ok variable true as if condition is false
		else {
			this.setOk(true);
		}
	}
	
	
}
