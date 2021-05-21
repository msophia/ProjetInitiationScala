import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {
  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
  def sessionSpark(): Unit = {
    System.setProperty("hadoop.home.dir","C:\\Hadoop")
    val ss = SparkSession.builder()
      .master(master = "local[*]")
      .appName(name = "initiationSpark_ma_premiere_application")
      .getOrCreate()

    //creation dun RDD
    val rdd1 = ss.sparkContext.parallelize(Seq("Ma premiere application spark je suis une etudiante de l'INPHB"))
    rdd1.foreach(l=> println(l))

    val df_1 = ss.read
      .format(source = "csv")
      .option("inferSchema","true")
      .option("header","true")
      .option("delimiter",";")
      .csv(path = "D:\\COURSBIGDATA\\HADOOP\\orders_csv.csv")

      df_1.show(numRows = 18)
      df_1.printSchema()
    //Creation de vue optionnelle car pas de cluster
      df_1.createOrReplaceTempView(viewName = "orders")
      //df_1.createGlobalTempView()//rends le metastore disponible dans plusieurs sessions
      ss.sql(sqlText = "select * from orders where city = 'NEWTON' ").show()
    ss.sql(sqlText = "select * from orders where city = 'NEWTON' ").explain()

  }


}
