package Controllers;

import DTOs.Bill_DTOs.BillResponseStatus;
import DTOs.Bill_DTOs.GenerateBillRequest;
import DTOs.Bill_DTOs.GenerateBillResponse;
import Models.Bill;
import Services.Bill.BillService;

public class BillController {

    private BillService billService;

    public BillController(BillService billService){
        this.billService = billService;
    }

    public GenerateBillResponse generateBill(GenerateBillRequest request){
        GenerateBillResponse response = new GenerateBillResponse();

        try{
            Bill bill = this.billService.generateBill(request.getTicket().getTicketNumber(), request.getGateId());
            response.setBill(bill);
            response.setTotalAmount(bill.getAmount());
            response.setVehicleNumber(bill.getTicket().getVehicle().getVehicleNumber());
            response.setBillResponseStatus(BillResponseStatus.SUCCESS);

        } catch (Exception e) {
            response.setBillResponseStatus(BillResponseStatus.FAILURE);
        }

        return response;

    }
}
