package HomeWork4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataContainer<T> {
    T[] data;
    T[] dataCopy;
    int count;
    int add(T item){
        if (item == null) return -1;
        if (count >= data.length -1){
            dataCopy = Arrays.copyOf(data, data.length + 1);
            data = dataCopy;
        }
        for (;data[count] != null;){
            count++;
        }
        data[count] = item;
        return count;
    }


    T get(int index){
        if (index < data.length){
            return data[index];
        }else return null;
    }

    T[] getItems(){
        return data;
    }
    boolean delete(int index){
        return true;
    }





}
