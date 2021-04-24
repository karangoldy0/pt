package com.cpr.sc

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object parallelize {

  def main(args: Array[String]) {

    var conf = new SparkConf().setAppName("PR").setMaster("local")
    var sc = new SparkContext(conf)
    System.setProperty("hadoop.home.dir", "D:\\");

    var file = "C:\\Users\\HP\\Desktop\\hadoop\\Notes\\Python\\DataFile.txt"

    var data = sc.textFile(file, 1)
    var d1 = data.flatMap(x => x.split(""))
    d1.collect().foreach(print)

    sc.stop()

  }

}