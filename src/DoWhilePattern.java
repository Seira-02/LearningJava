public class DoWhilePattern {
    public static void main(String[] args){
        int i, j;
        i = 1;
        do{
            j=1;
            do {
                System.out.print(j);
                j++;
            }while(j<=1);
            System.out.println();
            i++;
            }while(i<=5);
        }
    }

