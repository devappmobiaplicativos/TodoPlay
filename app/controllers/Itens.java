package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javax.inject.Inject;
import models.Item;
import play.*;
import play.db.*;
import play.mvc.*;
import play.libs.Json;

public class Itens extends Controller {

    private Database db;

    @Inject
    public Itens(Database db) {
        this.db = db;
    }

    public Result index() throws Exception {
        return ok((JsonNode)new Item(db).all());
    }
    
    public Result delete(String id) throws Exception {
        Item item = new Item(db);
        item.id = id;
        item.delete();
        return ok();
    }
    
    public Result insert() throws Exception {
        Item item = new Item(db);
        item.descricao = request().body().asJson().get("descricao").asText();
        item.pronto = request().body().asJson().get("pronto").asText();
        item.id = item.insert();
        return ok(item.id);
    }
    
    public Result edit() throws Exception {
        Item item = new Item(db);
        item.id = request().body().asJson().get("id").asText();
        item.descricao = request().body().asJson().get("descricao").asText();
        item.pronto = request().body().asJson().get("pronto").asText();
        item.edit();
        return ok();
    }

    public Result concluir(String id, boolean pronto) throws Exception {
        Item item = new Item(db);
        item.id = id;
        item.pronto = String.valueOf(pronto);
        item.concluir();
        return ok();
    }
}
