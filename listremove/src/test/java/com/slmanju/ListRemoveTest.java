package com.slmanju;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveTest {

  @Test
  public void testStringListRemove() {
    List<String> list = new ArrayList<>();
    list.add("AB");
    list.add("CD");
    list.add("CD");
    list.add("EF");

    list.remove("CD");

    Assertions.assertEquals(2, list.size());
  }

  @Test
  public void testRemovePatient() {
    List<Patient> list = new ArrayList<>();
    Patient nameA = new Patient(1, "NameA");
    list.add(nameA);
    list.add(new Patient(2, "NameB"));
    list.add(new Patient(3, "NameC"));

    list.remove(nameA);

    Assertions.assertEquals(2, list.size());
  }
}
