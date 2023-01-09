package 다중어레이;
// 2차원 배열 : 행과 열이 존재
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // 2행에 3열의 값을 가진 값이 2개가 있다. 총 6개
        int k = 10;                  // 값을 찾으려면 행에서 열까지 넘어가야 찾을수 있다. 그 전까지는 값의 위치(주소)만 알수 있다.
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
            }
        }
        for(int[] row : arr) {
            for(int e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
