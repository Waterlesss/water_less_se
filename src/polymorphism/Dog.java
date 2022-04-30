package polymorphism;

import sun.java2d.pipe.AAShapePipe;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog类的eat方法");
    }

    public void play() {
        System.out.println("Dog类独有的play方法");
    }

    public static void main(String[] args) {
//        Animal animal = new Dog();
//        animal.eat();
//        //向下转型，强制类型转换
//        Dog dog = (Dog)animal;
//        dog.play();
        //转回去
//        Animal animal1 = dog;
//        dog.play();

        //使用instanceof关键字的返回值(布尔值)搭配的分支语句进行类型转换
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        if (animal1 instanceof Dog) {
            Dog dog = (Dog) animal1;
            System.out.println(animal1 + "successul");
        }else {
            System.out.println(animal1 + "不是指向Dog类型引用");
        }
        if (animal2 instanceof Dog) {
            Dog dog = (Dog) animal2;
            System.out.println(animal2 + "successul");
        }else {
            System.out.println(animal2 + "不是指向Dog类型引用");
        }
    }
}
