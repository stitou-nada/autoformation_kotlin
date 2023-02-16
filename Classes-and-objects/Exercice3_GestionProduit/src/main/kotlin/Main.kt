fun main(args: Array<String>) {
    var i=0
    var produit  = Produit()
    while (i<4) {
    produit.Menu()
        var value = readLine()!!.toInt()
        when(value){
            1 -> produit.Ajouter()
            2 -> produit.Afficher()
            3 -> produit.Supprimer()
            4 -> break
        }
    }
}