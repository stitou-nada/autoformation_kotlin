abstract class AquariumFish {
  abstract val color: String
}

interface FishAction{
  fun eat()
}
class Shark :AquariumFish(){
  override val color= "gray"
  fun eat(){
    println("hunt and eat fish")
  }

}

class  Plecostomus: AquariumFish(){
  override val color= "blue"
  fun eat(){
    println("eat algae")
  }
}