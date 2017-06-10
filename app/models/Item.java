package models;

import com.fasterxml.jackson.databind.JsonNode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.inject.Inject;
import play.db.Database;
import play.libs.Json;

public class Item {

    public String id, descricao, pronto;

    private Database db;

    @Inject
    public Item(Database db) {
        this.db = db;
    }

    public JsonNode all() {
        ArrayList<HashMap<String, String>> lista = new ArrayList<>();
        try {
            Connection c = db.getConnection();
            ResultSet rs = c.createStatement().executeQuery("select * from todo");
            while (rs.next()) {
                HashMap<String, String> map = new HashMap<>();
                for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
                    map.put(rs.getMetaData().getColumnName(i), rs.getString(i));
                }
                lista.add(map);
            }
            rs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Json.toJson(lista);
    }

    public JsonNode byID(String id) {
        ArrayList<HashMap<String, String>> lista = new ArrayList<>();
        try {
            Connection c = db.getConnection();
            ResultSet rs = c.createStatement().executeQuery("select * from todo where id='" + id + "'");
            while (rs.next()) {
                HashMap<String, String> map = new HashMap<>();
                for (int i = 1; i < rs.getMetaData().getColumnCount(); i++) {
                    map.put(rs.getMetaData().getColumnName(i), rs.getString(i));
                }
                lista.add(map);
            }
            rs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Json.toJson(lista.get(0));
    }

    public void insert() {
        try {
            Connection c = db.getConnection();
            PreparedStatement ps = c.prepareStatement("insert into todo (descricao,pronto) values(?,?)");
            ps.setString(1, this.descricao);
            ps.setString(2, this.pronto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void edit() {
        try {
            Connection c = db.getConnection();
            PreparedStatement ps = c.prepareStatement("update todo set descricao=?,pronto=? where id=?");
            ps.setString(1, this.descricao);
            ps.setString(2, this.pronto);
            ps.setString(3, this.id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void delete() {
        try {
            Connection c = db.getConnection();
            PreparedStatement ps = c.prepareStatement("delete from todo where id=?");
            ps.setString(1, this.id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
