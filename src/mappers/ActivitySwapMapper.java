package mappers;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 *  @author Manthan Thakar
 */
public class ActivitySwapMapper extends Mapper<IntWritable, IntWritable, IntWritable, IntWritable> {

    public void map(IntWritable key, IntWritable value, Context context) throws IOException, InterruptedException {
        context.write(value, key);
    }
}