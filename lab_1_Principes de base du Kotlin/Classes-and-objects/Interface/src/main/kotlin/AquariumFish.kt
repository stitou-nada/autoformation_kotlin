abstract class AquariumFish {
  abstract val color: String
}

interface FishAction{
  fun eat()
}
interface FishAge{
  val age : Int
}
object GoldAge : FishAge{
  override val age = 11
}
class Shark :AquariumFish() , FishAction ,FishAge by GoldAge {
  override val color= "gray"

  override fun eat(){
    println("hunt and eat fish")
  }

}

class  Plecostomus: AquariumFish() , FishAction{
  override val color= "blue"
  override fun eat(){
    println("eat algae")
  }
}