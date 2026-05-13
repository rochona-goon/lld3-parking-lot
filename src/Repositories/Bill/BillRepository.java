package Repositories.Bill;

import Models.Bill;

import java.util.Optional;

public interface BillRepository {
    Optional<Bill> getBillById(int billId);

    Bill saveBill(Bill bill);
}
