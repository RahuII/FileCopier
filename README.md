# FileCopier

1. input(file name) -- format: rahul.txt
2. input(file path) -- format: F:\Intenship\File Copier
3. input(destination path) -- format: F:\Intenship\File Copier

logic:
1. Create a new file using FILE class which is store in DESTINATION_FILE with same name conventions which is already exist in our system.
2. Take a variable int i and initialize with 2 (int i = 2;)
3. Run a loop until that file name is already exist in that location
4. Using substring method store file extension in fileExt variable.
5. Using substring method store file original file name expect file extension.
6. In destination string add our file name convension which we want in output with extension.
7. Update DESTINATION_FILE with our new file name convension.
8. Increment i by +1.

9. Under the try chatch block using the java NIO File class to copy a file form the source path(src) to the destination path(dest).
10. StandardCopyOption.REPLACE_EXISTING option is used to overwrite the destination file if it already exists. After the file is copied, a message is printed to the console to confirm that the file was copied successfully
<img width="960" alt="source code" src="https://user-images.githubusercontent.com/68543024/214286545-5aadde4a-3a40-49a4-9da8-b80dd7cda0b1.png">
<img width="960" alt="final result" src="https://user-images.githubusercontent.com/68543024/214286479-09d03bf6-8bd4-4429-9882-8b0a547ac309.png">
<img width="960" alt="output" src="https://user-images.githubusercontent.com/68543024/214286521-b4613f70-8be9-470a-a55a-60ea5bbb605c.png">
