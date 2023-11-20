package DataStructure;

public class MySet {

    private int size;
    private ArrayList list = new ArrayList();
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(int element) {
        if(!(list.contains(element))){
            list.add(element);
        }
    }
    public boolean contains(int element) {
        return list.contains(element);
    }
    public void iterator() {
        for (int count = 0;count < list.returnSize();count++){
            System.out.println(list.getElementInIndex(count));
        }
    }

    public boolean remove(int element){
        for (int count = 0 ; count < list.returnSize();count++){
            if (list.getElementInIndex(count) == element){
                return true;
            }
        }
        return false;
    }

    public int returnSize() {
        return list.returnSize();
    }

    public int[] toArray() {
        return list.toArray();
    }
}
