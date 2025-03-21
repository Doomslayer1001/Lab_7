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
    //12
    public LogAnalyzer(String filename)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader(filename);
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
    //13 and 14
        public int numberOfAccesses() {
        int total= 0;
        for(int counts : hourCounts){
            total +=counts;
        }
        // Add the value in each element of hourCounts to // total. ...
        return total;
    }
    
    //11
    public void test(){
        int[] marks = {1,3,4,5};
        
        for(int index = 0; index < marks.length; index++) {
            if(marks[index] > 0) {
                System.out.println(marks[index]);
            }
        }
    }
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    //15
    public String busiestHour(){
        int maxCount= 0;
        int busiestHour = -1;
        for (int i = 0; i < hourCounts.length;i++){
            if (hourCounts[i] > maxCount){
                maxCount = hourCounts[i];
                busiestHour = i;
            }
        }
        return "" + busiestHour + " is the busiest Hour";
    }
    //16
    public String quitiestHour(){
        int lowCount= hourCounts[0];
        int quitiestHour = 0;
        for (int i = 1; i < hourCounts.length;i++){
            if (hourCounts[i] < lowCount){
                lowCount = hourCounts[i];
                quitiestHour = i;
            }
        }
        return "" + quitiestHour + " is the quitiest Hour ";
    }
}
//Part 1
//1)Busy hour are hour 18
//2) int[] person = {}
//}
//3)int[]vacant = {}
//}
//5) 1.the first one is that praket is in the wrong place should be place after the int
//   2. is supposed to be boolean [] occupied = new boolean [5000]; 
//6)a. double [] reading = new double [60];
//  b. String [] urls = new String [90];
//  c. TicketMachine [] machine = new TicketMachine [5];
//7) 20
//8) is suppose to be new double[50];
//9) it becames out of bound
//17 the busiest hous is 18

