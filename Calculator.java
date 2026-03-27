class Calculator{
    
    public int add(int a,int b){
        return a+b;
    }
    protected int add(int a,int b,int c){
        return a+b+c;
        
        
    }
    private double add(double a,double b){
        return a+b;
    }
    public void   displaydecimal(double x,double y){
        double u = add(x,y);
        System.out.println("sum of 2 decimals:"+u);
    }


    public static void main(String[] args){
        Calculator sc=new Calculator();
        sc.displaydecimal(2.24,2.564);
        System.out.println("sum of 3 Integers:"+sc.add(3,4,5));
        System.out.println("sum of 2 Integers:"+sc.add(4,5));
    }
}