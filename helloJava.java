import java.util.Scanner;
public class helloJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number 0 till 1000!");
        System.out.println("we'll check and print every prime number 0 till 1000");
        //gan mac dinh prime la false
       boolean isPrime = false;
    int a = scanner.nextInt();

        if(a>2&&a<1000){
            //mac dinh so 1 ,2 la so nguyen to ko can check
            System.out.print(1+" ");
            System.out.print(2+" ");

            for (int i=3;i<=a;i++){
                    //gan true neu i la so nguyen to
                    isPrime =true;
                    for (int j =2;j<i;j++){
                        //check i neu ko la so nguyen to gan false
                        if(i%j==0){
                            isPrime =false;
                        }
                    }
                    //in ra so nguyen to tu 0->a
                    if (isPrime==true){
                        System.out.print(i+" ");
                    }
                }
        } else {
            System.out.println("so nhap khong hop le");
        }

         }
        }
