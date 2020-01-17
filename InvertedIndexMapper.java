import org.apache.hadoop.io.LongWritable; 
import org.apache.hadoop.io.Text; 
import org.apache.hadoop.mapreduce.Mapper; 
 
public class InvertedIndexMapper extends Mapper<LongWritable, Text, Text, Text> { 
 
 private Text wordText = new Text(); 
 private final static Text document = new Text(); 
 
 protected void map(LongWritable key, Text value, Context context) 
   throws java.io.IOException, InterruptedException { 
  String[] line = value.toString().split("="); 
 
  String documentName = line[0]; 
  document.set(documentName); 
  String textStr = line[1]; 
  String[] wordArray = textStr.split(" "); 
  for(int i = 0; i <  wordArray.length; i++) {  
   wordText.set(wordArray[i]); 
   context.write(wordText,document); 
  } 
 } 
} 
