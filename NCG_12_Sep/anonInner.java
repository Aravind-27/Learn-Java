package NCG_12_Sep;

abstract class Person{
    abstract void eat();
}
class anonInner{
    public static void main(String args[]){
        Person p=new Person(){
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
