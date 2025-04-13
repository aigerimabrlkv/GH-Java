import java.util.Scanner;

public class SyntaxBasics {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b= sc.nextInt();
int n= sc.nextInt();
int rub = ((a*100+b)*n)/100;
        int kop = ((a*100+b)*n)%100;
                System.out.println(rub+" "+kop);
            }
        }



