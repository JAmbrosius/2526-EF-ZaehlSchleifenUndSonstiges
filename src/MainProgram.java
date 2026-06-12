public class MainProgram {
    public static void main(String[] args){
        /*for(int i = 1; i < 11;i = i + 2){ //Variable i erstellen mit Wert 0, i ist kleiner als 5 --> Code ausführen
            System.out.println("Wert von i: " + i); // für z.B. i = 0: --> Wert von i: 0
            if(i == 3){
                System.out.println("Holdriho!");    //falls i = 3: --> Holdriho!
            }
        }*/
        /*printNumbers(6,23);
        System.out.println("-------");
        System.out.println(sumUp(2,5));
        System.out.println("-------");
        System.out.println(powerOfTwo(3));
        System.out.println("-------");
        System.out.println(sumUpPowerOfTwo(3));
        */
        //rectangleStarsSafe(10,5);
        triangleStars(5);
    }

    //static --> kann ohne Objekt aufgerufen werden
    public static void printSomeNumbers(){
        //6 bis 23
        //for(Deklaration der Zählvariable; Schleifenbedingung; Anpassung der Zählvariable jedesmal NACHDEM der Code einmal durchgelaufen ist)
        for(int i = 6; i <= 23; i++){
            System.out.println(i);
        }
    }

    public static void printNumbers(int start, int end){
        for(int i = start; i <= end; i++){
            System.out.println(i);
        }
    }

    public static int sumUp(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum = sum + i;
        }
        return sum;
    }

    /*
    public static int powerOfTwo(int exp)“, die die Zweierpotenz zum Exponenten exp zurückgibt,
    falls exp >= 0 ist.
    Bsp.: powerOfTwo(3) → 2^3=8.
     */
    public static int powerOfTwo(int exp){
        int result = 1;
        for(int i = 0; i < exp; i++){
            result = result * 2;
        }
        return result;
        /*
        Start mit exp = 5 --> result = 1
        ---------- wohin = woher * 2
        i = 0: --> result = result * 2 --> result = 1 * 2 --> result = 2
        i = 1; --> result = result * 2 --> result = 2 * 2 --> result = 4
        i = 2; --> result = result * 2 --> result = 4 * 2 --> result = 8
        i = 3; --> result = result * 2 --> result = 8 * 2 --> result = 16
        i = 4; --> result = result * 2 --> result = 16 * 2 --> result = 32
        i = 5; --> i < exp ist nicht mehr erfüllt --> result = 32 wird ausgegeben
         */
    }

    /*
    public static int sumUpPowerOfTwo(int n)“,
    die bei Aufruf die Summe aller Zweierpotenzen bis zur n-ten Potenz liefert.
    Bsp.: sumUpPowerOfTwo(3) → 2^0+2^1+2^2+2^3=1+2+4+8=15. Nutzen Sie die Methode aus d).
     */
    public static int sumUpPowerOfTwo(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum = sum + powerOfTwo(i);
        }
        return sum;
    }

    public static void rectangleStars(int width, int height){
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rectangleStarsSafe(int width, int height){
        if(height > 0 && width > 0){
            rectangleStars(width,height);
        }
    }

    public static void triangleStars(int width){
        for(int i = 1; i <= width; i++){ //legt die Höhe fest
            for(int j = 1; j <= i; j++){    //legt die Breite fest
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
