package Repositories.Bill;

import Models.Bill;

import java.util.HashMap;
import java.util.Optional;

public class InMemoryBillRepo implements BillRepository{
    private HashMap<Integer, Bill> billsMap;
    private static int idCounter = 0;

    public InMemoryBillRepo(){
        this.billsMap = new HashMap<>();
    }

    @Override
    public Optional<Bill> getBillById(int billId) {
        return Optional.ofNullable(this.billsMap.get(billId));
    }

    @Override
    public Bill saveBill(Bill bill) {
        if(bill.getId() == 0){
            bill.setId(++idCounter);
        }
        this.billsMap.put(bill.getId(), bill);
        return bill;
    }
}
