abstract class Serials:Choisable {
    abstract override var name:String
    abstract override var author:String
    abstract override var genre:String
    abstract override var ageRating:Int
    abstract var actors:Array<String>
    abstract var time:Int
    abstract var episodeAmount:Int
    abstract fun review()
    abstract fun episodeName()
}