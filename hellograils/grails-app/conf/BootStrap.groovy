import hellograils.hotel.RoomCategory

class BootStrap {

    def init = { servletContext ->
		def superiorRoom = new RoomCategory(code: "superior",description: "superior room").save(failOnError:true);
		def deluxeRoom = new RoomCategory(code: "deluxe",description: "deluxe room").save(failOnError:true);
    }
    def destroy = {
    }
}
