import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileRenamer extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        String folderNumber = file.getParent().getFileName().toString().substring(1);
        String fileName = file.getFileName().toString();

        if (fileName.substring(1).length() < 7) {
            StringBuilder builder = new StringBuilder(fileName.charAt(0)).append(folderNumber).append(fileName.substring(1));
            System.out.println(builder.toString());
            File newFile = new File(builder.toString());
            file.toFile().renameTo(newFile);
        }
        return FileVisitResult.CONTINUE;
    }
}
