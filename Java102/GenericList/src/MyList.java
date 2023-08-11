import java.util.Arrays;

public class MyList<T> {

    private int capacity;
    private T[] list;
    private int dimension;

    public void setList() {
        this.list = (T[]) new Object[capacity];
    }

    public MyList() {
        setCapacity(10);
        setList();
    }

    public MyList(int capacity) {
        setCapacity(capacity);
        setList();
    }

    public int size() {
        int count = 0;
        for (T element : list) {
            if (element != null) {
                count++;
            }
        }
        return count;
    }

    public void doubleCapacity() {
        capacity *= 2;
        list = Arrays.copyOf(list, capacity);

    }

    public void add(T data) {
        if (size() >= getCapacity()) {
            doubleCapacity();
        }
        list[size()] = data;
    }

    public T get(int index) {
        if (index < size() && index >= 0) {
            return list[index];
        } else {
            return null;
        }
    }

    public void remove(int index) {
        if (index < size() && index >= 0) {
            for (int i = index + 1; i <= size(); i++) {
                list[i - 1] = list[i];
            }
        } else {
            System.out.println("null");
        }
    }

    public void set(int index, T data) {
        if (index < size() && index >= 0) {
            list[index] = data;
        } else {
            System.out.println("null");
        }
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size(); i++) {
            result += list[i];
            if (i < size() - 1) {
                result += ",";
            }
        }
        return result + "]";
    }

    public int indexOf(T data) {
        int index = 0;
        for (T element : list) {
            if (element == data) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int index = 0;
        int lastIndex = -1;
        for (T element : list) {
            if (element == data) {
                lastIndex = index;
            }
            index++;
        }
        return lastIndex;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T[] toArray() {
        T[] newArray = (T[]) new Object[size()];
        for (int i = 0; i < size(); i++) {
            newArray[i] = list[i];
        }
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < list.length; i++) {
            list[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> subList = new MyList<>(finish - start);
        for (int i = start; i <= finish; i++) {
            subList.add(list[i]);
        }
        return subList;
    }

    public boolean contains(T data) {
        for (T element : list) {
            if (element == data) {
                return true;
            }
        }
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getList() {
        return list;
    }

    public void setList(T[] list) {
        this.list = list;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
