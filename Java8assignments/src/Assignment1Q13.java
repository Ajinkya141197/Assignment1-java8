
public class Assignment1Q13 {
    public static void main(String[] args) {
        int array[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};
        for(int i=0;i<array.length-1;i++) {

            if(i<=4) {
                String a= array[i]+"-"+(array[i+2]);
                System.out.print(a+",");
                i=i+2;
            }else if(i<=10) {

                String a=array[i]+"-"+(array[i+4]);
                System.out.print(a+",");
                i=i+4;
            }else {

                String a=array[i]+"-"+(array[i+3]);
                System.out.print(a);
                System.out.print(" ");
                i=i+4;
            }
        }

    }

}
