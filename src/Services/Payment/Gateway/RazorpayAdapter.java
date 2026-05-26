package Services.Payment.Gateway;

import Enums.PaymentStatus;
import Integrations.Razorpay;

public class RazorpayAdapter implements PaymentGateway{
    private Razorpay razorpay;

    public RazorpayAdapter(Razorpay razorpay){
        this.razorpay = razorpay;
    }
    @Override
    public PaymentResponse makePayment(long amount, int billId) {
        PaymentResponse response = new PaymentResponse();

        try{
            String transactionId = this.razorpay.createPayment((double) amount);

            response.setTransactionId(transactionId);
            response.setPaymentStatus(PaymentStatus.COMPLETED);
        } catch (Exception e) {
            response.setPaymentStatus(PaymentStatus.FAILED);
        }

        return response;
    }
}
