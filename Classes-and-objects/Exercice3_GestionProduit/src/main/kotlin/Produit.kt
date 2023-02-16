 abstract class GestionProduit {
     val  produit = mutableListOf<String>()
   fun Menu(){
       println("List gestion des produits: ")
       println("1.Ajouter")
       println("2.Afficher")
       println("3.Supprimer")
       println("4.Sortie")
       println("-----------")
       print("Choisie un nombre : ")
   }


  abstract fun Ajouter()
  abstract  fun Supprimer()
  abstract fun Afficher()

}
 class Produit:GestionProduit(){

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



