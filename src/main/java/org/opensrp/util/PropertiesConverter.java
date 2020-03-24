package org.opensrp.util;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.opensrp.domain.LocationProperty;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class PropertiesConverter implements JsonSerializer<LocationProperty>, JsonDeserializer<LocationProperty> {

	public static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HHmm").create();

	@Override
	public JsonElement serialize(LocationProperty locationProperty, Type type,
			JsonSerializationContext jsonSerializationContext) {
		JsonObject object = gson.toJsonTree(locationProperty).getAsJsonObject();
		if (locationProperty.getCustomProperties() != null) {
			for (Map.Entry<String, String> entryset : locationProperty.getCustomProperties().entrySet()) {
				object.addProperty(entryset.getKey(), entryset.getValue());
			}
		}
		return object;
	}

	@Override
	public LocationProperty deserialize(JsonElement json, Type type,
			JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

		LocationProperty properties = gson.fromJson(json, LocationProperty.class);

		Set<Map.Entry<String, JsonElement>> entrySet = json.getAsJsonObject().entrySet();
		Set<String> mappedkeys = new HashSet<>();
		for (Field field : LocationProperty.class.getDeclaredFields()) {
			mappedkeys.add(field.getName());
		}
		for (Map.Entry<String, JsonElement> entry : entrySet) {
			if (!mappedkeys.contains(entry.getKey())) {
				properties.getCustomProperties().put(entry.getKey(), entry.getValue().getAsString());
			}
		}

		return properties;
	}
}
