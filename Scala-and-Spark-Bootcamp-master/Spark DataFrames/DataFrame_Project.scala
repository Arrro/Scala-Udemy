// DATAFRAME PROJECT
// Use the Netflix_2011_2016.csv file to Answer and complete
// the commented tasks below!
// Clean code count = 2.7
// Start a simple Spark Session

// Load the Netflix Stock CSV File, have Spark infer the data types.
val df = spark.read.option("header","true").option("inferSchema","true").csv("Netflix_2011_2016.csv")
// What are the column names?
df.columns
// What does the Schema look like?
df.printSchema
// Print out the first 5 rows.
df.head(5)
// Use describe() to learn about the DataFrame.
df.describe().show()
// Create a new dataframe with a column called HV Ratio that
// is the ratio of the High Price versus volume of stock traded
// for a day.
val hv = df.withColumn("High Volume Ratio",df("High")/df("Volume"))
hv.show()
// What day had the Peak High in Price?
df.orderBy(df("High").desc).select(df("Date")).show(1)
// What is the mean of the Close column?
df.select(mean("Close")).show()
// What is the max and min of the Volume column?
df.select(min("Volume")).show()
df.select(max("Volume")).show()
// For Scala/Spark $ Syntax
import spark.implicits._
// How many days was the Close lower than $ 600?
df.where("Close < 600").count()
// What percentage of the time was the High greater than $500 ?
df.filter($"High" > 500).count() / 1259.0
// What is the Pearson correlation between High and Volume?
df.select(corr("High","Volume")).show()
// What is the max High per year?
df.groupBy($"Date").max().select($"Date",$"max(High)").show()

df.groupBy($"Date").agg(Map("High" -> "Max")).show() // cleaner?
// What is the average Close for each Calender Month?
df.groupBy(month($"Date").as("Month")).mean("Close").orderBy("Month").show()