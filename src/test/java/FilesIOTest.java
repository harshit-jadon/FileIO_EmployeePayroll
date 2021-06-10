
import com.bridgelabz.fileio.FileUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class FilesIOTest {
    private static  String HOME = System.getProperty("user.home");
    private static String PLAY_WITH_NIO = "TempPlayGround";

    @Test    //Check File Exists
    public void givenPath_WhenCheckFileExists_ShouldReturnTrue() {
        Path homePath = Paths.get(HOME);
        Assert.assertTrue(Files.exists(homePath));
    }
    @Test    // Delete File and Check File Not Exist
    public void givenPath_WhenDeleteFileAndCheckIfFileExists_ShouldReturnTrue() {
        Path playPath = Paths.get(HOME + PLAY_WITH_NIO);
        if(Files.exists(playPath)) FileUtils.deleteFiles(playPath.toFile());
        Assert.assertTrue(Files.notExists(playPath));
    }

    @Test
    public void givenPath_WhenCreateNewDirectory_ShouldReturnTrue() throws IOException {
        Path playPath = Paths.get(HOME + PLAY_WITH_NIO);
        Files.createDirectory(playPath);
        Assert.assertTrue(Files.exists(playPath));
    }

    @Test
    public void givenPath_WhenCreateNewFile_ShouldReturnTrue() {
        Path playPath = Paths.get(HOME + PLAY_WITH_NIO);
        IntStream.range(1,10).forEach(counter ->{
            Path tempFile = Paths.get((playPath + "/temp "+ counter));
            Assert.assertTrue(Files.notExists(tempFile));
            try{
                Files.createFile(tempFile);}
            catch(IOException e){
                Assert.assertTrue((Files.exists(tempFile)));
            }
        });
    }

    @Test
    public void givenPath_WhenListFilesWithExtension_ShouldReturnTrue() throws IOException {
        Path playPath = Paths.get(HOME + PLAY_WITH_NIO);
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        Files.newDirectoryStream(playPath, path -> path.toFile().isFile() &&
                                                    path.toString().startsWith("temp"))
                                                    .forEach(System.out::println);
    }
}
