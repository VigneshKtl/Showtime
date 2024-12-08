import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task.ShowTime.Entity.Payment;
import com.Task.ShowTime.Repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	PaymentRepository paymentrepository;
    public Payment processPayment(Long bookingId, Double amount) {
        Payment payment = new Payment();
        payment.setBookingId(bookingId);
        payment.setTransactionId(UUID.randomUUID().toString()); // Generate unique transaction ID
        payment.setPaymentStatus("SUCCESS"); // Assume payment is successful for now
        payment.setPaymentDateTime(LocalDateTime.now());

        // Save payment details to the database (if needed)
        paymentrepository.save(payment);

        return payment;
    }
}