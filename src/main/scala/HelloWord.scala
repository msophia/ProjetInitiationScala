import Personne._
import java.text._
import java.util.Calendar
import java.util.Date
//import scala.collection.immutable.

//Le

object HelloWord {
  private val variable : String = ""
  def FonctionPersonne(a:String, b:String, date:String, pays :String, salaire : Double) : Personne =  {
    var formater = new SimpleDateFormat("dd-MM-yyyy")
    var aujourdhui: Date = new Date()

    var dateNaiss : Date = formater.parse(date)
    var c: Calendar= Calendar.getInstance()

    val year1 = c.getWeekYear
    c.setTime(dateNaiss)
    val year2 = c.getWeekYear

    var age = year1-year2

    val personne  = Personne(a,b,age,pays,salaire)
    return personne


  }
  def CalculSomme(nb1:Int, nb2:Int) : Int =  {
    val resultat = nb1+nb2
    var i = 0
    for(i <- 1 to 10){
      println("valeur incorrecte")
    }
    return resultat

  }

  def main(args: Array[String]): Unit = {
    //Unit est eguivalent a void
    println("Hello word mon premier programme en scala")
    val text : String = "Hello word" //declaration de variable

    val test = println(text) //deuxieme maniere de declarer les variables
    test
      val sophia = Personne("TIECOURA","MARIETOU",28,"CI",50.250)
      val etudiant = Personne("Julien", "JAMES" ,31, "CI", 15.05)// parce que nom est optionnel
      val age_personne = sophia.age
      //println("l age est de " + etudiant.nom)


    val testeur = FonctionPersonne("Abraham","Tiecoura","05-11-1992","ci",15.05)
    println(testeur)





  }
}
