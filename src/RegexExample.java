import java.util.ArrayList;

public class RegexExample {


    public static String[] regex(String[] arrayInput) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String element : arrayInput){
            if (element.toUpperCase().matches("^C")){
                arrayList.add(element);
            }
        }
        return toArray(arrayList);
    }

    private static String[] toArray(ArrayList<String> arrayList) {
        String [] result = new String[arrayList.size()];
        for (int element = 0; element < arrayList.size(); element++){
            result[element] = arrayList.get(element);
        }
        return result;
    }
}
