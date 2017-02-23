

import org.apache.spark.ml.clustering.KMeans
import org.apache.spark.sql.SparkSession

object kmeans {

	def main(args: Array[String]):Unit = {


		println("... Scala Cluster KMeans Example ...")

		val spark = SparkSession
      			.builder
      			.appName(s"${this.getClass.getSimpleName}").master("local")
      			.getOrCreate()

		// Loads data.
    		val dataset = spark.read.format("libsvm").load("src/main/resources/sample_kmeans_data.txt")
		println("... data is loaded ...")

		// Trains a k-means model.
    		val kmeans = new KMeans().setK(2).setSeed(1L)
    		val model = kmeans.fit(dataset)

		println("... fit ...")

		// Evaluate clustering by computing Within Set Sum of Squared Errors.
    		val WSSSE = model.computeCost(dataset)
		println("\n")
    		println(s"Within Set Sum of Squared Errors = $WSSSE")
		println("\n")

		// Shows the result.
    		println("Cluster Centers: ")
    		model.clusterCenters.foreach(println)
		println("")

		spark.stop()
	}
}
