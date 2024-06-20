import org.apache.spark.sql.SparkSession

object TestSparkApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder
      .appName("TestSparkApp")
      .master("local[*]")
      .getOrCreate()

    // Create a simple DataFrame
    val data = Seq(("James", "Smith"), ("Anna", "Rose"), ("Robert", "Williams"))
    val df = spark.createDataFrame(data).toDF("FirstName", "LastName")

    // Show the DataFrame
    df.show()

    // Stop the SparkSession
    spark.stop()
  }
}

