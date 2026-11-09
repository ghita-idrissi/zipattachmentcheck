
# ZIP Attachment Check

## 1. Application Description

ZIP Attachment Check is a simple web application developed using Java, Spring Boot, and Thymeleaf.

The application helps users check whether a file is suitable for sending via email by entering its filename and size in megabytes (MB).

It checks two conditions:
- File size: If the file is larger than 25 MB, the application displays a warning recommending uploading it to the cloud.
- File extension: If the filename contains ".exe", the application displays a security warning.

If neither condition is met, the application displays a message confirming that the file is safe to send.

## 2. Technologies Used

- Java
- Spring Boot
- Spring Web
- Thymeleaf
- HTML and CSS
- Maven

## 3. How to Run the Application

1. Clone or download the project from GitHub.
2. Open the project in IntelliJ IDEA.
3. Make sure Java is installed.
4. Wait for Maven to download the required dependencies.
5. Open `ZipAttachmentCheckApplication.java`.
6. Run the application using the main method.
7. Open your web browser and visit:

   http://localhost:8080

## 4. How to Use the Application

1. Enter the filename in the "File name" field.
2. Enter the file size in MB in the "File size" field.
3. Click the "Check" button.
4. Read the result displayed below the form.

## 5. Example Results

| Filename | Size | Result |
|---|---:|---|
| photos.zip | 5 MB | It is safe to send. |
| photos.exe.zip | 5 MB | It may contain a program. |
| documents.zip | 30 MB | The file is too large to be sent via email. |

## 6. Application Logic

The application checks the file size first. If the size is greater than 25 MB, it displays the file-size warning.

Otherwise, it checks whether the filename contains ".exe".

If neither condition is true, the file is considered safe to send.

---

Developed by: Ghita Azami Idrissi
