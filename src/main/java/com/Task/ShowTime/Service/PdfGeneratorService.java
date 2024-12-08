import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Service;

@Service
public class PdfGeneratorService {

    public byte[] generateTicket(Long bookingId, String movieName, String theaterName, String showTime, List<String> seats) {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            PdfWriter writer = new PdfWriter(outputStream);
            PdfDocument pdfDoc = new PdfDocument(writer);
            Document document = new Document(pdfDoc);

            document.add(new Paragraph("Movie Ticket").setBold().setFontSize(18));
            document.add(new Paragraph("Booking ID: " + bookingId));
            document.add(new Paragraph("Movie Name: " + movieName));
            document.add(new Paragraph("Theater Name: " + theaterName));
            document.add(new Paragraph("Show Time: " + showTime));
            document.add(new Paragraph("Seats: " + String.join(", ", seats)));

            document.close();
            return outputStream.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException("Error generating ticket PDF", e);
        }
    }
}
