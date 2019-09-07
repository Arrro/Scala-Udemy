import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()
val df = spark.read.option("header", "true").option("inferSchema", "true").csv("CitiGroup2006_2008")

df.printSchema()

////////////////
import spark.implicits._

df.filter($"Close" > 480).show()
df.filter("Close > 480").show() // SpparkSQL syntax version, does same as above

df.filter($"Close" < 480 && $"High" < 480).show()
df.filter("Close < 480 AND High < 480").show() // SpparkSQL syntax version, does same as above

val CH_low = df.filter("Close < 480 AND High < 480").collect()
val CH_low_count = df.filter("Close < 480 AND High < 480").count()

df.filter($"High" === 484.40).show() // Dataframes want a boolean with just == so we need to explict decalre the value with ===

df.select(corr("High","Low")).show()