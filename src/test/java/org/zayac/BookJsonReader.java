package org.zayac;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.IOException;

public class BookJsonReader {
    @Test
    void BookJsonReader () throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File bookjsonefile = new File("src/test/resources/file.json");
        Book book = objectMapper.readValue(bookjsonefile, Book.class);
        assertThat(book.getCreditLimit()).isEqualTo(100000000);
        assertThat(book.getClient_name()).isEqualTo("Vigo");
        assertThat(book.getItems()).contains("car");

    }
}
