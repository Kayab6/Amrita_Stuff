public class main {
    static void print(Object obj){System.out.println(obj);}
    public static void main(String[] args) {
        int a =1205;
        int max = a%10; int smax = 0;
        while (a>=1){
            if (a%10>max){
                smax = max;
                max = a%10;
            }else if(a%10>smax && a%10<max){smax = a%10;}
        }
        print(max + " " + smax);
    }
}
