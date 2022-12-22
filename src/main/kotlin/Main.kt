fun main(){
    var part1=0
    var part2=0
    var tailTab=0
    var n = 0
    var milieu = 0
    var list : MutableList<Int> = mutableListOf<Int>()

    println("Taille du tableau !?____ : ")
    tailTab= readLine()!!.toInt()
    while (list.size<tailTab){
      n = readLine()!!.toInt()
      println("-----------------")
      list.add(n)
    }
    for(elt in list){
        println(elt)
    }
    println("Nombre recherché !? :  ")
    n= readLine()!!.toInt()
    part2 = tailTab -1
    while (part1<=part2){
        milieu= (part1+part2) / 2

        if (n==list[milieu]){
            println("Element trouvé a l'index  : $milieu")
            break
        }
        else if (n<list[milieu]){
            part2 = milieu -1
        }
        else{
            part1= milieu+1
        }
    }
    if (n>=0){
        println("Element trouvé ! valeur $n")
    }else{
        println("404")
    }
}