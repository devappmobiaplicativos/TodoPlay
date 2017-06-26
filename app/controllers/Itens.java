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
import java.util.*;

public class Itens extends Controller {

    private Database db;

    @Inject
    public Itens(Database db) {
        this.db = db;
    }

    public Result index() throws Exception {
        return ok((JsonNode)new Item(db).all());
    }

    public Result delete() throws Exception {
        Item item = new Item(db);
        JsonNode body = request().body().asJson();
        item.id = body.get("id").textValue();
        item.delete();
        return ok();
    }

    public Result insert() throws Exception {
        Item item = new Item(db);
        JsonNode body = request().body().asJson();
        item.descricao = body.get("descricao").textValue();
        item.pronto = body.get("pronto").textValue();
        item.insert();
        return ok();
    }

    public Result edit() throws Exception {
        Item item = new Item(db);
        JsonNode body = request().body().asJson();
        item.descricao = body.get("descricao").textValue();
        item.pronto = body.get("pronto").textValue();
        item.id = body.get("id").textValue();
        item.edit();
        return ok();
    }
}
