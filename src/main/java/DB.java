import org.sqlite.JDBC;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DB {
    private static final String CON_STR = "jdbc:sqlite:weather.db";
    private Connection connection;
    public DB() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(CON_STR);
        createTable();
    }
    private void createTable(){
        try (PreparedStatement statement = this.connection.prepareStatement(
                "CREATE TABLE IF NOT EXISTS Weathers (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "city TEXT NOT NULL," +
                        "localDate TEXT NOT NULL," +
                        "weatherText TEXT NOT NULL," +
                        "dayTemp REAL," +
                        "nightTemp REAL)" )){
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addDailyWeather(Daily daily) {
        Date date  = new Date( (Long) daily.getDt() * 1000 );
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        try (PreparedStatement statement = this.connection.prepareStatement(
                "INSERT INTO Weathers(`city`, `localDate`, `weatherText`, `dayTemp`, `nightTemp`) " +
                        "VALUES(?, ?, ?, ?,?)")) {
            statement.setObject(1, "Санкт-Петербург");
            statement.setObject(2, dateFormat.format(date));
            statement.setObject(3, daily.weather.get(0).getDescription());
            statement.setObject(4, daily.getTemp().getDay());
            statement.setObject(5, daily.getTemp().getNight());
            // Выполняем запрос
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void readWeather() {
        try (Statement statement = this.connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT id, city, localDate, weatherText, dayTemp, nightTemp FROM Weathers");
            while (resultSet.next()) {
                System.out.println("В городе " + resultSet.getString("city")
                        + " на дату " + resultSet.getString("localDate")
                        + " ожидается " + resultSet.getString("weatherText")
                        + ", температура"
                        +" днем " + resultSet.getLong("dayTemp")
                        +" ночью " + resultSet.getLong("nightTemp")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
