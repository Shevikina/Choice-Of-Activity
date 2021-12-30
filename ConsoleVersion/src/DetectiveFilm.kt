class DetectiveFilm(override var name: String = "",
                    override var author: String="",
                    override var ageRating:Int=0,
                    override var time:Int=0):Film() {
    override val genre="Детектив"
    override var actors= Array(5){""}
    fun intActors(){
        println("Доступно добавление 5 актеров.\nВы хотите добавить актеров?")
        if(readLine()==yes){
            println("Введите имена:")
            for(x in 0..4) {
                var scanner= readLine()
                if(scanner is String)
                    actors[x]= scanner
            }
        }
        else println("Что-то пошло не так.")
    }
    override fun review(){
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