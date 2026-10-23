package com.example;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;

/** Facts about PDF files. */
public final class PdfPages {
    private PdfPages() {
    }

    /** The number of pages of the PDF in {@code file}. */
    public static int count(File file) throws IOException {
        try (PDDocument document = PDDocument.load(file)) {
            return document.getNumberOfPages();
        }
    }
}
