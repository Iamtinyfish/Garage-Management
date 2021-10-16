package com.tfgarage.garagemanagement.controller.dao;

import com.tfgarage.garagemanagement.controller.utils.MySQLConnUtils;

import javax.naming.NamingException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO implements Serializable {
    public boolean checkLogin(String username, String password) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = MySQLConnUtils.getMySQLConnection();
            if (con != null) {
                String sql = "Select * From account Where username = ? And password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1,username);
                stm.setString(2,password);

                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) rs.close();
            if (stm != null) stm.close();
            if (con != null) con.close();
        }
        return false;
    }
}
