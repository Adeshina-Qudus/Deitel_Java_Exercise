import chapter14.FileSample;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FileTest {


    @Test
    public void testCreateFile() {
        String filename = "sample.txt";
        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\files";
        FileSample.createFile(location, filename);
        Path path = Paths.get(location, filename);
        System.out.println(path);
        assertTrue(Files.exists(path));
    }
    @Test
    public void createDirectoryTest(){
        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\newDirectory";
        FileSample.createDirectory(location);
        Path path = Path.of(location);
        assertTrue(Files.exists(path));
    }
    @Test
    public void deleteDirectoryTest(){
        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\newDirectory";
        FileSample.deleteDirectory(location);
        Path path = Paths.get(location);
        assertFalse(Files.exists(path));
    }
    @Test
    public void deleteFileTest(){
        String fileName = "sample.txt";
        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\files";
        FileSample.deleteFile(location,fileName);
        Path path = Paths.get(location,fileName);
        assertFalse(Files.exists(path));
    }
}