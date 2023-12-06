# Installation

## Step 01 - Install Docker

```
brew update
brew install --cask docker
```

## Step 02 - Pull and Install Mysql Image
Certainly! To instruct students on how to create a new database named `myFirstSql` using the `amd64/mysql:latest` Docker image, follow these steps. This assumes that students have Docker installed on their machines and are familiar with basic Docker and terminal commands.

### Step-by-Step Instructions:

1. **Pull the MySQL Docker Image**:
    - Open the terminal.
    - Run the following command to pull the latest MySQL image:
      ```bash
      docker pull mysql:latest
      ```

2. **Run the MySQL Container**:
    - Start a MySQL container with the following command. This also sets the root password (in this case, to `my-secret-pw`). Students should replace this password with a secure one.
```bash
docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -p 3306:3306 -d mysql:latest
```
-
- This command starts a new container named `my-mysql`, sets the environment variable `MYSQL_ROOT_PASSWORD`, and runs it in detached mode.




## Step 04 - Install Workbench

```
brew install --cask mysqlworkbench
```


# Example

Certainly! Below is a simple Java program that connects to a MySQL database named `PhoneBook` running on `localhost:3306` using the root user and the specified password. It then fetches all contacts from a table named `contacts`. This example assumes the `contacts` table has the columns `firstName`, `lastName`, `nickname`, `phone`, and `email`.

Here's the Java program:

```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoadContacts {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/PhoneBook";
        String user = "root";
        String password = "my-secret-pw";

        try {
            // Establishing connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");

            // Creating a statement
            Statement stmt = conn.createStatement();

            // Executing the query
            String query = "SELECT firstName, lastName, nickname, phone, email FROM contacts";
            ResultSet rs = stmt.executeQuery(query);

            // Processing the result set
            while (rs.next()) {
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String nickname = rs.getString("nickname");
                String phone = rs.getString("phone");
                String email = rs.getString("email");

                System.out.println(firstName + " " + lastName + " (" + nickname + ") - " + phone + ", " + email);
            }

            // Closing resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
```
