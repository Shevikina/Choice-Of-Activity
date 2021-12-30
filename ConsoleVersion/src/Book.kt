abstract class Book:Choisable {
    abstract override val name:String
    abstract override val author:String
    abstract override val genre:String
    abstract override val ageRating:Int
    abstract var hero:String
    abstract fun reed()
}