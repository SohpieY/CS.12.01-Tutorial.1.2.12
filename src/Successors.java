public class Successors {

    public static Position findPosition(int [][] array2d, int value){
        for(int i = 0; i < array2d.length; i++){
            for(int j = 0; j < array2d.length; j++){
                if (array2d[i][j] == value){
                    return new Position(i,j);
                }
            }
        }


        return null;
    }

    public static Position[][] getSuccessorArray(int [][] arr){
        Position[][] ans = new Position[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                ans[i][j] = findPosition(arr[i][j] + 1, arr);
            }
        }

        return ans;
    }



}
