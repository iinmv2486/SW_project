import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    for(int i = 0; i < num ; i++){
      int x1 = in.nextInt();
      int y1 = in.nextInt();
      int x2 = in.nextInt();
      int y2 = in.nextInt();
      int m = in.nextInt();
      int n = in.nextInt();

      if ((x1 <= m) && (x2 >= m) && (y1 <= n) && (y2 >= n)){ // 사각형 안쪽 5번 구역
        System.out.println("0 0");
      }else{
        int[] result = deter(x1, y1, x2, y2, m, n);  
        int re1 = Eudist(result[0], result[1], m, n);
        int re2 = Redist(result[0], result[1], m, n);
        System.out.printf("%d %d",re1,re2);

      }
    }
  }

  static int Eudist(int x1,int y1,int x2,int y2){
    int k = ((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
    return k;
  }
  static int Redist(int x1,int y1,int x2,int y2){
    int result = Math.abs(x1 - x2) + Math.abs(y1 - y2);
    return result;
  }
  static int[] deter(int x1,int y1,int x2,int y2,int m,int n){  
    int[] result = new int[2];
    if (m < x1){  // 1, 4, 7 구역 약한 경계
      if (n < y1){    // 7번 구역 약한 경계
        result[0] = x1;
        result[1] = y1;
      }else if(n > y2){   // 1번 구역 약한 경계
        result[0] = x1;
        result[1] = y2;
      }else{  // 4번 구역 강한 경계
        result[0] = x1;
        result[1] = n;
      }
    }else if (m > x2){
      if (n < y1){
        result[0] = x2;
        result[1] = y1;
      }else if(n > y2){
        result[0] = x2;
        result[1] = y2;
      }else{
        result[0] = x2;
        result[1] = n;
      }
    }else{
      if (n < y1){
        result[0] = m;
        result[1] = y1;
      }else if(n > y2){
        result[0] = m;
        result[1] = y2;
      }
    } return result;
  }
}
