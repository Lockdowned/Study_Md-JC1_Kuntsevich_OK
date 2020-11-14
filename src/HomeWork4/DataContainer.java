package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>{

    DataContainer(T[] data){
       this.data = data;
    }

    private T[] data;
    private T[] dataCopy;


    public int add(T item){
        if (item == null) return - 1;
        int count = 0;
        for (T a:data) {
            if (data[count] == null)break;
            if (data[count] != null){
                count++;
            }
        }

        if (count >= data.length){
            dataCopy = Arrays.copyOf(data, data.length + 1);
            data = dataCopy;
        }

        data[count] = item;
        return count;
    }

    public T get(int index){
        if (index >=0 && index < data.length){
            return data[index];
        }else return null;
    }

    public T[] getItems(){
        return data;
    }

    public boolean delete(int index){
        if (index >=0 && index < data.length){
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            dataCopy = Arrays.copyOf(data, data.length - 1);
            data = dataCopy;
            return true;
        }
        return false;
    }

    public boolean delete (T item){
        int count = 0;
        for (T part : data) {
            if (part.equals(item)){
                delete(count);
                return true;
            }
            count++;
        }
        return false;
    }

public void sort(Comparator<T> comparator) {
    if (comparator != null & data.length > 1) {
        boolean completedSort = false;
        int left, right;
        T cash;
        left = 0;
        right = data.length - 1;
        while (!completedSort){
            completedSort = true;
            for (int i = left; i < right ; i++) {
                if (comparator.compare(data[i], data[i + 1]) > 0) {
                    completedSort = false;
                    cash = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = cash;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (comparator.compare(data[i], data[i - 1]) < 0) {
                    completedSort = false;
                    cash = data[i];
                    data[i] = data[i - 1];
                    data[i - 1] = cash;
                }
            }
            left++;
        }
    }
}

    @Override
    public String toString() {
        if (data == null)
            return "null";

        int iMax = data.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if (data[i] != null){
                b.append(data[i]);
            }
            if (i == iMax){
                return b.append(']').toString();
            }
            for (int j = i; j < iMax; j++) {
                if (data[j + 1] != null) {
                    b.append(", ");
                    i = j;
                    break;
                }
            }
        }
    }
//    /*
//    С вебинара(осознать) и написать реализацию сортировки
//     */
//
//    public static <T extends Comparable<T>> void sort(DataContainer<T> container) {
//        if (container.data[0].compareTo(container.data[1]) > 0) {
//
//        }
//
//
//    }
//
//    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator) {
//        if (comparator.compare(container.data[0], container.data[1]) > 0) {
//
//        }
//    }
}