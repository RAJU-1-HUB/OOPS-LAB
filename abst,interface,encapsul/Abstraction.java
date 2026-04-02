abstract class Employee{
 String name;
 Employee(String name) {
 this.name=name;
 }
 abstract void salary();
}
class Manager extends Employee {
 Manager(String name){
  super(name);
  }
 void salary(){
System.out.println(name + " earns 100000000");
 }
}
public class Abstraction{
 public static void main(String[] args){
  Manager m=new Manager("RAJU");
  m.salary();
  }
}
