package com.opstty.mapper;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.io.IOException;

public class KindCountMapper extends Mapper<Object, Text, Text, IntWritable> {
    public int indexLine = 0;

    public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
        if (indexLine != 0) {
            context.write(new Text(value.toString().split(";")[2]), new IntWritable(1));
        }
        indexLine++;
    }
}