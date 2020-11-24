import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Collection;

public class A1231ENor{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner read;
        ArrayList<String> testList = new ArrayList<>();
        
        String input ;
        System.out.println("Please enter a value ");
        input = in.nextLine();    
        
        while(!input.equals("")){
            read = new Scanner(input);
            while(read.hasNext()){
                testList.add(read.next());
            }   
            System.out.println("Please enter your value ");
            input = in.nextLine();
        }
        
        for(String i : testList){
            System.out.println(i);
        }
        System.out.println("Emmett Normand CIS 231 Assignment 1");
    } 
    public ArrayList<String> fillArrayList(String input){
        ArrayList<String> sList = new ArrayList();
        while(input.hasNext()){
            int i = 0;
            sList.add(input.next());
            if(sList.get(i).equals("")){
                break;
            }
        }
        return sList;
    }
    public ArrayList<Integer> extractIntegers(ArrayList<String> sList){
        ArrayList<Integer> iList = new ArrayList<>(); 
        for (String i : sList){
            if(i.matches("\\d+")){
                iList.add(Integer.parseInt(i));
            }
        }
        return iList;
    }

    public static int findLargest(ArrayList<Integer> iList){
        //intializes value to outside range of random so it will be reasigned
        int large = iList.get(0);
        //compares values 
        for(Integer i : iList){
            if (i > large)
            {large = i;}
        }
        return large;
    }   
    public static int findSmallest(ArrayList<Integer> iList){
        int small = iList.get(0);
        for(Integer i : iList){
            if (i < small)
            {small = i;}
        }
        return small;
    }
    public static int average(ArrayList<Integer> iList){
        int average = 0;
        for(Integer i : iList){
            average = i + average;
        }
        average = average / iList.size(); 
        return average;
    }
    public static int size(ArrayList<Integer> iList){ 
        int size = iList.size();
        return size;
    }
    public static int findMode(ArrayList<Integer> iList){
        //https://stackoverflow.com/questions/36416048/java-program-to-find-mode-in-an-array-list
    }
    
}