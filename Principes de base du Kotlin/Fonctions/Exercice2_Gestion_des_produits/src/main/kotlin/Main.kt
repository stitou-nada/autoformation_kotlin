
var Produit = mutableListOf<String>()
fun main() {
    var i = 0
    while (i <4) {
        println("List gestion des produits")
        println("1.Ajouter")
        println("2.Afficher")
        println("3.Supprimer")
        println("4.Sortie")
        println("-----------")
        print("Choisie un nombre : ")
        var value = readLine()!!.toInt()
        println("-----------")
        when (value) {
            1 -> Ajouter()
            2 -> Afficher()
            3 -> Supprimer()
            4 -> break
            else -> { // Note the block
                println("Le nombre n'est pas existé,choisie num 1 à 4 ")
                println("-----------")
            }
        }
    }
}
fun Ajouter(){
    print("Enter nom de produit: ")

    var nom= readLine()!!.toString()
    Produit.add(nom)
}

fun Afficher(){
    println("list des produits : ")
     for(nom in Produit){
         println(nom)
     }
    println("-----------")
}
fun Supprimer(){
    println("Entrez le nom du produit que vous devez supprimer : ")
    var delete = readLine()!!.toString()
    Produit.remove(delete)
}



