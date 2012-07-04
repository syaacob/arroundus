package hellograils.permodoro

class Task {
	String summary;
	String details;
	Date createdDate;
	Date deadLine;
	Long timeSpent = 0L;
	
	static hasMany = [tags:Tag];
	
    static constraints = {
		summary blank:false, unique :true;
		details blank:false,maxSize:1000;
		deadLine nullable:true;
		timeSpent min:0L;
    }
}
