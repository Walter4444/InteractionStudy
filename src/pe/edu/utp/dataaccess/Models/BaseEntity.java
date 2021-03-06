package pe.edu.utp.dataaccess.Models;

import java.sql.Connection;

/**
 * Created by Usuario on 17/06/2017.
 */
public class BaseEntity {
    private Connection connection;
    private static String BASE_QUERY = "SELECT * FROM ";
    private String tableName;

    public BaseEntity(Connection connection) {
        this.connection = connection;
    }
    public BaseEntity(Connection connection, String tableName){
        this.connection = connection;
        this.tableName = tableName;
    }


    public BaseEntity() {
    }

    public Connection getConnection() {
        return connection;
    }

    public BaseEntity setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public String getTableName() {
        return tableName;
    }

    public BaseEntity setTableName(String tableName) {
        this.tableName = tableName;
        return this;

    }

    public String getDefaultQuery(){
        return BASE_QUERY + getTableName();
    }
}
