package exam;

public class TwoDimension {
    public static void main(String[] args) {
        String[][] alpa = {{"a","b"},{"c","d"},{"e","f"},{"g","h"},{"i","j"},{"k","l"},{"m","n"},{"o","p"},{"q","r"},{"s","t"},{"u","v"},{"w","x"},{"y","z"}};

        for(int i =0; i< alpa.length; i++){
            for(int j=0; j<alpa[i].length; j++){
                System.out.print(alpa[i][j]+" ");
            }
            System.out.println();
        }
    }
}
