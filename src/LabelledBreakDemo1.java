public class LabelledBreakDemo1 {
    public static void main(String[] args){
        int i,j;

        outer:
        for(i=1; i<=5; i++){
            for(j=1; j<=3; j++){
                System.out.println(i*j);
                if(j==2)
                    break outer;
            }
        }
    }
}
