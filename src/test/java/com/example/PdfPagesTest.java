package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class PdfPagesTest {
    @TempDir
    Path dir;

    @Test
    void countsThePages() throws IOException {
        File file = dir.resolve("three.pdf").toFile();
        try (PDDocument document = new PDDocument()) {
            for (int i = 0; i < 3; i++) {
                document.addPage(new PDPage());
            }
            document.save(file);
        }

        assertEquals(3, PdfPages.count(file));
    }
}
