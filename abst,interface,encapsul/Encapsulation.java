class Student
{
 private String name;
 private int marks;
 public void setName(String name)
 {
  this.name=name;
 }
 public void setMarks(int marks)
 {
  if (marks>=0 && marks<=100)
  this.marks=marks;
  else
  System.out.println("invalid marks");
 }
 public String getName()
 {
  return name;
 }
 public String getGrade()
 {
  if(marks>=90)
   return "A";
  else if (marks>=75)
   return "B";
  else
   return "C";
 }
}
public class Encapsulation
{
 public static void main(String args[])
 {
  Student s=new Student();
  s.setName("RAJU");
  s.setMarks(75);
  System.out.println(s.getName());
  System.out.println(s.getGrade());
 }
}
