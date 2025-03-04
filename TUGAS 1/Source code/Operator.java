public class Operator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Kamus
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        // Algoritma
        System.out.println("Silahkan baca teksnya dan tambahkan perintah untuk menampilkan output");

        // Inisialisasi variabel boolean
        Bool1 = true; 
        Bool2 = false;

        // Operasi Boolean
        TF = Bool1 && Bool2; // Boolean AND
        System.out.println("Bool1 AND Bool2: " + TF);
        
        TF = Bool1 || Bool2; // Boolean OR
        System.out.println("Bool1 OR Bool2: " + TF);
        
        TF = !Bool1; // NOT
        System.out.println("NOT Bool1: " + TF);
        
        TF = Bool1 ^ Bool2; // XOR
        System.out.println("Bool1 XOR Bool2: " + TF);

        // Operasi numerik
        i = 5;
}
}