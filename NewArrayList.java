package org.example;

public class NewArrayList<T> implements MetodArrayList {
    private Object[] array;
    private static int size;
    private  int kol;

    /*
    * Метод создает массив размера size
    */
    public NewArrayList(int size){
        NewArrayList.size = size;
        array = new Object[size];
    }
    /*
    * Метод проверяет не пытаемся ли мы лобавить null,
    * и если это не так, то добавляет элемент в массив
    */
    @Override
    public void add(Object el) {
        if (el == null){
            throw new IllegalArgumentException();
        }
        if (kol >= size) {
            resize(array);
            array[kol] = el;
            kol++;
        } else {
            array[kol] = el;
            kol++;
        }
    }
    /*
    * Проверяем имеется ли элемент массива с таким index,
    * и удаляем элемент из массива
    */
    @Override
    public void remove(int index) {
        if ((index >= size) || (index < 0)){
            throw new IndexOutOfBoundsException();
        } else {
            Object[] arrays = new Object[size - 1];
            for (int i = 0; i < index; i++){
                arrays[i] = array[i];
            }
            for (int i = index + 1; i < size; i++){
                arrays[i - 1] = array[i];
            }
            array = arrays;
            kol--;
        }
    }
    /*
    * Проверяем сможем ли мы вернуть элемент с таким index,
    * и возвращаем его
    */
    @Override
    public Object get(int index) {
        if ((index >= size) || (index < 0)){
            throw new IndexOutOfBoundsException();
        } else{
            return(array[index]);
        }
    }
    /*
    * Метод увеличивает размер массива в 2 раза
    */
    private void resize(Object[] array){
        int new_size = size * 2;
        Object[] new_array = new Object[new_size];
        for (int j = 0; j < size; j++){
            new_array[j] = array[j];
        }
        size = new_size;

    }
}
