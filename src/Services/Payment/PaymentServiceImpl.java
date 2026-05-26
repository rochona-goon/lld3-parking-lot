package Services.Payment;

import Enums.PaymentMode;
import Enums.PaymentStatus;
import Exceptions.PaymentBillNotFound;
import Models.Bill;
import Models.Payment;
import Repositories.Bill.BillRepository;
import Repositories.Payment.PaymentRepository;
import Services.Payment.Gateway.PaymentGateway;
import Services.Payment.Gateway.PaymentResponse;

import java.util.Optional;

public class PaymentServiceImpl implements PaymentService{
    private PaymentRepository paymentRepo;
    private BillRepository billRepo;
    private PaymentGateway paymentGateway;

    public PaymentServiceImpl(PaymentRepository paymentRepo,
                              BillRepository billRepo,
                              PaymentGateway paymentGateway){
        this.paymentRepo = paymentRepo;
        this.billRepo = billRepo;
        this.paymentGateway = paymentGateway;
    }

    @Override
    public Payment makePayment(int billId, PaymentMode mode) {

        Optional<Bill> optBill = billRepo.getBillById(billId);
        if(optBill.isEmpty()){
            throw new PaymentBillNotFound("Bill not found.");
        }
        Bill bill = optBill.get();


        Payment payment = new Payment();
        payment.setBill(bill);
        payment.setPaymentAmount((long)bill.getAmount());
        payment.setMode(mode);
        payment.setPaymentStatus(PaymentStatus.INITIATED);

        paymentRepo.savePayment(payment);


        PaymentResponse paymentResponse = this.paymentGateway.makePayment((long)bill.getAmount(), billId);

        if(paymentResponse.getTransactionId() != null){
            payment.setTransactionId(paymentResponse.getTransactionId());
        }

        if(paymentResponse.getPaymentStatus() == PaymentStatus.COMPLETED){
            payment.setPaymentStatus(PaymentStatus.COMPLETED);
        }else{
            payment.setPaymentStatus(PaymentStatus.FAILED);
        }

        paymentRepo.savePayment(payment);

        if(bill.getPayments() != null){
            bill.getPayments().add(payment);
        }

        return payment;
    }
}
