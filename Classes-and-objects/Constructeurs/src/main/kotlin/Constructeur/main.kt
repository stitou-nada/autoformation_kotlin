
package Constructeur



fun BuildAquarium(){
   val aquarium1 = Aquarium()
    aquarium1.printSize()
    // hauteur et longueur par defaut
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
 val aquarium6 = Aquarium(numberOfFish = 29)
 aquarium6.printSize()
 aquarium6.volume = 70
 aquarium6.printSize()
    //println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")

}
fun main (){
    BuildAquarium()
}
