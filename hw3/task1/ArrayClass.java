package hw3.task1;


public class ArrayClass<T>{

    T value;

    public T[] change(T[] array, int indexA, int indexB){
        value = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = value;
        return array;
    }
}