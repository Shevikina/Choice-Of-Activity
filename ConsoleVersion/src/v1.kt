const val yes="Да"

fun main(args:Array<String>) {
    var film:Array<Film> = Array(5){Film()}
println("У вас явно есть свободная минутка.\nХотите почитатать или посмотреть что-нибудь?")
    if(readLine()==yes){
        var error1=false
        var error2=false
        while(!error2) {
        println("Ваш список пуст.\nДобавите что-нибудь, чтобы была возможность выбрать?")
            if(readLine()!=yes) error2=true
            else {
                println("Что добавить?\n" +
                        "Книга, Фильм, Сериал")
                when(readLine()){
                    "Книга"->createBook()
                    "Фильм"->film=createFilm(film)
                    "Сериал"->createSerial()
                    else -> {
                        println("Простите. Мы не понимаем что вы выбрали.\nХотите выйти?")
                        if(readLine()==yes) {
                            error2 = true
                            println("Удачного дня! Возвращайтесь к нам ещё!")
                        }
                    }
                }
            }

        }
        while(!error1){
            println("Выбирайте, чем хотите себя занять:\nКнига, Фильм, Сериал")
            when(readLine()){
                "Книга"->watchBook()
                "Фильм"->watchFilm(film)
                "Сериал"->watchSerial()
                else -> {
                    println("Простите. Мы не понимаем что вы выбрали.\nХотите выйти?")
                    if(readLine()==yes) {
                        error1=true
                        println("Удачного дня! Возвращайтесь к нам ещё!")
                    }
                }
            }
        }
    }
    else println("Простите, мы вас не понимаем. До новых встреч!\nОчистка списка.")
}
fun createBook(){

}
fun createFilm(film:Array<Film>):Array<Film>{
    var error=false
    print("Фильм!")
    while(!error){
        println("Доступно 2 жанра.\n" +
                "Детектив и Меллодрамма\n"+
                "Какой жанр имеет фильм, который хотите добавить вы?")
        when(readLine()) {
            "Детектив"->{
                println("Введите количество фильмов, которое хотите добавить.\nДальнейшее изменение будет невозможно.")
                var num= readLine()!!.toInt()
                if(num>=0){
                    for(index in 0 until num) {
                        film[index].genre="Детектив"
                        println("Как называется фильм?")
                        film[index].name= readLine() as String
                        println("Кто режжисер?")
                        film[index].author= readLine() as String
                        println("Сколько длится в минутах?")
                        film[index].time= readLine()!!.toInt()
                        println("Какой возрастной рейтинг у фильма?")
                        film[index].ageRating= readLine()!!.toInt()
                        film[index].intActors()
                    }
                }
            }
            "Мелодрамма"->{
                println("Введите количество фильмов, которое хотите добавить.\nДальнейшее изменение будет невозможно.")
                var num= readLine()!!.toInt()
                if(num>=0){
                    for(index in 0 until num) {
                        film[index].genre="Мелодрамма"
                        println("Как называется фильм?")
                        film[index].name= readLine() as String
                        println("Кто режжисер?")
                        film[index].author= readLine() as String
                        println("Сколько длится в минутах?")
                        film[index].time= readLine()!!.toInt()
                        println("Какой возрастной рейтинг у фильма?")
                        film[index].ageRating= readLine()!!.toInt()
                        film[index].intActors()
                    }
                }
            }
            else->{
                println("Хотите выбрать что-то другое?")
                if(readLine()==yes)
                    error=true
            }
        }
    }
    return film
}
fun createSerial(){

}
fun watchBook(){
    println("Инициализация книги")
}
fun watchFilm(film:Array<Film>){
    var error=false
    println("Фильм! Ох, к сожалению, у нас доступно только 2 вида жанров.\n" +
            "Какой бы хотели посмотреть вы?")
    while(!error){
        println("Детектив или Меллодрамму?")
        when(readLine()) {
            "Детектив"->{
                println("Вы выбрали жанр ${film[0].genre}.\nВам доступны следующие фильмы:")
                for(index in film.indices){
                    println("${index+1}) ${film[index]}")
                }
                println("Введите номер фильма, который хотите посмотреть")
                var num= readLine()!!.toInt()-1
                if(num>=0&&num<film.size){
                    film[num].review()
                }
            }
            "Мелодрамму"->{
                println("Вы выбрали жанр ${film[0].genre}.\nВам доступны следующие фильмы:")
                for(index in film.indices){
                    println("${index+1}) ${film[index]}")
                }
                println("Введите номер фильма, который хотите посмотреть")
                var num= readLine()!!.toInt()-1
                if(num>=0&&num<film.size)
                    film[num].review()
            }
            else->{
                println("Хотите выбрать что-то другое?")
                if(readLine()==yes)
                    error=true
            }
        }
    }
}
fun watchSerial(){
    println("Инициализация серила")
}