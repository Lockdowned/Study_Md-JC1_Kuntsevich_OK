package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

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

//    public void sort(Comparator<? super T>comparator){
//        Sort.cocktailSort(data, comparator);
//    }

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
                String a = String.valueOf(b);
                int comma = a.lastIndexOf(',');
                b.delete(comma, comma + 2);
                return b.append(']').toString();
            }

            if (data[i] != null){
                b.append(", ");
            }
        }
    }
}
