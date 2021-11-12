package com.tfgarage.controller.dao;

import com.tfgarage.controller.utils.MySQLConnUtils;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.naming.NamingException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

public class AccountDAO {
    public boolean checkLogin(String username, String password) throws SQLException, NamingException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        String hashPassword = null;
        String salt = null;
        try {
            con = MySQLConnUtils.getMySQLConnection();
            if (con != null) {
                String sql = "Select * From account Where username = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1,username);

                rs = stm.executeQuery();
                if (rs.next()) {
                    hashPassword = rs.getString("password");
                    salt = rs.getString("salt");
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) rs.close();
            if (stm != null) stm.close();
            if (con != null) con.close();
        }
        assert hashPassword != null;
        assert salt != null;
        return hashPassword.equals(hash(password, salt));
    }

    private String hash(String password, String salt) {
        Base64.Encoder enc = Base64.getEncoder();
        Base64.Decoder dec = Base64.getDecoder();
        KeySpec spec = new PBEKeySpec(password.toCharArray(), dec.decode(salt), 65536, 128);
        SecretKeyFactory f;
        byte[] hash = new byte[0];
        try {
            f = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            hash = f.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
        return enc.encodeToString(hash);
    }
}
