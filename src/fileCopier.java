import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class fileCopier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking file name input.
        System.out.println("Enter file name: ");
        String fName = input.nextLine();

        // Taking input path where file is located.
        System.out.print("Enter the source file path: ");
        String src = input.nextLine();

        src = src+"\\"+fName;

        // Taking path input where file is located from user
        System.out.print("Enter the destination file path: ");
        String dst = input.nextLine();

        dst = dst+"\\"+fName;

        File destinationFile = new File(dst);
        int i = 2;
        while (destinationFile.exists()) {
            String dstName = dst.substring(0, dst.lastIndexOf("."));
            String dstExt = dst.substring(dst.lastIndexOf("."));
            String fileName = fName.substring(0,fName.indexOf("."));
            dst = fileName + "-copy" + "(" + i + ")" + dstExt;
            destinationFile = new File(dst);
            i++;
        }

        try {
            Path sourcePath = Paths.get(src);
            Path destinationPath = Paths.get(dst);
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully, new file name: " + dst);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}