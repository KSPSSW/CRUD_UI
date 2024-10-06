/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.werapan.databaseproject.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kissa
 */
public class Material {

    public static Material fromRS(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private int id;
    private String name;
    private int quantity;
    private Date in_date;
    private Date expire_date;
    private int stock_id;

    public Material(int id, String name, int quantity, Date in_date, Date expire_date, int stock_id) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.in_date = in_date;
        this.expire_date = expire_date;
        this.stock_id = stock_id;
    }

    public Material(String name, int quantity, Date in_date, Date expire_date, int stock_id) {
        this.id = -1;
        this.name = name;
        this.quantity = quantity;
        this.in_date = in_date;
        this.expire_date = expire_date;
        this.stock_id = stock_id;
    }

    public Material() {
        this.id = -1;
        this.name = "";
        this.quantity = 0;
        this.in_date = null;
        this.expire_date = null;
        this.stock_id = -1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getIn_date() {
        return in_date;
    }

    public void setIn_date(Date in_date) {
        this.in_date = in_date;
    }

    public Date getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    @Override
    public String toString() {
        return "Matererial{" + "id=" + id + ", name=" + name + ", quantity=" + quantity + ", in_date=" + in_date + ", expire_date=" + expire_date + ", stock_id=" + stock_id + '}';
    }
    
    public static Material fromRs(ResultSet rs){
        Material material = new Material();
        try {
            material.setId(rs.getInt("mat_id"));
            material.setName(rs.getString("mat_name"));
            material.setQuantity(rs.getInt("mat_quantity"));
            material.setIn_date(rs.getDate("mat_indate"));
            material.setExpire_date(rs.getDate("mat_expiredate"));
            material.setId(rs.getInt("stock_id"));
        } catch(SQLException ex){
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return material;
    }
}
     
