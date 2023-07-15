package com.fisa.yugiohapp.serviceRestInterfaces;


import com.fisa.yugiohapp.dto.ArchetypeDto;
import com.fisa.yugiohapp.dto.Root;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface ApiServiceRest {

    @POST("v7/archetypes.php")
    Call<List<ArchetypeDto>> getArchetypes();
    @POST("v7/cardinfo.php?")
    Call<JsonObject> getCards(@Query("archetype") String nameArchetype);

}
