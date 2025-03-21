/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version    2016.02.29
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;
    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        //10
        int hour = 0;
        while( hour < hourCounts.length){
            System.out.println(hour + ": " + hourCounts[hour]);
            hour++;
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
//Part 1
//1)Busy hour are hour 18
//2)public int person(){
//    int[] arr person = ()
//}
//3)public boolean vacant(){
//    int[] arr vacant = ()
//}
//5) 1.the first one is that praket is in the wrong place should be place after the int
//   2. is supposed to be boolean [] occupied = new boolean [5000]; 
//6)a. double [] reading = new double [60];
//  b. String [] urls = new String [90];
//  c. TicketMachine [] machine = new TicketMachine [5];
//7) 20
//8) is suppose to be new double[50];
//9) it becames out of bound



