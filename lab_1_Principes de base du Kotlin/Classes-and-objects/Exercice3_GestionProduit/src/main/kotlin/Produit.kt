interface IGestionProduit {



  abstract fun Ajouter()
  abstract  fun Supprimer()
  abstract fun Afficher()

}
 class GestionProduit:IGestionProduit{
     val  produit = mutableListOf<String>()
     override fun Afficher() {
             println("List des produit: ")
         for (nom in produit){
             println(nom)


         }
     }

     override fun Ajouter() {
         print("Entrer nom de produit: ")
         var nom = readLine()!!.toString()
         produit.add(nom)


     }

     override fun Supprimer() {
         println("Entrez le nom du produit que vous devez supprimer : ")
         var delete = readLine()!!.toString()
         produit.remove(delete)
     }
 }



