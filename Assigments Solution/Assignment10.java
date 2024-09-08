class Assignment10{
    public static void main(String[]args){
        p1(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        p2(Integer.parseInt(args[0]));
        p3(args);
        p4(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        p5(Integer.parseInt(args[0]));
        p6(args);
        p7(Integer.parseInt(args[0]));
        p8(args);
        p9(args);
        p10(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

    }

    private static void p1(Integer num1, Integer num2){
        System.out.println("Addition is " + (num1 + num2));
    }

    private static void p2(Integer n){
        Integer temp =0;
        for (int i = 1; i <= n ; i++){
            temp = temp + i;
        }
        System.out.println("Addition of n is "+temp);
    }

    private static void p3(String[] args){
        for (String arg : args){
            System.out.println(arg);
        }
    }

    private static void p4(Integer num1 , Integer num2){
        Integer max = (num1 > num2) ? num1 : num2;
        for (int i = max ; i <= num1*num2; i++){
            if(i%num1==0 && i%num2==0){
                System.out.println("lcm is = "+ i);
                break;
            }
        }
    }

    private static void p5 (Integer number){
        Integer flag = 0;
        for(Integer i = 2; i < number ; i++){
            if (number % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag==1){
            System.out.println("number is not prime number");
        }
        else {
            System.out.println("number is prime number");
        }
    }

    protected static void p6(String[] args){
        for (String arg : args){
            Integer num = Integer.parseInt(arg);
            Integer flag=0;
            for(Integer i = 2; i < num ; i++){
                if (num % i == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(num);
            }
        }
    }

    protected static void p7(Integer num){
        Integer fact = 1;
        for (Integer i = 2; i<=num ; i++){
            fact = fact*i;
        }
        System.out.println("factorial is "+ fact);
    }

    protected static void p8 (String[] args){
        Integer sum= 0;
        for (String arg : args){
            Integer number = Integer.parseInt(arg);
            sum+=number;
        }
        System.out.println("sum of all number is "+ sum);
    }

    protected static void p9 (String[] args){
        Integer gretest = Integer.parseInt(args[0]);
        for (String arg : args){
            if (gretest < Integer.parseInt(arg)){
                gretest = Integer.parseInt(arg);
            }
        }
        System.out.println("Gretest number is = "+ gretest);
    }

    protected static void p10(Integer num1, Integer num2){
        Integer min = (num1 > num2) ? num2 : num1;
        Integer hcf=1;
        for (Integer i = 1 ; i <= min; i++){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
        }
        System.out.println("hcf is = "+hcf);
    }
}
