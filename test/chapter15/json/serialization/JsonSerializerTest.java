package chapter15.json.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static chapter15.json.serialization.Sex.*;
import static org.junit.jupiter.api.Assertions.*;

public class JsonSerializerTest {

    @Test
    public void testSerializer() {
        Person person = new Person();
        person.setName("Aramide");
        person.setDateOfBirth(LocalDate.now());
        person.setGender(MALE);
        person.setPhoneNumber("08105795528");

        String json = JsonSerializer.serialize(person);
        String expected = "{\"name\":\"Aramide\",\"dateOfBirth\":[2024,5,6],\"gender\":\"MALE\",\"phoneNumber\":\"08105795528\"}";
        assertEquals(expected, json);
    }

    @Test
    public void testDeserializer() throws JsonProcessingException {
        Person person = new Person("John", LocalDate.now(), MALE, "08105795528");
        String json = JsonSerializer.serialize(person);
        System.out.println("json: " + json);
        Person personFromJson  = JsonSerializer.deserialize(json);
        System.out.println("person from json: " + personFromJson);
        assertNotNull(personFromJson);
        assertEquals("John", personFromJson.getName());
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(MALE, personFromJson.getGender());
        assertEquals("08105795528", personFromJson.getPhoneNumber());
    }

}