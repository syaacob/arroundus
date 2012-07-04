package hellograils.hotel

class Room {
	String roomNo;
	RoomCategory roomCategory;
	
    static constraints = {
		roomNo blank:false, unique:true;
		roomCategory nullable:false;
    }
}
