package com.fisa.yugiohapp.dto;

import java.util.ArrayList;
import java.util.List;

public class Datum{
    public int id;
    public String name;
    public String type;
    public String frameType;
    public String desc;
    public int atk;
    public int def;
    public int level;
    public String race;
    public String attribute;
    public String archetype;
    public List<CardSet> card_sets;
    public List<CardImage> card_images;
    public List<CardPrice> card_prices;
    public int linkval;
    public List<String> linkmarkers;

    public Datum() {
    }

    public Datum(int id, String name, String type, String frameType, String desc, int atk, int def, int level, String race, String attribute, String archetype, ArrayList<CardSet> card_sets, ArrayList<CardImage> card_images, ArrayList<CardPrice> card_prices, int linkval, ArrayList<String> linkmarkers) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.frameType = frameType;
        this.desc = desc;
        this.atk = atk;
        this.def = def;
        this.level = level;
        this.race = race;
        this.attribute = attribute;
        this.archetype = archetype;
        this.card_sets = card_sets;
        this.card_images = card_images;
        this.card_prices = card_prices;
        this.linkval = linkval;
        this.linkmarkers = linkmarkers;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getArchetype() {
        return archetype;
    }

    public void setArchetype(String archetype) {
        this.archetype = archetype;
    }

    public List<CardSet> getCard_sets() {
        return card_sets;
    }

    public void setCard_sets(List<CardSet> card_sets) {
        this.card_sets = card_sets;
    }

    public List<CardImage> getCard_images() {
        return card_images;
    }

    public void setCard_images(List<CardImage> card_images) {
        this.card_images = card_images;
    }

    public List<CardPrice> getCard_prices() {
        return card_prices;
    }

    public void setCard_prices(List<CardPrice> card_prices) {
        this.card_prices = card_prices;
    }

    public int getLinkval() {
        return linkval;
    }

    public void setLinkval(int linkval) {
        this.linkval = linkval;
    }

    public List<String> getLinkmarkers() {
        return linkmarkers;
    }

    public void setLinkmarkers(List<String> linkmarkers) {
        this.linkmarkers = linkmarkers;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", frameType='" + frameType + '\'' +
                ", desc='" + desc + '\'' +
                ", atk=" + atk +
                ", def=" + def +
                ", level=" + level +
                ", race='" + race + '\'' +
                ", attribute='" + attribute + '\'' +
                ", archetype='" + archetype + '\'' +
                ", card_sets=" + card_sets +
                ", card_images=" + card_images +
                ", card_prices=" + card_prices +
                ", linkval=" + linkval +
                ", linkmarkers=" + linkmarkers +
                '}';
    }
}
