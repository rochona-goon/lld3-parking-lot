package Services.Bill;

import Models.Bill;

public interface BillService {
    Bill generateBill(int ticketId, int gateId);
}
