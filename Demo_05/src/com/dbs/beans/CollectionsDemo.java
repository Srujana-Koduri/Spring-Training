package com.dbs.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CollectionsDemo {
    List<String> books;
    Set<String> emails;
    Map<Integer, String> empData;
}
