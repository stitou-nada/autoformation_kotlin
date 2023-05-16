fun main(args: Array<String>) {

    var i=0
    var produit  = GestionProduit()
    while (i<4){
        println("List gestion des produits")
        println("1.Ajouter")
        println("2.Afficher")
        println("3.Supprimer")
        println("4.Sortie")
        println("-----------")
        print("Choisie u n nombre : ")
        var value = readLine()!!.toInt()
        when(value){
            1 -> produit.Ajouter()
            2 -> produit.Afficher()
            3 -> produit.Supprimer()
            4 -> break
        }
    }
}