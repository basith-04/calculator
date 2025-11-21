import java.util.Scanner;
public class Main {

    public static int main(String[] args) {
            while(true)
            {
                System.out.println("Please select an operation ");
                System.out.println("1.Addition \n 2. Substraction \n 3. Division \n 4. Multiplication 5. Exit");
                System.out.println("choose (1 -5 ) ");
                Scanner sc=new Scanner(System.in);
                int choice =sc.nextInt();
                System.out.println("enter the first number :");
                double num1=sc.nextDouble();
                System.out.println("enter the second number :");
                double num2=sc.nextDouble();

                switch(choice)
                {
                    case 1: System.out.println(num1+num2);
                        break;
                    case 2: System.out.println(num1-num2);
                        break;
                    case 3: try{
                        System.out.println(num1/num2);
                    }catch (ArithmeticException e){
                        System.out.println("cant divide with zero");
                    }break;
                    case 4: System.out.println(num1*num2);
                        break;
                    case 5: return 0;
                    default:System.out.println("enter a valid option from 1 to 5");
                }
            }

        }
    }
