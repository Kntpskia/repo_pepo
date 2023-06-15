package Java_2023.Algo;

import java.util.Arrays;
import java.util.Comparator;

public class Gadnie3 {
    public static void main(String[] args) {
        final Item item= new Item(4,20);
        final Item item2= new Item(3,18);
        final Item item3= new Item(2,14);
        final Item[]items={item,item2,item3};
        Arrays.sort(items, Comparator.comparingDouble(Item:: valuePerUnit).reversed());
        System.out.println(Arrays.toString(items));

        final int W=7;
        int WSoFar=0;
        int VSoFar=0;
        int currentItem=0;//КОличество вещей

        while(currentItem< items.length&& WSoFar != W){
            if (WSoFar+items[currentItem].getWeight()<W){
                VSoFar+=items[currentItem].getValue();//Разамер объекта
                WSoFar+=items[currentItem].getWeight();//ПОлезность
            }else{
                VSoFar+=((W-WSoFar)/(double) items[currentItem].getWeight())*
                        items[currentItem].getValue();
                WSoFar=W;//ПОлный рюкзак
            }
            currentItem++;
        }
        System.out.println(VSoFar);
    }
}

class Item{
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnit(){
        return value/(double)weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}