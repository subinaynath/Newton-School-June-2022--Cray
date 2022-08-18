static void Pattern(int N){
//Enter your code here
 int colm = 0;
 int row = 0;


         for (int i=1;i<=N;i++){
        
            for (int j=1;j<=N;j++) {
                System.out.print(colm +" ");
                colm +=4;
            }
            row+=6;
            colm =row;
            System.out.println();
        }
}
