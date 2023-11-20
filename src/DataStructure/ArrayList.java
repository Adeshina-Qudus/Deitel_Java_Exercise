package DataStructure;

public class ArrayList {


    private int[] array;
    private int size;

    public ArrayList() {
        array = new int[10];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size] = number;
        size++;
    }public int returnSize() {
        return size;
    }
    public void remove(int element) {
        int[] number = new int[size-1];
        int counter = 0;
        for (int count = 0 ; count < size; count++){
            if (array[count] != element){
                number[counter] = array[count];
                counter++;
            }
        }
        size--;
        this.array = number;
    }
    public void addElementInIndex(int index, int element) {
        for (int count = 0; count < array.length; count++) {
            if (count == index) {
                array[count] = element;
            }
        }
    }

    public int getElementInIndex(int index){
        return array[index];
    }

    public int getAddedElement(int element) {
        int newElement = 0;
        for (int count = 0; count < size; count++) {
            if (array[count] == element) {
                newElement = array[count];
            }
        }
        return newElement;
    }

    public void removeElementInIndex(int index) {
        int[] number = new int[size-1];
        int counter = 0;
        for (int count = 0 ; count < size; count++){
            if (count != index){
                number[counter] = array[count];
                counter++;
            }
        }
        size--;
        this.array = number;
    }

    public boolean contains(int element){
        for (int count = 0 ; count < size; count++){
            if (array[count] == element){
                return true;
            }
        }
        return false;
    }

    public int lastIndexOf(int element){
        int lastIndex = 0;
        for (int count = 0 ;count < size; count++){
            if (array[count] == element){
                lastIndex = count;
            }
        }
        return lastIndex;
    }

    public int indexOf(int element){
        int index = 0;
        for (int count = 0 ;count < size; count++){
            if (array[count] == element){
                index = count;
                break;
            }
        }
        return index;
    }

    public int[] toArray() {
        int[] newArray = new int[size];
        for (int count = 0 ; count < size; count++){
            newArray[count] = array[count];
        }
        return newArray;
    }
}
