public class Main {
    public static void main(String[] args){
        // задача 1
        int [] three = new int [3];
        three[0]=1;
        three[1]=2;
        three[2]=3;
        double [] weight = {1.57, 7.654, 9.986};
        int[] fruits = {5, 7, 12, 18};
       //Задача 2
        for (int i =0; i <3; i ++){
            System.out.print(three[i]+",");}
        System.out.print("\n");
        for (var b =0; b <3; b ++){
            System.out.print(weight[b]+",");}
        System.out.print("\n");
        for (int z =0; z <4; z ++){
            System.out.print(fruits[z]+",");}
        System.out.print("\n");
       //Задача 3
        for (int i = 3 ; i > 0; i-- ){
            System.out.print(three[i-1]+",");}
        System.out.print("\n");
        for (var b = 3 ; b >0; b-- ){
            System.out.print(weight[b-1]+",");}
        System.out.print("\n");
        for (int z = 4; z >0; z-- ){
            System.out.print(fruits[z-1]+",");}
        System.out.print("\n");
        // Задача 4

        for (int i =0; i <3; i ++)if(i%2!=0){
            System.out.print(three[i]+",");}
        else{
            System.out.print(three[i]+1+",");}
    }
}
