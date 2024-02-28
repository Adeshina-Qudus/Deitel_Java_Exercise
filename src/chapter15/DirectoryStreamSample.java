package chapter15;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamSample {

    public static void main(String[] args) {

        String location = "C:\\Users\\USER\\IdeaProjects\\trying\\src\\chapter2";
        Path path = Path.of(location);
        try(DirectoryStream<Path> directoryStreamL =
                    Files.newDirectoryStream(path)){
            directoryStreamL.forEach(System.out::println);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
