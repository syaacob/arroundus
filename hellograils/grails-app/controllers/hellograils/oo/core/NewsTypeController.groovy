package hellograils.oo.core

class NewsTypeController {

	
	def doSave={
		def newsType = new NewsType(params);
		println "abc" + newsType;
		if(newsType.validate()){
			
			newsType.save();
		}
		else
		{
			render view: 'doSave', model: [newsType: newsType]
			return
		}
	
	}
}
