import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("../../Downloads/Толстой Лев - Анна Каренина");
        FileRenamer renamer = new FileRenamer();
        Files.walkFileTree(path, renamer);
    }
}
