package com.fisa.yugiohapp.dto;

public class ArchetypeDto {


    private static final long serialVersionUID = 1L;
    private String archetype_name;


    public ArchetypeDto() {
    }

    public String getArchetype_name() {
        return archetype_name;
    }

    public void setArchetype_name(String archetype_name) {
        this.archetype_name = archetype_name;
    }

    @Override
    public String toString() {
        return "ArchetypeDto{" +
                "archetype_name='" + archetype_name + '\'' +
                '}';
    }
}
