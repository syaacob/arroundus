package hellograils.hotel

class RoomCategory {
	String code;
	String description;
	static hasMany = [rooms : Room]
    static constraints = {
		code blank:false, unique:true;
		description blank:false;
    }
	
	String toString(){
		return code;
	}
}
