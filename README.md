
The Spark MLlib Scala development environment is implemented on Docker.

This work is based on 

[1] https://docs.docker.com/engine/tutorials/dockervolumes
[2] https://developers.google.com/protocol-buffers
[3] http://findbugs.sourceforge.net
[4] http://spark.apache.org/docs/latest/submitting-applications.html


NOTICE: The spark version 2.1.0 is changed to 2.1.0-SNAPSHOT for the sbt dependencies.


[1] download (git clone) this source coded folder.

[2] cd downloaded-source-code-folder

[3] sudo make BIND_DIR=. shell

	wait ... wait ... then a bash shell will be ready (root@ed0f119ef223:/#)

[4] root@ed0f119ef223:/# cd /home/spark_MLlib

[5] root@ed0f119ef223:/home/spark_MLlib# cd spark-2.1.0

[6] root@ed0f119ef223:/home/spark_MLlib/spark-2.1.0# ./dev/change-scala-version.sh 2.11

[7] root@ed0f119ef223:/home/spark_MLlib/spark-2.1.0# sbt sbt-version

[8] root@ed0f119ef223:/home/spark_MLlib/spark-2.1.0# ./build/sbt -Dscala-2.11 -Pyarn -Phadoop-2.7 -Dhadoop.version=2.7.3 -DskipTests clean package

[9] root@ed0f119ef223:/home/spark_MLlib/spark-2.1.0# sbt -mem 4096  publish-local 

[10] root@ed0f119ef223:/home/spark_MLlib/spark-2.1.0# cd ..

[11] root@ed0f119ef223:/home/spark_MLlib# cd examples/ml/kmeans

[12] root@ed0f119ef223:/home/spark_MLlib/examples/ml/kmeans# sbt  -mem 4096 clean compile

[13] root@ed0f119ef223:/home/spark_MLlib/examples/ml/kmeans# sbt  -mem 4096 clean package

[14] root@ed0f119ef223:/home/spark_MLlib/examples/ml/kmeans# /home/spark_MLlib/spark-2.1.0/bin/spark-submit --driver-memory 4g ./target/scala-2.11/kmeans_2.11-1.0.jar

[15] To disable the message that says "k is set to, 2" after "... data is loaded ... ", open spark-2.1.0/mllib/src/main/scala/org/apache/spark/ml/clustering$KMeans.scala in the local machine (or in Docker) and comment out line # 282 (println(s"k is set to, $value"))  

[16] repeat from the step [8]
