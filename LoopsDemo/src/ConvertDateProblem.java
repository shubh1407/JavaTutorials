import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     *  
     *  01 14 2000 -> Monday
     */

    public static String findDay(int month, int day, int year) {

		/*
		 * Calendar calendar = Calendar.getInstance();
		 * 
		 * calendar.set(year, (month-1), day);
		 * 
		 * int dayName = calendar.get(Calendar.DAY_OF_WEEK);
		 * System.out.println(calendar.get(Calendar.WEEK_OF_YEAR)); switch (dayName) {
		 * case 1: return "Sunday"; case 2: return "Monday"; case 3: return "Tuesday";
		 * case 4: return "Wednesday"; case 5: return "Thursday"; case 6: return
		 * "Friday"; case 7: return "Saturday"; default: return ""; }
		 */
    	
    	
    	
    }

}

public class ConvertDateProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
