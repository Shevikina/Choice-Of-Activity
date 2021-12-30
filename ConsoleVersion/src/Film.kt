open class Film(override var name: String = "",
                override var author: String="",
                override var ageRating:Int=0,
                var time:Int=0):Choisable {
    override var genre:String=""
    var actors= Array(5){""}
    fun review() {
        println("Вы смотрите $name\nАвтора $author\n" +
                "Данный фильм длится $time минут и имеет возрастной рейтинг $ageRating+.\nВ главных ролях:")
        var index=0
        while(index<actors.size&&actors[index]!=""){
            print("$actors[index]")
            index++
        }
        if(actors[0]=="")
            println("...\nК сожалению, мы без понятия кто играет в главных ролях")
        for(x in 1 until actors.size)
            if(actors[x]==""){
                print("...\nДругие актеры не добавлены")
            }
    }
}