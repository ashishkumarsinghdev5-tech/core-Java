package StreamAplExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo17
{
    public static void main(String[] args) throws Exception
    {
     /*   FileReader fr = new FileReader("info.txt");
        BufferedReader br = new BufferedReader(fr);
        String line  = br.readLine();
        while (line!=null)
        {
            System.out.println(line);
            line = br .readLine();
        }
     br.close(); */
        // approach in java 8 feature
        String filename = "info.txt";
        List<String> lines = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(filename)))
        {

                 stream.forEach(line -> System.out.println(line));

        }
        catch (Exception e )
        {
            e.printStackTrace();
        }
    }
}
