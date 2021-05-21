object Collectiondedonnee {
def macollectiondedonnee():Unit = {

  val maliste = List("Mathematique","Anglais","Histoire","EPS")
  val maliste2 : List[String] = List("Jvc","Anglais","fr","us")
  val maliste3: List[Int]= List(10,20,30,40)

  maliste.foreach(l =>println(l.toUpperCase))
  maliste.foreach(l =>
    {
      val var2 = l.toUpperCase
    }
  )

  maliste3.foreach(l => println(l*10))
  val k2 = maliste3.map(l=>l.toString)
  println(k2)

  val montuple = (maliste,maliste2)
  montuple._2
  val montuple1 = (maliste,Personne("Maman","Rosa",15, "Mali",10.2))
  var(a,b) = ("10",Personne("Maman","Rosa",15, "Mali",10.2))

  val mon_map : Map[String, String] = Map(
    "cc" -> "cocody",
    "Bassam" -> "GrandBassam",
    "yy" -> "poy"
  )
  println(mon_map.toList)
  mon_map.keys.foreach(k => println(k.toUpperCase()))
  val liste_values = mon_map.values.foreach(k => println(k.toUpperCase()))
  println(mon_map("cc"))

  val mon_tableau : Array[String] = Array("julien","Nanou")
  println(mon_tableau(0))
  mon_tableau(0) = "Saly"
  println(mon_tableau)



}
def macollectionsquence():Unit={
  val maseq = Seq("Doudou","Sophia","Abraham","yve","Jean","Rene","Rosa","Mamour")
  val maseqSomme = maseq.map(l=>l.length()).reverse.foreach(l=>println(l))
  val seq_filter = maseq.filter(l=> l.length()>3)
  seq_filter.foreach(l=>println(l))
  //maseqSomme.foreach(l=>println(l))
}



  def main(args: Array[String]): Unit = {
    macollectiondedonnee()
    //macollectionsquence()
  }
}
