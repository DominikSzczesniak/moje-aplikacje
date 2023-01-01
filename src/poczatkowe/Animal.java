package poczatkowe;

public class Animal implements Comparable<Animal> {
    Animal(String name){
        this.name = name;
    }
    String name;
    int year = 5;

    @Override
    public int compareTo(Animal o) {
        System.out.println(this.name.compareTo(o.name));
        if(this.name.compareTo(o.name) != 0){
            return this.name.compareTo(o.name);
        }
        return this.year - o.year;
    }
}
