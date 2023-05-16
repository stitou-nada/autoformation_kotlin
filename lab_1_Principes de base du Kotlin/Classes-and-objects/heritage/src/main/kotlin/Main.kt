fun main(args: Array<String>) {
   buildAquarium()
}
fun buildAquarium(){
    val aquarium = Aquarium()
    aquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}