import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        double[] novcanice = {500,200,100,50,20,10,5};
        double[] kovanice = {2,1,0.50,0.2,0.1,0.05,0.02,0.01};

        System.out.println("Unesite broj");
        double broj = input.nextDouble();
        double tmp=broj;

        int j=0;
        for(int i=0;i<novcanice.length;i++){

            int cnt=0;
            int cnt2=0;

            while(tmp-novcanice[i]>=0 ){
                            cnt++;
                            tmp-=novcanice[i];
                }
            if(novcanice[i]*cnt>0)
                System.out.println(novcanice[i] +" x "+ cnt);

            if(tmp<5 && tmp>0){
                if(tmp-kovanice[j]<0)i=0;
                while(tmp-kovanice[i]>=0) {
                    tmp-=kovanice[i];
                    cnt2++;
                }
                if(kovanice[i]*cnt2>0)
                    System.out.println(kovanice[i] +" x "+ cnt2);
                j++;
            }

            }

        }



    }