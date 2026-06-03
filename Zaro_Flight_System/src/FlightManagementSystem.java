import java.sql.*;

public class FlightManagementSystem {

    public boolean addFlight(Flight flightObj) {

        boolean status = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/flight",
                    "root",
                    "Tharik@007");

            PreparedStatement ps =
                    con.prepareStatement("INSERT INTO Flight VALUES(?,?,?,?,?)");

            ps.setInt(1, flightObj.getFlightId());
            ps.setString(2, flightObj.getSource());
            ps.setString(3, flightObj.getDestination());
            ps.setInt(4, flightObj.getNoOfSeats());
            ps.setDouble(5, flightObj.getFlightFare());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}