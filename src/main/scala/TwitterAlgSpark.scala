import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SQLContext
import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by Favio on 04/05/15.
 */

object TwitterAlgSpark {
  def main(args: Array[String]) {
    Logger.getLogger("org").setLevel(Level.WARN)
    Logger.getLogger("akka").setLevel(Level.OFF)

    val conf = new SparkConf()
      //      .setMaster("local")
      .setMaster("mesos://master.mcbo.mood.com.ve:5050")
      .setAppName("Twitter Algebird Spark")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    sc.stop()
  }
}
