package org.example;


/*
* Интерфейс для созданного ArrayList;
*/

public interface MetodArrayList<T> {
    /*
    Метод удаляет объект и смещает массив влево
    */
    void remove(int index);
    /*
    * Метод добавляет объект в массив
    */
    void add(Object el);
    /*
    * Метод возвращает элемент массива
    */
    Object get(int index);
}
