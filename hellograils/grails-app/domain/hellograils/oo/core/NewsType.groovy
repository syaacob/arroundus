package hellograils.oo.core

class NewsType {
	String code;
	String description;
    static constraints = {
		code blank:false, unique :true,nullable :false ;
		description blank:false;
    }
}
