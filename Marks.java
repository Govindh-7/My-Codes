	
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Marks {

    private static Map<String, Map<String, Integer>> a;

    public static void main(String[] args) {
        a = new HashMap<>();
        
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Students for reports:");
        int snoint = sc.nextInt();

        while (snoint > 0) {
            System.out.println("Enter name of the Student");
            String name = sc.next();

            Map<String, Integer> submap = new HashMap<>();

            System.out.println("Enter marks in English");
            Integer eng = Integer.parseInt(sc.next());
            submap.put("English", eng);

            System.out.println("Enter marks in Hindi");
            Integer hin = Integer.parseInt(sc.next());
            submap.put("Hindi  ", hin);

            System.out.println("Enter marks in Telugu");
            Integer tel = Integer.parseInt(sc.next());
            submap.put("Telugu ", tel);

            System.out.println("Enter marks in Maths");
            Integer math = Integer.parseInt(sc.next());
            submap.put("Maths  ", math);

            System.out.println("Enter marks in Science");
            Integer sci = Integer.parseInt(sc.next());
            submap.put("Science", sci);

            System.out.println("Enter marks in Social");
            Integer soc = Integer.parseInt(sc.next());
            submap.put("Social ", soc);

            a.put(name, new HashMap<>(submap));
            snoint--;
        }
        	
        	 System.out.println(b(a));
        	 sc.close();
        }
       
   
    static String b(Map<String, Map<String, Integer>> studentMarks) {
        StringBuilder result = new StringBuilder();
      
        for (Map.Entry<String, Map<String, Integer>> i : studentMarks.entrySet()) {
            result.append(i.getKey()).append(":\n");

         long   totalmarks =0;
         long no_sub=6;
         long average =0;
            Map<String, Integer> Marks =i.getValue();

            for (Map.Entry<String, Integer> subjectEntry : Marks.entrySet()) {
                result.append("  ").append(subjectEntry.getKey()).append(" =  ")
                      .append(subjectEntry.getValue()).append("\n");
                totalmarks  +=  subjectEntry.getValue();
                average = (totalmarks/no_sub);
               
            }

            result.append("  total marks   = ").append(totalmarks).append("\n").append("  average marks = ").append(average).append("\n\n");
        }

        return (result.toString());
    }
}
