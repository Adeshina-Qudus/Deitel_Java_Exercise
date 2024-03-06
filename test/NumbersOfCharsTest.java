import fmTask.NumbersOfChars;
import fmTask.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersOfCharsTest {


    @Test
    public void numbersOfCharsTests(){
        List<String> stringList = List.of("qudus","ayo","adeshina","femi");
        assertEquals(20, NumbersOfChars.numberOfChars(stringList));
    }

    @Test
    public void takeInListOfStringAndReturnLisOfUsersTest(){
        List<String> stringList = List.of("qudus","ayo","adeshina","femi");
        List<User> userList = NumbersOfChars.mapToUser(stringList);
        assertEquals(4,userList.size());
    }
}
