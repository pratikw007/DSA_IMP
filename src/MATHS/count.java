package MATHS;

public class count {
    static int facDigits(int N){
        int count = 1;
        int c = 1;
        for(int i=1;i<=N;i++){
            count=count+i;
        }
        while(count>0){
            c++;
            count = count/10;
        }

        return c;
    }

    public static void main(String[] args) {
        int N;
        System.out.println(facDigits(5));
    }
}
