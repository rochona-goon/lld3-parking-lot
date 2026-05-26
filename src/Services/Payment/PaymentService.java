package Services.Payment;

import Enums.PaymentMode;
import Models.Bill;
import Models.Payment;

public interface PaymentService {
    Payment makePayment(int billId, PaymentMode mode);
}
