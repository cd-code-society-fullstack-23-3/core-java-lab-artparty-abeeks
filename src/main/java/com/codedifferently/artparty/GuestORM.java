package com.codedifferently.artparty;

import java.sql.*;

//FIRST
//object relation mapper
//CRUD
public class GuestORM {
    private Connection conn;

    // Constructor
    public GuestORM(Connection conn) {
        this.conn = conn;
    }
    // Create (Insert)
    public void createGuest(Guest guest) {
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO guest (email, firstName, lastName) VALUES (?, ?, ?)");
            ps.setString(1, guest.getEmail());
            ps.setString(2, guest.getFirstName());
            ps.setString(3, guest.getLastName());
            ps.executeUpdate();
        } catch (SQLException e) {
            // Handle exception
        }
    }
    // Read (Select)
    public Guest readGuest(Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM invites WHERE id = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Guest(rs.getString("firstName"), rs.getString("lastName"), rs.getString("email"));
            }
        } catch (SQLException e) {
            // Handle exception
        }
        return null;
    }
    // Update
    public void updateGuest(Guest guest) {
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE invites SET email = ?, firstName = ?, lastName = ? WHERE id = ?");
            ps.setString(1, guest.getEmail());
            ps.setString(2, guest.getFirstName());
            ps.setString(3, guest.getLastName());
            ps.setLong(4, guest.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            // Handle exception
        }
    }
    // Delete
    public void deleteGuest(Long id) {
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM invites WHERE id = ?");
            ps.setLong(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            // Handle exception
        }
    }
}