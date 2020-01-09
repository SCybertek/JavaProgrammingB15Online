package day27;

public class ArraysPractice_3DArray {
    public static void main(String[] args) {
        int [][][] arr3D = { { {1,2,3},{4,5,6}}, {{7,8,9},{10,11,12}}};
        for (int i = 0; i < arr3D.length ; i++) { //each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++) { //each index number of 1D array
                for (int k = 0; k < arr3D[j].length; k++) {
                    System.out.println(arr3D[i][j][k]); // it gives out value so no need to convert into STRINg
                }

            }

        }
    }
}

//it printed only until 11.. why ? compare code from NOTES!!
//assignment !!!
