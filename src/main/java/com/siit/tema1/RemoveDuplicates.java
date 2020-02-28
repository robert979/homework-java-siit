package com.siit.tema1;



public class RemoveDuplicates {
    public static void main (String [] args){

        int [] sir = {20, 20, 30, 40, 50, 50, 50};

        int a= sir.length;
        int b=a;
        int [] faraduplicate=new int[b];
        for(int i=0; i<a-2; i++){
            for (int j =i+1;j<a-1 ; j++ ){
                if (sir[i]==sir[j]) {
                    b=b-1;

                    int [] sirfaraduplicate=new int[a-1] ;

                }
                else if (sir[i]!=sir[j]) {


                }

            }
            for(int k =0; k<a; k++){
                System.out.println("sir[k] = " + sir[k]);
            }
        }

    }
}
