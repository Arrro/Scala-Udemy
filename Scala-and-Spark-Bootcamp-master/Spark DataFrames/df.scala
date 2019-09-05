import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header","true").option("inferSchema","true").csv("CitiGroup2006_2008")

// df.head(5)

for (row <- df.head(5)){
    println(row)
}

df.columns
df.describe().show()

df.select("Volume").show()
df.select($"Date",$"Close").show() // Select multiple columns

val df2 = df.withColumn("HighPlusLow",df("High")+df("Low"))
df2.printSchema()

df2.select(df2("HighPlusLow").as("HPL"), df2("Close")).show()