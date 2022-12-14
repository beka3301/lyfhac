public class ClassesAndObjects {
    public static void main(String[]args){
        Person person1=new Person();
        person1.name="Beka";
        person1.age=23;
        person1.sayHello();
        Person person2=new Person();
        person2.name="Artur";
        person2.age=13;
        person2.speak();



    }
}
class Person{
    String name;
    int age;

    void speak(){
        for (int i = 0; i < 1; i++) {
        System.out.println("Меня зовут: "+name+","+"mne: "+age);
        }
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
