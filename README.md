# lld3-parking-lot

Parking Lot System - LLD

A clean-code implementation of a Parking Lot system using Java, focusing on SOLID principles and design patterns.

🚀 **Recent Updates**

* Bill Generation Flow: Implemented a full flow from BillController through BillService to generate bill against a parking ticket.

* Repository Pattern: Added InMemory repository for Bill to decouple data storage from business logic.

* Strategy Pattern: Migrated pricing logic for different vehicle types to a dedicated Strategies.Pricing package.

🛠️ **System Architecture**
Design Patterns Used

**Strategy Pattern:** Used for vehicle parking price allocation. Currently, supports:

* BikePricingStrategy: Calculates parking price for a Bike based on its entry time and exit time in the parking lot.

* CarPricingStrategy: Calculates parking price for a Car based on its entry time and exit time in the parking lot.

* TruckPricingStrategy: Calculates parking price for a Truck based on its entry time and exit time in the parking lot.


**Controller-Service-Repository Pattern:** 
Ensures clear separation of concerns.

**DTO (Data Transfer Objects):** 
Used GenerateBillRequest and GenerateBillResponse to prevent exposing internal models to the client.

**Core Entity**

* Bill: The central entity containing Ticket ,Exit gate, exit time information;

🚦 **Features**

* Bill Generation with automated price calculation.
 
* Support for multiple vehicle types (Car, Bike, Truck).

* Custom Exception handling of TicketNotAvailable for invalid ticket.
