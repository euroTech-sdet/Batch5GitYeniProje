package DataFile;

public class Grup4 {
    public static void main(String[] args) {
        //*****Grup testidir. Cakisma olacak sekilde degistirebilirisiniz****
        //Case 1 Step 1
        String s = "UserName";
        int n = 6;
        boolean b = TestA (s,n);
        boolean c = TestB (s,n);
        boolean d = TestC (s,n);
        boolean e = TestD (s,n);
    }

    private static boolean TestD(String s, int n) {
        return false;
    }

    private static boolean TestC(String s, int n) {
        return false;
    }

    private static boolean TestB(String s, int n) {
        return false;
    }

    public static boolean TestA(String s, int n){
        return s.length() > n;
    }
}
