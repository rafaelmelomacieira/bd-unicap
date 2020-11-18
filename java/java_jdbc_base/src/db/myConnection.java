package db;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class myConnection {
    private Properties props;

    public myConnection() throws FileNotFoundException, IOException {
        this.props = new Properties();
        String userDirectory = new File("").getAbsolutePath();
        FileInputStream file = new FileInputStream(userDirectory + "/src/config/db_config.properties");
        props.load(file);
    }

    public Connection getPostgresConn() throws SQLException, ClassNotFoundException {

        Class.forName("com.postgres.jdbc.Driver");
        String host = "jdbc:postgresql://" + props.getProperty("host");
        return DriverManager.getConnection(host, props);
    }
}
