import java.util.ArrayList;
import java.util.*;
public class List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Statementforlist s=new Statementforlist();
        ArrayList <Integer> arr=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("enter operation to perform");
        System.out.println("1 for update");
        System.out.println("2 for remove");
        System.out.println("3 for sort");
        System.out.println("4 for display");
        System.out.println("5 for search index");
        while(sc.hasNext()) {
            int n1 = sc.nextInt();
            s.switchselection(n1,arr);
        }

    }
}
interface inter{
    void switchselection(int n,ArrayList arr);
}
class Statementforlist implements inter{
    public void switchselection(int n,ArrayList arr){
        Scanner sc=new Scanner(System.in);
        try{
        switch (n){
            case 1:
            {
                System.out.println("enter the index to update");
                int temp=sc.nextInt();
                System.out.println("enter the new value");
                int newvar=sc.nextInt();
                arr.remove(temp-1);
                arr.add(temp-1,newvar);
            }
            break;
            case 2:{
                System.out.println("enter the object to remove");
                int temp= sc.nextInt();
                temp= arr.indexOf(temp);
                arr.remove(temp);
            }
            break;
            case 3:
            {
                Collections.sort(arr);
                System.out.println("list is sorted");
            }
            break;
            case 4:
            {
                for(int i=0;i<arr.size();i++){
                    System.out.println(arr.get(i));
                }
            }
            break;
            case 5:
            {
                System.out.println("enter the value to search");
                int temp=sc.nextInt();
                int s=(Collections.binarySearch(arr,temp));
                System.out.println(s+1);
            }
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + n);
        }}
        catch (Exception e){
            System.out.println(e);
        }

    }
}