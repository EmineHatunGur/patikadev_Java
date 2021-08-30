public class Main {

    public static void main(String[] args) {
        double[] list = {1,2,3,4,5};
        double sum = 0;
        Harmonik.print(list, sum);

    }
}

/*----------------------------------------------------------------------------------------------------------*/

public class Harmonik {

    static void print(double [] list,double sum){
        for(int i=0;i<list.length;i++){

             sum+=1.0/list[i];
            System.out.println(list[i]);
        }

        System.out.println(list.length/sum);


    }


}
