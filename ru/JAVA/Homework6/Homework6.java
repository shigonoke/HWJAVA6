package  ru. JAVA.Homework6;

import java.util.*;
public class Homework6 {

    class Cat {
        private String name;
        private int age;
/**
 * @param name
 * @param age
 */
public Cat(String name, int age) {
    this.name = name;
    this.age = age;
}
        
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Cat cat = (Cat) o;
        return age == cat.age &&
        Objects.equals(name, cat.name);
        }
         @Override
         public int hashCode() {
            return Object.hash(name, age);
         }
        }            
/**
 * @param args
 */
public static void main(String[] args) {
    HashSet<Cat> catSet = new HashSet<>();

Cat cat1 = new Cat("Мурзик", 3);
Cat cat2 = new Cat("Барсик", 5);
Cat cat3 = new Cat("Васька", 2);
Cat cat4 = new Cat("Мурзик", 3); 

catSet.add(cat1);
catSet.add(cat2);
catSet.add(cat3);
catSet.add(cat4);

for (Cat cat : catSet) {
    System.out.println(cat.getName() + ": " + cat.getAge());
}

