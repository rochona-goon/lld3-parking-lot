package Controllers;

import DTOs.Payment_DTOs.PaymentRequestDTO;
import DTOs.Payment_DTOs.PaymentResponseDTO;
import DTOs.Payment_DTOs.PaymentResponseStatus;
import Models.Bill;
import Models.Payment;
import Services.Payment.PaymentService;

public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public PaymentResponseDTO makeParkingPayment(PaymentRequestDTO request){

        PaymentResponseDTO responseDTO = new PaymentResponseDTO();

        try{
            Payment payment = this.paymentService.makePayment(request.getBill().getId(), request.getPaymentMode());
            responseDTO.setPayment(payment.getPaymentID());
            responseDTO.setPaidAmount(payment.getPaymentAmount());
            responseDTO.setPaymentStatus(PaymentResponseStatus.SUCCESS);

        } catch (Exception e) {
            responseDTO.setPaymentStatus(PaymentResponseStatus.FAILURE);
        }

        return responseDTO;
    }
}
