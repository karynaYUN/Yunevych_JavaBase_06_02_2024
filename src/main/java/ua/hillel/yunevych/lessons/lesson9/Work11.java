package ua.hillel.yunevych.lessons.lesson9;


public class Work11 {
    public static void main(String[] args) {
        int [][] array = new int[5][5];
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                if (i==j){
                    array[i][j]=1;
                }
            }
        }
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
