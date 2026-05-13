package Services.Bill;

import Exceptions.GateNotFoundException;
import Exceptions.TicketNotAvailable;
import Models.Bill;
import Models.Gate;
import Models.Ticket;
import Repositories.Bill.BillRepository;
import Repositories.Gate.GateRepository;
import Repositories.Ticket.TicketRepository;
import Strategies.PricingFactory;
import Strategies.Pricing.PricingStrategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class BillServiceImpl implements BillService{
    private GateRepository gateRepo;
    private TicketRepository ticketRepo;
    private BillRepository billRepo;
    private PricingFactory pricingFactory;

    public BillServiceImpl(TicketRepository ticketRepo,
                           BillRepository billRepo,
                           PricingFactory pricingFactory,
                           GateRepository gateRepo){
        this.ticketRepo = ticketRepo;
        this.billRepo = billRepo;
        this.pricingFactory = pricingFactory;
        this.gateRepo = gateRepo;
    }
    @Override
    public Bill generateBill(int ticketNumber, int gateId) {


        Optional<Gate> optGate = this.gateRepo.findByGateId(gateId);

        if(optGate.isEmpty()){
            throw new GateNotFoundException("Gate not found.");
        }
        Gate exitGate = optGate.get();

        Optional<Ticket> optTicket = this.ticketRepo.fetchTicketById(ticketNumber);

        if(optTicket.isEmpty()){
            throw new TicketNotAvailable("Ticket not available.");
        }
        Ticket ticket = optTicket.get();

        // Calculate the price
        Date exitTime = new Date();
        PricingStrategy pricingStrategy = pricingFactory.getPricingStrategy(ticket.getVehicle().getVehicleType());

        long totalPrice = pricingStrategy.priceAmount(ticket.getEntryTime(), exitTime);

        Bill bill = new Bill();
        bill.setTicket(ticket);
        bill.setExitGate(exitGate);
        bill.setAmount(totalPrice);
        bill.setExitTime(exitTime);
        bill.setOperatorId(exitGate.getOperator().getEmployeeId());
        bill.setPayments(new ArrayList<>()); // Bill not paid yet

        billRepo.saveBill(bill);

        return bill;
    }
}
