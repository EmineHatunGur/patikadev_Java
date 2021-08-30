/*
Matrisin Transpozu
Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.
*/

/*---------------------------------------------------------------------------------------------------------------------------*/
package com.company;

public class Main {

    public static void main(String[] args) {
     int [][] array={
        {1,2,3,},
        {4,5,6}
        };
     int[][] arr= new int[3][2];
     for (int i=0;i<2;i++){
         for (int j=0;j<3;j++){
             System.out.print(" "+ array[i][j]);
             arr[j][i]=array[i][j];
         }
         System.out.println("  ");
     }
        System.out.println("Tranpozu alınan matris : ");
     for (int i=0;i<3;i++){
         for (int j=0;j<2;j++){

             System.out.print( arr[i][j]+" ");

         }
         System.out.println( );
     }


    }
}







