class RelationOperaters
{
    public static void main(String[] args)
    {
        int marks1 = 65;
        int marks2 = 40;
        System.out.println("marks1 > marks2 : " + (marks1 > marks2));
        System.out.println("marks1 < marks2 : " + (marks1 < marks2));
        System.out.println("marks1 >= 50 : " + (marks1 >= 50));
        System.out.println("marks2 <= 35 : " + (marks2 <= 35));
        System.out.println("marks1 == marks2 : " + (marks1 == marks2));
        System.out.println("marks1 != marks2 : " + (marks1 != marks2));
        boolean pass = (marks1 >= 50) && (marks2 >= 35);
        boolean grace = (marks1 >= 60) || (marks2 >= 45);
        boolean fail = !(marks2 >= 35);
        System.out.println("Pass Status : " + pass);
        System.out.println("Grace Status : " + grace);
        System.out.println("Fail Status : " + fail);
    }
}
