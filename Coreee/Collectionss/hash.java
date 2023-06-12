package Java_2023.Coreee.Collectionss;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class hash {
    public static void main(String[] args) {
        Map<Integer,Person> map2= new HashMap <>();
        Person person1= new Person(1,"Ars");
        Person person2= new Person(1,"Ars");

// Мэп и сет не смотрят на поля класса - т.е. не проеряют их на уникальность
        //у классов сслыочных типиов есть методы equals и hashCode -сравнивает ссылки в памяти   - -переопрделенные
        //Первый метод хэш код запускается превый ,тк он быстрый . еесли он не отработал ( 2 объекта одинвоквые)  -(нет ли колизии) запускается equals медленный и большой
        //Хэшкод может вызваь коллизию ( не верное сравнивание объектов друг с другом -не верно одинаковые объекты)

        map2.put(1,person1);
        map2.put(2,person2);
        System.out.println(map2);

        Map<Integer,String> map= new HashMap <>();
        Set<Integer> set = new HashSet<>();
        map.put(1, "Ириша");
        map.put(1, "Ириша");


        set.add(1);
        set.add(1);

        System.out.println(set);
    }
}

class Person {
    private int id;
    private String string;

    public Person(int id, String string) {
        this.id = id;
        this.string = string;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", string=" + string +
                '}';
    }

    //Без этой реализации и этих методов не будет сравнивать поля метода персон ,т.е. првоерять на уникальность
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return string != null ? string.equals(person.string) : person.string == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (string != null ? string.hashCode() : 0);
        return result;//конвертирует в целое число -представление объекта
    }
}
