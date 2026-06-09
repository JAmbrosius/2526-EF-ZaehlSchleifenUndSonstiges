public class MainProgram {
    public static void main(String[] args){
        /*for(int i = 1; i < 11;i = i + 2){ //Variable i erstellen mit Wert 0, i ist kleiner als 5 --> Code ausführen
            System.out.println("Wert von i: " + i); // für z.B. i = 0: --> Wert von i: 0
            if(i == 3){
                System.out.println("Holdriho!");    //falls i = 3: --> Holdriho!
            }
        }*/
        printNumbers(6,23);
        System.out.println(sumUp(2,5));
    }

    //static --> kann ohne Objekt aufgerufen werden
    public static void printSomeNumbers(){
        //6 bis 23
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
}
