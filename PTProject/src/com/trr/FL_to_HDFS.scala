package com.trr

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.FileSystem
import org.apache.hadoop.fs.Path

object FL_to_HDFS {

  def main(args: Array[String]) {

    val conf = new SparkConf().setAppName("ANT").setMaster("local")
    val sc = new SparkContext(conf)

    val path = ""

    //val data = sc.textFile("D:\\hadoop\\Notes\\Spark\\Data FM for Task 2\\FINAL_FROM_DF")

    //data.saveAsTextFile(path, codec)

    val srcFilePath = "https://127.0.0.1/user/cloudera/Feb14"
    val hadoopConf = new Configuration()
    //hdfs://hdfs://hdfs://
    val hdfs = FileSystem.get(hadoopConf)
    
    val srcPath = new Path(srcFilePath)
     println(hdfs.exists(srcPath))
    
  }

}