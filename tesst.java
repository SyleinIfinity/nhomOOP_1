import java.util.*;
public class tesst {
    static int [] M;
    static int N;
    static int X;
    static Scanner sc;
    static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu mang: ");
        N = sc.nextInt();
        M = new int[N];
        NHAP();
        System.out.println("    ");
        XUAT();
        // FIND(X);
        // DELETE(X);
        System.out.println("    ");
        SAPXEP();
        System.out.println("    ");
        FIND3();
    }
    static void NHAP(){
        for(int i=0; i < N; i++){
            System.out.printf("M[" + i + "]M=");
            M[i] = sc.nextInt();
        }
    }
    static void XUAT(){
        for(int i=0; i < N; i++){
            System.out.println("M[" + i + "]M=" + M[i] + " ");
        }
    }
    static void FIND(int X){
        boolean found = false;
        System.out.println("NHAP VAO x: ");
        X = sc.nextInt();
        for(int i = 0; i < N; i++){
            if(X == M[i]){
                found = true;
            }
        }
        if(found){
            System.out.println("tim thay");
        }else{
            System.out.println("chua thay");  
        }
    }
    static int FIND2(int X){
        boolean found = false;
        System.out.println("NHAP VAO x: ");
        X = sc.nextInt();
        int vitri = 0;
        for(int i = 0; i < N && !found; i++){
            if(X == M[i]){
                found = true;
                vitri = i;
            }
        }
        if(found){
            System.out.println("tim thay");
        }else{
            System.out.println("chua thay");  
        }
        return vitri;
    }
    static void FIND3(){
        SAPXEP();
        int maxdem = 0;
        int ALO = -1;
        for(int i = 0; i < N ; i++){
            int dem = 0;
            for(int j = 1 ; j < N; j++){
                if(M[i] == M[j])
                    dem++;
            }
            if(dem > maxdem){
                maxdem = dem;
                ALO = M[i];
            }
        }
        System.out.printf(" Xuat hien max: %d voi %d time", ALO, maxdem);
    }
    static void DELETE(int X){
        int k =FIND2(X);
        for(int i = k; i < N - 1; i++){
            M[i] = M[i+1];
            // System.out.println(M[i]);
        }
        M[N - 1]= 0;
        N--;
        XUAT();
    }
    static void SAPXEP(){
        for(int i = 0; i < N-1; i++)
            for(int j = i+1; j < N; j++){
                if(M[i] < M[j]){
                    int TG = M[i];
                    M[i] = M[j];
                    M[j] = TG;
                }
            }
            XUAT();
    }
}
