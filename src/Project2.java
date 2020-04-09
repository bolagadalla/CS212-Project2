import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * This class is in charge of reading a .txt file and creating a Clock object out of the content of the file
 * Then adding those objects as nodes into two lists, UnsortedClockList and SortedClockList which both inherets from a super class called ClockList
 * Then creating a GUI to represent both the sorted and unsorted lists
 * 
 * @author Bola Gadalla
 *
 */
public class Project2
{
   // A global StringToneizer
   public static StringTokenizer myTokens;
   // Global ClockLists
   public static SortedClockList sortedClocks;
   public static UnsortedClockList unsortedClocks;
   
   public static void main(String[] args) throws IOException
   {
      System.out.println("Please type the file name to read (include .txt at the end):\n");
      // Takes the first parameter of the args
      AddToLists(args[0]);
      // Creates a new ClockGUI object
      ClockGUI clockGUI = new ClockGUI();
      // Showing a window with the data in it
      clockGUI.ShowClockData("Project 2 - Clock Times", 400, 400, unsortedClocks, sortedClocks);
   }

   /**
    * This opens the file name myFile and reads the content of it and tokanize it and store it into a clock object
    * which then is added to the ClockLists
    * 
    * @param myFile - The file name to open, PLEASE ENTER FILE NAME IN THE CONCOLE, INCLUDE .txt
    * @throws IOException - Throws an exception if there was no file
    */
   public static void AddToLists(String myFile) throws IOException
   {
      // Initializing the ClockLists children
      sortedClocks = new SortedClockList();
      unsortedClocks = new UnsortedClockList();
      // Creates a BufferedReader object
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
      String line = br.readLine();
      while(line != null)
      {
         myTokens = new StringTokenizer(line, ":");
         if (myTokens.countTokens() > 2)
         {
            // Create a Clock object with parameters being the tokens
            Clock clock = new Clock(Integer.parseInt(myTokens.nextToken()), Integer.parseInt(myTokens.nextToken()), Integer.parseInt(myTokens.nextToken()));
            // Adds them into the appropriate list
            sortedClocks.Add(clock);
            unsortedClocks.Add(clock);
            line = br.readLine();
         }
         else
         {
            System.out.println(line);
            line = br.readLine();
         }
      }
      br.close();
   }
}
