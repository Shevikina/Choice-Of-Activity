abstract class Serials:Choisable,Film() {
    abstract override val name:String
    abstract override val author:String
    abstract override val genre:String
    abstract override val ageRating:Int
    abstract override var actors:Array<String>
    abstract override var time:Int
    abstract var episodeAmount:Int
    abstract override fun review()
    abstract fun episodeName()
}