class Assign6{
    public static void p1(){
        System.out.println("pattern 1");
        for(int i=0; i<5 ; i++ ){
            for(int j=0 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    public static void p2(){
        System.out.println("pattern 2");
        for(int i=0; i<5 ; i++ ){
            for(int j=0; j<=3-i; j++){
                System.out.print(" "+" "+" ");
            }
            for(int j=4-i ; j<=4 ; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    public static void p3(){
        System.out.println("pattern 3");
        for(int i=0; i<5 ; i++ ){
            for(int j=4-i ; j>=0 ; j--){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
    public static void p4(){
        System.out.println("pattern 4");
        for(int i=0; i<5 ; i++ ){

            for(int j=1; j<=i ; j++){
                System.out.print(" "+" "+" ");
            }

            for(int j=0 ; j<=4-i ; j++){
                System.out.print(" * ");
            }
            
            System.out.println("");
        }
    }
    public static void p5(){
        System.out.println("pattern 5");
        for(int i=0; i<5 ; i++ ){
            for(int j=0 ; j<=i ; j++){
                System.out.print(j+1 + " ");
            }
            
            System.out.println("");
        }
    }
    public static void p6(){
        System.out.println("pattern 6");
        for(int i=0; i<4 ; i++ ){
            for(int j=0 ; j<=i ; j++){
                System.out.print(i-j+1 + " ");
            }
            System.out.println("");
        }
    }
    public static void p7(){
        System.out.println("pattern 7");
        char[] arr = {'A', 'B', 'C', 'D', 'E'};
        for(int i=0; i<5 ; i++ ){
            for(int j=1; j<=i ; j++){
                System.out.print(" "+" ");
            }
            for(int j=0 ; j<=4-i ; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }
    }
    public static void p8(){
        System.out.println("pattern 8");
        int temp = 1;
        for(int i=0; i<5 ; i++ ){
            for(int j=0 ; j<=i-1 ; j++){
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println("");
        }
    }
    public static void p9(){
        System.out.println("pattern 9");
        char[] arr = {'A', 'B', 'C', 'D', 'E'};
        for(int i=0; i<5 ; i++ ){
            for(int j=1; j<=i ; j++){
                System.out.print(" "+" ");
            }
            for(int j=i ; j<=4 ; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }
    }
    public static void p10(){
        System.out.println("pattern 10");
        for(int i=0; i<5 ; i++ ){
            for(int j=0; j<5 ; j++){
                if(i==4 || j==0 || i==0 || j==4){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" "+" "+" ");
                }
            }
            System.out.println("");
        }
    }
}