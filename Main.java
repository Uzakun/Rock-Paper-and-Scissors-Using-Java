import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    for(int i = 0; i<5; i++){
  System.out.printf("You Choose:-\nPress, 0 for ROCK, 1 for PAPER and 2 for SCISSORS: ");
  Scanner sc= new Scanner(System.in);
    int in = sc.nextInt();
  //String str = sc.next();
Random random = new Random();
    System.out.printf("Computer's Choice:-\n0 for ROCK, 1 for PAPER and 2 for SCISSORS: ");
int a = random.nextInt(3); 
    System.out.println(a);
if(in==0 && a==0){
  System.out.printf("\n\n\nThe Match Has Been Drawn!!!\n"); 
}
if(in==1 && a==1){
  System.out.printf("\n\n\nThe Match Has Been Drawn!!!\n"); 
}
if(in==2 && a==2){
  System.out.printf("\n\n\nThe Match Has Been Drawn!!!\n"); 
}
if(in==0 && a==1){
  System.out.printf("\n\n\nComputer Won!!!\n"); 
}
if(in==0 && a==2){
  System.out.printf("\n\n\nYou Won!!!\n"); 
}
if(in==1 && a==0){
  System.out.printf("\n\n\nYou Won!!!\n"); 
}
if(in==1 && a==2){
  System.out.printf("\n\n\nComputer Won!!!\n"); 
}
if(in==2 && a==1){
  System.out.printf("\n\n\nYou Won!!!\n");      
     }
   }
 }
}  