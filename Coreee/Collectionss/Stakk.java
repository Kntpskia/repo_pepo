package Java_2023.Coreee.Collectionss;

import java.util.List;
import java.util.Stack;

public class Stakk {
    public static void main(String[] args) { //Реализует интерфейс List и наследуется  класс Vector Последний пришел ,первый ушел (Противоположен Кью)
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(4);
        stack.push(3);

        //System.out.println(stack);//Выводит массив
        //System.out.println(stack.peek());
        //System.out.println(stack.pop()); //Выводит первый (следующий) элемент  в порядке  Последний пришел ,первый ушел (Противоположен Кью)
        //System.out.println(stack.pop());

        while(!stack.empty())// Пустой ли массив ? Восклицательный знак - Не пустой ?
        {
            System.out.println(stack.pop());
        }

    }
}
