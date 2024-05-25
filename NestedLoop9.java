public class NestedLoop9 {
    public static void main(String args[]){
        int i=1,j=1;
outer:  do{
            while(j<=10){
                if((i*j)>50){
                    break outer;
                }
                System.out.println("i="+i+",j="+j);
                ++j;
            }
            j=1;
            i++;
        }while(i<=10);
    }
}